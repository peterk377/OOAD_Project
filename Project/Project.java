import java.util.Scanner;

public class Project {
    public static void main(String[] args) {

        createCustomer();

    }

    public static Customer createCustomer(){

        Scanner in = new Scanner(System.in);

        String name, phone, card, homeAddress;

        Customer customer1 = new Customer();

        System.out.println("Please write your name");
        name = in.nextLine();
        customer1.setName(name);

        System.out.println("Please write you phone number");
        phone = in.nextLine();
        customer1.setPhone(phone);

        System.out.println("Please input you card details for payment");
        card = in.nextLine();
        customer1.setCardNo(card);

        System.out.println("Please input your home address");
        homeAddress = in.nextLine();
        customer1.setHomeAddress(homeAddress);

        System.out.println(customer1.toString());

        return customer1;

    }

}
