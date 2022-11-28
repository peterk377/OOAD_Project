import java.util.ArrayList;

public class OrderList extends Order {

    ArrayList<String> orderList = new ArrayList<String>();

    public void addToList(Order order, ArrayList orderList){

        orderList.add(order);

    }

    public void viewOrderList(Order order, ArrayList orderList){

        for(int i = 0; i < orderList.size(); i++){

            System.out.println("#" + (i + 1) + " " + order.toString());

        }

    }
}
