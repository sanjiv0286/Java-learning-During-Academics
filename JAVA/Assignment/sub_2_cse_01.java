public class sub_2_cse_01{
    public static void main(String[] args){
        book b1 = new book("C-Programming",320,235,124,80,60);
        book b2 = new book("Java Programming",1100,560,200,90,50);
        book b3 = new book("Artificial Intelligence",1230,800,80,68,200);
        b1.printDetails();
        b2.printDetails();
        b3.printDetails();
    }
}
class book{
    String title;
    int nop;
    int price ;
    static String author = "Robin Sharma";
    static String publisher = "Arihant Publication ";
    int jan, mar, may;

    book(String title, int nop, int price, int jan, int mar, int may)
    {
        this.title = title;
        this.nop = nop;
        this.price = price;
        this.jan = jan;
        this.mar = mar;
        this.may = may;
    }
     void printDetails(){
        System.out.println("\nTitle: " + title + "\nNo Of Pages: " + nop + "\nPrice: Rs." + price + "\nPublisher: " + publisher + "\nAuthor: " + author + "\nBook Sales: January- " + jan  + " units, March- " + mar + " units, May- " + may + " units");
        int total = (jan + mar + may)*price;
        System.out.println("Total Sales: Rs. " + total);
    }
}
