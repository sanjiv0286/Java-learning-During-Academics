import java.util.Scanner;

interface SSC {
	int marks = 480;
	double cgpa = 9.6;

	private void getDetails() {
	};
}

interface Intermediate {
	int marks = 460;
	double cgpa = 9.2;

	private void getDetails() {
	};
}

class Bachelor implements SSC, Intermediate {
	int marks;
	double cgpa;

	void getDetails() {
	};
}

class Placement extends Bachelor {
	String company;
	double salary;
	String designation;

	void getDetails() {
		System.out.println("The company name is" + company);
		System.out.println("The salary is" + salary + "lpa");
		System.out.println("The designation is " + designation);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bachelor bl = new Bachelor();
		Placement pl = new Placement();
		System.out.println("Enter the marks: ");
		int mk = sc.nextInt();
		System.out.println("Enter the cgpa: ");
		double cg = sc.nextFloat();

		if (cg > 9) {
			pl.company = "microsoft";
			pl.salary = 30;
			pl.designation = "SDE";
		} else if (cg > 8 && cg < 9) {
			pl.company = "IBM";
			pl.salary = 20;
			pl.designation = "SDE";

		} else {
			pl.company = "Nvidia";
			pl.salary = 10;
			pl.designation = "SDE";
		}
		pl.getDetails();
	}
}