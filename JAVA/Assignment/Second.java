import java.util.Scanner;

class XX {
	static String brand = "Samsung";
	float weight = 350;
	static String sname = "XX";
	int price = 11000;
	int battery = 3000;
	int RAM = 4;
	int ROM = 32;
	int units;
	XX(int units) {
		this.units = units;
	}
void display() {
		int sales = price * units;
		System.out.println();
		System.out.println("Series Name: "+sname);
		System.out.println("Weight: "+weight+" gms");
		System.out.println("Price: Rs. "+price);
		System.out.println("Battery: "+battery+"mAh");
		System.out.println("RAM: "+RAM+"GB");
		System.out.println("ROM: "+ROM+"GB");
		System.out.println("Brand: "+brand);
		System.out.println("Sales: Rs. "+sales);
		System.out.println();
	}  
}
public class Second{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of XX units sold: ");
		int s1;
		s1 = sc.nextInt();
		XX p1 = new XX(s1);
		p1.display();
	}	
}
