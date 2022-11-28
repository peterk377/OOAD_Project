public class Driver extends Person {

    private boolean license;
    public Order order;

    public void collectCustomer(Order order){

        order.setOrderStatus("In Progress");

    }

    public void dropCustomer(Order order){

        order.setOrderStatus("Complete");

    }


}
