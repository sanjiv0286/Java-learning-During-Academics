import java.util.*;

public class sub_3_04 {
    public static void main(String[] args) {
        int n, factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++) {

            factorial = factorial * i;

        }
        System.out.print("Factorial of a given number is :"+factorial);

    }
}