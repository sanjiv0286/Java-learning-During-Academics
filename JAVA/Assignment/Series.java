import java.util.*;

class Samsung{
     
      static  String seriesName;
      static  int weight;
      static  int price;
      static  int battery;
      static  int ram ;
      
      static  int rom ;
      static int sales;
      static int totalSales=0;
static void xx(int xx_sales){
     seriesName="XX";
      weight=350;
      price =11000;
      battery =3000;
      ram =4;
      rom =32;
      sales=11000* xx_sales;
      totalSales=totalSales+sales;
       
     System.out.println("SERIES NAME: " +seriesName);
     System.out.println("WEIGHT:  " +weight+" gms");
     System.out.println("PRICE: " +price +" Rs");
     System.out.println("BATTERY: " +battery+ " mah");
     System.out.println("RAM: " +ram+" GB");
     System.out.println("ROM: " +rom+" GB");
     System.out.println("SALES OF THIS SERIES: " +   sales+" Rs");

      }
 static void xy(int xy_sales){
        seriesName="XY";
        weight=250;
        price =23000;
        battery =5000;
        ram =8;
        rom =64;
        sales=23000*xy_sales;
       totalSales=totalSales+sales;
          
     System.out.println("SERIES NAME: " +seriesName);
     System.out.println("WEIGHT:  " +weight+" gms");
     System.out.println("PRICE: " +price +" Rs");
     System.out.println("BATTERY: " +battery+ " mah");
     System.out.println("RAM: " +ram+" GB");
     System.out.println("ROM: " +rom+" GB");
     System.out.println("SALES OF THIS SERIES: " +   sales+" Rs");

      }

static void xz(int xz_sales){
        seriesName="XZ";
        weight=150;
        price =32000;
        battery =9000;
        ram =16;
        rom =128;
        sales=32000*xz_sales;
        totalSales=totalSales+sales;    
     System.out.println("SERIES NAME: " +seriesName);
     System.out.println("WEIGHT:  " +weight+" gms");
     System.out.println("PRICE: " +price +" Rs");
     System.out.println("BATTERY: " +battery+ " mah");
     System.out.println("RAM: " +ram+" GB");
     System.out.println("ROM: " +rom+" GB");
     System.out.println("SALES OF THIS SERIES: " +   sales+" Rs");
    System.out.println("TOTAL SALES: " +totalSales +" Rs");

      }
}
class Series{
       
    public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the numbers of XX Model sales:  " );
              int a=sc.nextInt();
              System.out.println("Enter the numbers of XY Model sales:  " );
              int b=sc.nextInt();
              System.out.println("Enter the numbers of XZ Model sales:  " );       
              int c=sc.nextInt();
              Samsung  res=new Samsung();
              res.xx(a);
              res.xy(b);
              res.xz(c);
        }
}