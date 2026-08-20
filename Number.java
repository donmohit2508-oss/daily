import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Count Even and Odd Digits

        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;

        while(n > 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                even++;
            }else{
                odd++;
            }
            n = n / 10;

        }
        System.out.println("even number is: " + even);
        System.out.println("odd number is: " + odd);

        //Sum of Even Digits

        System.out.print("Enter your number: ");
        int n1 = sc.nextInt();
        int sum = 0;

        while(n1 > 0){
            int digit = n1 % 10;
            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            n1 = n1 / 10;
        }
        System.out.println("sum of even number: " + sum);


        //sum of odd digits

        System.out.print("Enter your number: ");
        int n2 = sc.nextInt();
        int sum1 = 0;

        while(n2 > 0){
            int digit = n2 % 10;
            if (digit % 2 != 0) {
                sum1 = sum1 + digit;
            }
            n2 = n2 / 10;
        }
        System.out.println("sum of odd number: " + sum1);

        //Largest Digit

         System.out.print("Enter your number: ");
         int n3 = sc.nextInt();
         int largest = 0;

         while(n3 > 0){
            int digit = n3 % 10;
            if (digit > largest){
                largest = digit;
            }
            n3 = n3 / 10;
         }
         System.out.println("largest number is " + largest);


        //smallest number

        System.out.print("Enter your number: ");
        int n4 = sc.nextInt();
        int smallest = 9;

         while(n4 > 0){
            int digit = n4 % 10;
            if (digit < smallest){
                 smallest = digit;
            }
            n4 = n4 / 10;
         }
         System.out.println("smallest number is " + smallest);

        //Count a Particular Digit

        //Product of Digits

        System.out.print("Enter your number: ");
        int n5 = sc.nextInt();
        int product = 1;

        while(n5 > 0){
            int digit = n5 % 10;
            product = product * digit;
            n5 = n5 / 10;
         }
         System.out.println("product of all number " + product);


         //First and Last Digit

        System.out.print("Enter your number: ");
        int n6 = sc.nextInt();
        int fd = n6;
        int ld = n6 % 10;

        while(fd >= 10){
            fd = fd / 10;
        }
        System.out.println("first number is " + fd);
        System.out.println("last number is " + ld);

        //Difference Between Sum of Even and Odd Digits

        System.out.print("Enter your number: ");
        int n7 = sc.nextInt();
        int sumeven = 0;
        int sumodd = 0;

        while(n7 > 0){
            int digit = n7 % 10;
            if(digit % 2 == 0){
                sumeven = sumeven + digit;
            }else{
                sumodd = sumodd + digit;
            }
            n7 = n7 /10;
        }
        int diff = sumeven - sumodd;
        System.out.println("even sum " + sumeven);
        System.out.println("odd sum " + sumodd);
        System.out.println("difference " + diff);

        //Number of Zeros

        System.out.print("Enter your number: ");
        int n8 = sc.nextInt();
        int count = 0;

        while(n8 > 0){
            int digit = n8 % 10;
            if(digit == 0){
                count++;
            }
            n8 = n8 / 10;
        }
        System.out.println(count);







        
    }
}
