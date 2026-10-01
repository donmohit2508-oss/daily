package MiniProject;
import java.util.Scanner;

class Book{
    String title;
    Book(String title){
        this.title = title;
    }
}
class Member{
    String name;
    Member(String name){
        this.name = name;
    }
}
class Pass{
    Book book;
    Member member;
    Pass(Book book , Member member){
        this.book = book;
        this.member = member;
    }
    void display(){
        System.out.println("Book Title: " + book.title);
        System.out.println("Member Name: "+ member.name);
    }
}

public class Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String bookTitle = sc.nextLine();

        System.out.print("Enter member name: ");
        String memberName = sc.nextLine();

        Book book = new Book(bookTitle);
        Member member = new Member(memberName);

        Pass pass = new Pass(book, member);
        
        pass.display();
    }
}
