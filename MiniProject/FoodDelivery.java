package MiniProject;
import java.util.Scanner;

abstract class Order{
    private String customerName;
    private double amount;

    Order(String customerName , double amount){
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName(){
        return customerName;
    }
    public double getAmount(){
        return amount;
    }

    abstract double calculateTotalAmount();

    public void displayOrder(){
        System.out.println("Order Details: ");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order Amount: " + amount);
        System.out.println("Total Amount: " + calculateTotalAmount());
    }
}

class DineIn extends Order{
    DineIn(String customerName , double amount){
        super(customerName , amount);
    }
    double calculateTotalAmount(){
        return getAmount() + (getAmount() + 1.10);
    }
}
class Takeway extends Order{
    Takeway(String customerName , double amount){
        super(customerName , amount);
    }
    double calculateTotalAmount(){
        return getAmount() + 50;
    }
}
class Delivery extends Order{
    Delivery(String customerName , double amount){
        super(customerName , amount);
    }
    double calculateTotalAmount(){
        return getAmount() + 100;
    }
}


public class FoodDelivery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.println("Select order type: ");
        System.out.println("1. Dine-in");
        System.out.println("2. Takeway");
        System.out.println("3. Delevery");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter food amount: ");
        double amount = sc.nextDouble();

        Order order;
        if(choice == 1){
            order = new DineIn(name, amount);
        }else if(choice == 2){
            order = new Takeway(name, amount);
        }else if(choice == 3){
            order = new Delivery(name, amount);
        }else{
            System.out.println("invalid choice!");
            return;
        }
        order.displayOrder();
    }
    
}
