import java.util.*;

class sub_3_06{

       public static void main(String args[]){
             Scanner k=new Scanner(System.in);
             System.out.println("Enter The  Charector : ");
             String c=k.nextLine();
             String ans;
            switch(c){
             case "a":  ans="VOWEL";
                             break;
             case "e":  ans="VOWEL";
                             break;
             case "i":  ans="VOWEL";
                             break;
             case "o":  ans="VOWEL";
                             break;
             case "u":  ans="VOWEL";
                             break;
             case "A":  ans="VOWEL";
                             break;
             case "E":  ans="VOWEL";
                             break;
             case "I":  ans="VOWEL";
                             break;
             case "O":  ans="VOWEL";
                             break;
             case "U":  ans="VOWEL";
                             break;
             default :  ans="CONSONENTS";
                              break;
             }
         System.out.println("Given charector is : "+ans);
      }
}