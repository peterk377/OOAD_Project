//Object Oriented Analytics and Design Project
//Made by:  Piotr Kimmel B00087671
//          Samuel Khan B00123689
//          Noel Kelly B00132291
//          Daniel Ikomi B00147691

import People.*;
import OrderAndComplaints.*;

public final class Project {

    public static void main(String[] args) {
        //creating a customer, a car, manager and a driver
        Customer customer1 = createCustomer();
        //System.out.println(customer1.toString());//this line prints out the details of the customer
        Car car1 = createCar(customer1);
        //System.out.println(car1.toString());//this line of code prints out the details of the car
        Order order1 = customer1.createOrder();
        //System.out.println(order1.toString());//this line of code prints out the details of the order
        Driver driver1 = createDriver(order1);
        //System.out.println(driver1.toString());//this line of code prints out the details of the driver
        Manager manager1 = createManager();
        //System.out.println(manager1.toString());

        driver1.collectCustomer(order1);//this line of code changes the status of the order to in process
        //System.out.println(order1.toString());//this line of code prints out the updated order details
        driver1.setCost(5.00);
        driver1.updatePrice(order1);//driver adds 5 euro to the total charge of the service
        //System.out.println(order1.toString());//this line of code prints out the updated order details
        driver1.dropCustomer(order1);//this line of code changes the status of the order to complete and changes wasPayed to true
        //System.out.println(order1.toString());//this line of code prints out the updated order details

        //Customer creates a complaint
        Complaint complaint1 = customer1.createComplaint(order1);
        //System.out.println(complaint1.toString());
        manager1.viewComplaint(complaint1);//manager views complaint
        manager1.resolveComplaint(complaint1);//manager resolves complaint
        System.out.println(complaint1.toString());
        manager1.refund(order1);//manager refunds the customer
        System.out.println(order1.toString());
    }

    public static Driver createDriver(Order order){

        Driver driver = new Driver();

        Order currentOrder = order;

        driver.setName("Bob");
        driver.setPhone("087 321 4567");

        return driver;
    }

    public static Manager createManager(){

        Manager manager = new Manager();

        manager.setName("Manny");
        manager.setPhone("087 987 1234");
        return manager;
    }

    public static Car createCar(Customer customer){

        Customer owner = customer;

        Car car1 = new Car();

        car1.setCarReg("141D22660");
        car1.setMake("Volkswagen");
        car1.setManual(true);
        car1.setOwner(owner);
        car1.setOwnerName(owner.getName());

        return car1;
    }

    public static Customer createCustomer(){

        Customer customer1 = new Customer();

        customer1.setName("Pete");
        customer1.setPhone("087 123 4567");
        customer1.setCardNo("123456789");
        customer1.setHomeAddress("123 Dublin Rd");

        return customer1;

    }

}
