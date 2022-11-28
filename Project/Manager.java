public class Manager extends Person{

    private Complaint complaint;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phoneNo;
    }

    public void setPhone(String phone) {
        this.phoneNo = phone;
    }

    public void resolveComplaint(Complaint complaint){
        complaint.setResolved(true);
    }
     public void viewComplaint(Complaint complaint){
        complaint.getComplaint();
     }
}
