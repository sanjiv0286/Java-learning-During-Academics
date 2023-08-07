import java.util.Scanner;

class Book {
    public static void main(String[] args){
            String BName,AName,PName;
            int Price,Nop;
       System.out.println("Details of  All Book");
        System.out.println("                                                                ");
       System.out.println("Details of First Book");
       System.out.println("Name of the Book : One Indian Girl");
        System.out.println("Author of the Book :Chetan Bhagat ");
       System.out.println("Publication :  GBD World");
      System.out.println("Price : Rs.199");
      System.out.println("Number of pages : 220");


        System.out.println("                                                                ");
       System.out.println("Details of Second Book");
       System.out.println("Name of the Book : Half GirlFriend ");
        System.out.println("Author of the Book : Chetan Bhagat");
       System.out.println("Publication :  GBD World");
      System.out.println("Price : Rs.208");
      System.out.println("Number of pages : 220");

       System.out.println("                                                                ");
       System.out.println("Details of Third Book");
       System.out.println("Name of the Book : The Three Mistake in My Life");
        System.out.println("Author of the Book : Chetan Bhagat");
       System.out.println("Publication :  GBD World");
      System.out.println("Price : Rs.199");
      System.out.println("Number of pages : 220");

      Scanner B1=new Scanner(System.in);
      Scanner B2= new Scanner(System.in);
      Scanner B3=new Scanner(System.in);
      Scanner B4=new Scanner(System.in);
      Scanner B5=new Scanner(System.in);

    
     System.out.println("Details of the Fourth Book");
     System.out.println("                                                                      ");
     System.out.println("Name of the Book > ");
     BName=B1.nextLine();
     System.out.println("Name of the Author > ");
     AName=B2.nextLine();
     System.out.println("Publication > ");
     PName=B3.nextLine();
      System.out.println("Price > ");
      Price=B4.nextInt();
     System.out.println("Pages > ");
     Nop=B5.nextInt();
     System.out.println("                                                                      ");
     System.out.println("                                                                      ");
     System.out.println(" Book :>  "+BName);
     System.out.println("Author : > "+AName);
     System.out.println("Publication :>  "+PName);
     System.out.println("Price :>  Rs."+Price);
     System.out.println("Pages :>  "+Nop);



     System.out.println("Details of the last Book");
     System.out.println("                                                                      ");
     System.out.println("Name of the Book > ");
     BName=B1.nextLine();
     System.out.println("Name of the Author > ");
     AName=B2.nextLine();
     System.out.println("Publication > ");
     PName=B3.nextLine();
      System.out.println("Price > ");
      Price=B4.nextInt();
     System.out.println("Pages > ");
     Nop=B5.nextInt();
     System.out.println("                                                                      ");
     System.out.println("                                                                      ");
     System.out.println(" Book :>  "+BName);
     System.out.println("Author : > "+AName);
     System.out.println("Publication :>  "+PName);
     System.out.println("Price :>  Rs."+Price);
     System.out.println("Pages :>  "+Nop);


        }
}