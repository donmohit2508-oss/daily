import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter numbers of student: ");
        int Sn = sc.nextInt();

        int[] marks = new int[Sn];

        for(int i = 0; i < Sn; i++){
            System.out.println("Enter marks of student " + (i + 1));
            marks[i] = sc.nextInt();
        }
        

        
    }
}
