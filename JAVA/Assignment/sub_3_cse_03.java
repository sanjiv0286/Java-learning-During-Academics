import java.util.Scanner;

public class sub_3_cse_03 {
    public static void main(String[] args) {

        char ch;
        System.out.println("ENTER A ALPHABET");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(3);
  
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        {
            System.out.println(ch + " is vowel");
        }
        else {
            System.out.println(ch + " is consonant");
        }
    }
    
}
