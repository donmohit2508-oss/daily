//1

// class Car{
//     String brand; 
//     String model;
//     int year;

//     void details(){
//         System.out.println("Brand: " + brand);
//         System.out.println("Model: " + model);
//         System.out.println("year: " + year);
//     }
// }

// public class Obj {

//     public static void main(String[] args) {
//         Car c1 = new Car();

//         c1.brand = "tata";
//         c1.model = "xyz";
//         c1.year = 2022;
//         c1.details();
        
//     }
// }



//2


// class MobilePhone{
//     String brand;
//     int price;

//     void details(){
//         System.out.println("Brand: " + brand);
//         System.out.println("price: " + price);
//     }
// }

// public class Obj {

//     public static void main(String[] args) {
//         MobilePhone m1 = new MobilePhone();
//         MobilePhone m2 = new MobilePhone();
//         m1.brand = "samsung";
//         m1.price = 100000;
//         m1.details();
//         m2.brand = "vivo";
//         m2.price = 100;
//         m2.details();
//     }
// }



//3


// class Employee{
//     String name;
//     int id;
//     int salary;

//     void raisedSalary() {
//         System.out.println("salary raised");
//     }

// }

// public class Obj {

//     public static void main(String[] args) {
//         Employee e1 = new Employee();
//         e1.raisedSalary();
//         Employee e2 = new Employee();
//         e2.raisedSalary();
//         Employee e3 = new Employee();
//         e3.raisedSalary();

//     }
// }


//4



// class BankAccount{
//     String AccountHolder;
//     double Balance;

//     void ShowDetails(){
//         System.out.println("AccountHolder: " + AccountHolder);
//         System.out.println("Balance: " + Balance);
//     }
// }

// public class Obj {

//     public static void main(String[] args) {
//         BankAccount b1 = new BankAccount();
//         b1.AccountHolder = "mohit";
//         b1.Balance = 1000;
//         b1.ShowDetails();
//         BankAccount b2 = new BankAccount();
//         b2.AccountHolder = "rahul";
//         b2.Balance = 24000;
//         b2.ShowDetails();
//     }
// }


//5

class Book{
    String title;
    String author;
    boolean issued;

    void issueBook(){
        issued = true;
        System.out.println(title + "has been issued");
    }
}

