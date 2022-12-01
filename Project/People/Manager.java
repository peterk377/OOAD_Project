//Object Oriented Analytics and Design Project
//Made by:  Piotr Kimmel B00087671
//          Samuel Khan B00123689
//          Noel Kelly B00132291
//          Daniel Ikomi B00147691

package People;

import OrderAndComplaints.*;

public final class Manager extends Person{

    private Complaint complaint;
    private Order order;

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

    public void refund(Order order){

        order.setOrderStatus(OrderStatus.Refunded);

    }

    @Override
    public String toString() {
        return  "Manager name='" + name +
                ", phoneNo='" + phoneNo;
    }
}
