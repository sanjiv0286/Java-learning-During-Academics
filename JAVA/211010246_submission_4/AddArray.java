import java.util.*;

public class AddArray {
    public static void main(String[] args) {
        int sum = 0;
        long factorial = 1;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("ENTER THE ONE DIMENSION ARRAY");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum of the one dimension arrray is :" + sum);
        for (int i = 1; i <= sum; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of the resultant sum value: " + factorial);

    }
}
