package String;


//join()

public class Str {
    public static void main(String[] args) {
        String fName = "Mohit";
        String lName = "Kumar";
        System.out.println(fName.length());
        int age = 19;
        String add = String.join("_", fName , lName);
        System.out.println(add);
        System.out.println(fName.length());
        System.out.println(fName.charAt(0));
        System.out.println(fName.indexOf('h'));
        System.out.println(fName.concat(lName));
        String format = String.format("My name is %s and i am %d years old." , fName , age);
        System.out.println(format);
    }
}
