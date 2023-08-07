import java.util.*;

public class sub_3_cse_02 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of term");
        n = sc.nextInt();
        System.out.println();
        for(int i = 1;i <= n ; i++ ){
            System.out.println(i +" ");
            sum = sum +i;
//            System.out.println("Sum of first""natural numbers :"+sum);// not used here
        }
        System.out.println();
        System.out.println("Sum of first"+n+"natural numbers :"+sum);
    }
    
}
