import java.util.*;

class sub_3_03 {
       public static void main(String args[]){
             Scanner k=new Scanner(System.in);
             System.out.println("Enter The Number : ");
             int num=k.nextInt();
             int ans=0;
             int temp1=0;
             int temp2=1;
         System.out.println("Fibonacci Series =  ");
         System.out.print(0+"  ");
         System.out.print(1+"  ");
             do
                 {
                    ans=temp1+temp2;
                    System.out.print(ans+"  ");
                    temp1=temp2;
                    temp2=ans;
                 }
            while(ans+temp1<=num);
      }
}