import java.util.*;

public class FiveMatrices {
    public static void main(String[] args) {

        int a[][] = new int[5][5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element of the matrix ");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("ENTER THE ELEMENT OF THE MATRIX AT :[" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matrix is ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0 & j == 0) || (i == 0 & j == 4) || (i == 4 & j == 0) || (i == 4 & j == 4)) {
                    System.out.println("Elements at index ["+i+"]["+j+"] is :"+ a[i][j]);
                    sum += a[i][j];
                }
            }
        }
        System.out.println("Sum of elements of index (0,0), (0,4) (4,0) (4,4) is :" + sum);

    }

}
