import java.util.*;

class sub_3_01{
       public static void main(String args[]){
             Scanner k=new Scanner(System.in);
             System.out.println("Enter The Number For Reverse: ");
             int num=k.nextInt();
             int reverseNum=0;
     while(num>0){
             int rem=num%10;
             num=num/10;
             reverseNum=reverseNum*10+rem;
          }
         System.out.println("Reverse Number is: "+reverseNum);
      }
}