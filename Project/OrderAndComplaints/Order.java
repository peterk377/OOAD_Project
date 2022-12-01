//Object Oriented Analytics and Design Project
//Made by:  Piotr Kimmel B00087671
//          Samuel Khan B00123689
//          Noel Kelly B00132291
//          Daniel Ikomi B00147691

package OrderAndComplaints;
import java.time.LocalDate;
import People.*;

public class Order{

    private Customer customer;
    private Driver driver;

    private String customerName;
    private String driverName;
    private String pickUpAddress;
    private String dropOffAddress;
    private int orderId;
    private double orderCost = 3.00;
    private boolean wasPayed = false;
    private LocalDate dateOfOrder = LocalDate.now();
    //private String orderStatus = "pending";
    private OrderStatus orderStatus = OrderStatus.Pending;

    public int getOrderId() {
        return this.orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getOrderCost() {
        return this.orderCost;
    }

    public void setOrderCost(double orderCost) {
        this.orderCost = orderCost;
    }

    public boolean isWasPayed() {
        return this.wasPayed;
    }

    public void setWasPayed(boolean wasPayed) {
        this.wasPayed = wasPayed;
    }

    public LocalDate getDateOfOrder() {
        return this.dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public OrderStatus getOrderStatus() {
        return this.orderStatus;
    }

    public String getPickUpAddress() {
        return this.pickUpAddress;
    }

    public void setPickUpAddress(String pickUpAddress) {
        this.pickUpAddress = pickUpAddress;
    }

    public String getDropOffAddress() {
        return this.dropOffAddress;
    }

    public void setDropOffAddress(String dropOffAddress) {
        this.dropOffAddress = dropOffAddress;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return  "orderId=" + orderId + ", dateOfOrder=" + dateOfOrder +
                ", customerName=" + customerName + ", driverName=" + driverName +
                ", pickUpAddress='" + pickUpAddress + ", dropOffAddress='" + dropOffAddress +
                ", orderCost=" + orderCost + ", wasPayed=" + wasPayed +
                ", orderStatus='" + orderStatus;
    }
}
