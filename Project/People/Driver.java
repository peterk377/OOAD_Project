//Object Oriented Analytics and Design Project
//Made by:  Piotr Kimmel B00087671
//          Samuel Khan B00123689
//          Noel Kelly B00132291
//          Daniel Ikomi B00147691

package People;

import OrderAndComplaints.*;

public final class Driver extends Person {

    private boolean license;
    public Order order;
    private double cost;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setPhone(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void collectCustomer(Order order){

        order.setOrderStatus(OrderStatus.InProcess);
        order.setDriverName(name);

    }

    public void dropCustomer(Order order){

        order.setOrderStatus(OrderStatus.Complete);
        collectPayment(order);

    }

    public void collectPayment(Order order){
        order.setWasPayed(true);
    }

    public void updatePrice(Order order){
        double price = order.getOrderCost() + cost;
        order.setOrderCost(price);
    }

}
