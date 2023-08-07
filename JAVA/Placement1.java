import java.util.Scanner;

interface SSC{
	int marks=480;
	float cgpa=9.6;	
	private void getDetails(){};
}

interface Intermediate{
	int marks=460;
	float cgpa=9.2;
	private void getDetails(){};
}

class Bachelor implements SSC,Intermediate{
	int marks;
	float cgpa;
	void getDetails(){};
}

class Placement1 extends Bachelor{
	String company;
	float salary;
	String designation;
	if()
	void getDetails(){
		System.out.println("The company name is"+company);
		System.out.println("The salary is"+salary);
		System.out.println("The designation is"+designation);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Bachelor bl=new Bachelor();
		Placement pl=new Placement();
		System.out.println("Enter the marks: ");
		int mk=nextInt();
		System.out.println("Enter the cgpa: ");
		int cg=nextInt();

		if(cg>9){
			pl.company="microsoft";
			pl.salary="30 lpa";
		}
		else if(cg>8 && cg<9){
			pl.company="IBM";
			pl.salary="20 lpa";
		}
		else{
			pl.company="Nvidia";
			pl.salary="10 lpa";
		}
		pl.getDetails();
	}
}






