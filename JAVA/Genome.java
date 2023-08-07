import java.util.*;
class Genome{
public static void main(String[] args)
{ char a,b;
String ch,chh,z;
 
 Scanner obj=new Scanner(System.in);
System.out.println("Enter the 1st type of chromosomes/'X/' or /'Y/' :-");
 a=obj.next().charAt(0);
System.out.println("Enter the 2nd type of chromosomes/'X/' or /'Y/' :-");
 b=obj.next().charAt(0);


 
 
 System.out.println("Enter the Genome Sequence of 1st chromosome :-");
 ch=obj.nextLine();
 System.out.println("Enter the Genome Sequence of 2nd chromosome :-");
 chh=obj.nextLine();



z=ch.concat(chh);


int aa;
aa=z.length();
char y[] = new char[aa+1];
int j=0;
for(int i=aa;i>=0;i--)
{ y[j]=z.charAt(i);j++;}


if("y".equals("z"))
{  System.out.println("This is pallindrome  ");}

else {  System.out.println("This is not pallindrome  ");}
 
 
}
}