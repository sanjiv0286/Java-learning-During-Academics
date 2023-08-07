import java.util.*;
class sub_3_02{
       public static void main(String args[]){
             Scanner k=new Scanner(System.in);
             System.out.println("Enter The Number : ");
             int num=k.nextInt();
             int cnt=0;
     while(num>0){
             int rem=num%10;
             num=num/10;
            cnt++;
          }
         System.out.println("Total Number Of Digit in Given number =  "+cnt);
      }
}