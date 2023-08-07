import java.util.*;

public class PrefectNumber {
    public static void main(String[] args) {

        int a[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element of the matrix ");
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("ENTER THE ELEMENT OF THE MATRIX AT :[" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int sm = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == 2 & j == 2) || (i == 2 & j == 3) || (i == 3 & j == 2) || (i == 3 & j == 3)) {
                    System.out.println("Elements at index ["+i+"]["+j+"] is :"+ a[i][j]);
                    sm += a[i][j];
                }
            }
        }
        System.out.println("Sum of elements of index (2,2), (2,3) (3,2) (3,3) is : " + sm);
        int sum = 0;

        for (int i = 1; i < sm; i++) {
            if (sm % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of all divisors of "+sm+" is :"+sum);
        if (sum == sm) {
            System.out.println("Sum is a Prefect Number");
        } else {
            System.out.println("Sum is not a Prefect number ");
        }
    }

}
