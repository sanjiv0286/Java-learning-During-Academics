// public class TenaryOperator {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int c = 30;
//         int d = (a > b )? (a > c ? a : c) : (b > c ? b : c);
//         System.out.println("The largest value is" + " " + d);
//     }
// }

// import java.util.*;

// class TenaryOperator {
//     public static void main(String args[]) {
//         String original, reverse = ""; // Objects of String class
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter a string/number to check if it is a palindrome");
//         original = in.nextLine();
//         int length = original.length();
//         for (int i = length - 1; i >= 0; i--) {
//             reverse = reverse + original.charAt(i);
//         }
//         if (original.equals(reverse)) {
//             System.out.println("Entered string/number is a palindrome.");
//         } else {
//             System.out.println("Entered string/number isn't a palindrome.");
//         }

//     }
// }

// class TenaryOperator {
//     public static void main(String args[]) {
//         int no = 153;
//         int t1 = no;
//         int leng = 0;
//         while (t1 != 0) {
//             leng = leng + 1;
//             t1 = t1 / 10;
//         }
//         int t2 = no;
//         int rem, arm = 0;
//         while (t2 != 0) {
//             int mul = 1;
//             rem = t2 % 10;
//             for (int i = 1; i <= leng; i++) {
//                 mul = mul * rem;
//             }
//             arm = arm + mul;
//             t2 = t2 / 10;
//         }
//         if (arm == no) {
//             System.out.println(no + " : is armstrong number ");
//         } else {
//             System.out.println(no + ": is not a armstrong number ");
//         }
//     }
// }

import java.util.Scanner;

public class Vowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char arr[][] = new char[5][5];
        System.out.println("Given alphabetic character enter in the sequence as we want to print matrix acc. to ques");
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println("MATRIX");
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int n = 0;
        VowelSearch vowelSearch = new VowelSearch();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                boolean result = false;
                for (int k = 0; k < 5; k++) {
                    result = vowelSearch.searchVowel(arr[i][j]);
                }
                if (result) {
                    System.out.println("Vowel " + arr[i][j] + " is present at position " + (i) + " " + (j));
                    n++;
                }
            }
        }
        System.out.println("No. of vowels in the matrix: " + n);

        int sm = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0 & j == 2) || (i == 1 & j == 3) || (i == 3 & j == 1) || (i == 2 & j == 0)
                        || (i == 4 & j == 4)) {
                    System.out.println(arr[i][j]);
                    sm = sm + arr[i][j];
                }
            }
           
        }
        System.out.println("Sum  of all  index where vowels are present : " + sm);
    }
}

class VowelSearch {
    int n = 0;
    char vowels[] = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };

    public boolean searchVowel(char c) {
        for (int k = 0; k < 10; ++k) {
            if (c == vowels[k]) {
                return true;
            }
        }
        return false;
    }
}