//Object Oriented Analytics and Design Project
//Made by:  Piotr Kimmel B00087671
//          Samuel Khan B00123689
//          Noel Kelly B00132291
//          Daniel Ikomi B00147691

package People;

import OrderAndComplaints.*;

public class Customer extends Person{

    private String homeAddress;
    private String cardNo;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhone(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getHomeAddress() {
        return this.homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "Customer name='" + name +", homeAddress='" + homeAddress +
                ", cardNo='" + cardNo + ", phoneNo='" + phoneNo;
    }

    public Order createOrder(){

        Order order = new Order();

        order.setCustomerName(name);
        order.setPickUpAddress("TUD Dublin Blanch");
        order.setDropOffAddress(homeAddress);

        return order;
    }

    public Complaint createComplaint(Order order){

        Complaint complaint = new Complaint();
        complaint.setComplaint("Driver was rude");

        return complaint;
    }
}
