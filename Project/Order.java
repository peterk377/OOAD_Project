import java.util.Date;

public class Order{

    private int orderId;
    private double orderCost;
    private boolean wasPayed = false;
    private Date dateOfOrder;
    private String orderStatus = "pending";

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

    public Date getDateOfOrder() {
        return this.dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderCost=" + orderCost +
                ", wasPayed=" + wasPayed +
                ", dateOfOrder=" + dateOfOrder +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
