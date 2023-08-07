import java.util.*;

class sub_3_05 {
      public static void main(String args[]) {
            Scanner k = new Scanner(System.in);
            System.out.println("Enter The Number numbers of Calls: ");
            int num = k.nextInt();
            int bill = 0;

            if (num < 100) {
                  System.out.println("Bill is" + bill + " Rs.");
            } else {
                  if (num < 200) {
                        bill = (0) + ((num - 99) * 1);
                        System.out.println("Bill is " + bill + " Rs.");
                  }

                  else {

                        if (num < 300) {
                              bill = (0) + (100) + ((num - 199) * 2);
                              System.out.println("Bill is " + bill + " Rs.");
                        }

                        else {
                              bill = (0) + (100) + ((100) * 2) + ((num - 299) * 3);
                              System.out.println("Bill is " + bill + " Rs.");
                        }
                  }
            }
      }
}