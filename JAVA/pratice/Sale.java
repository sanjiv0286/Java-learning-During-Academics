import java.util.Scanner;

public class Sale
{
    protected String title;
    protected String author;
    protected String publication;
    protected double price;
    
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book title: ");
        title = input.nextLine();
        System.out.print("Enter book author: ");
        author = input.nextLine();
        System.out.print("Enter publication name: ");
        publication = input.nextLine();
        System.out.print("Enter book price: ");
        price = input.nextDouble();
    }
    
    public void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Publication: " + publication);
        System.out.println("Price: " + price);
    }
}