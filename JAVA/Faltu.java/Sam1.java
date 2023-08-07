import java.util.*;

// // Displaying a 2D array as a matrix
// public class Sam1 {
// public static void main(String args[]) {
// // take a 2D array
// int x[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
// // read and display array elements
// System.out.println();
// for (int i = 0; i < x.length; i++) {
// for (int j = 0; j < x[i].length; j++) {
// System.out.print(x[i][j] + " ");
// }
// System.out.println(); // next line
// }
// }
// }

// public class Sam1 {
// public static void main(String args[]) {
// // creating two matrices
// int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
// int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };

// // creating another matrix to store the sum of two matrices
// int c[][] = new int[3][3]; // 3 rows and 3 columns
// System.out.println("ADDITION OF TWO MATRIX IS :");
// // adding and printing addition of 2 matrices
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 3; j++) {
// c[i][j] = a[i][j] + b[i][j]; // use - for subtraction

// System.out.print(c[i][j] + " ");
// }
// System.out.println();// new line
// }
// }
// }

// public class Sam1{  
//     public static void main(String args[]){  
//     //creating two matrices    
//     int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
//     int b[][]={{1,1,1},{2,2,2},{3,3,3}};    

//     //creating another matrix to store the multiplication of two matrices    
//     int c[][]=new int[3][3];  //3 rows and 3 columns  

//     //multiplying and printing multiplication of 2 matrices    
//     for(int i=0;i<3;i++){    
//     for(int j=0;j<3;j++){    
//     c[i][j]=0;      
//     for(int k=0;k<3;k++)      
//     {      
//     c[i][j]+=a[i][k]*b[k][j];      
//     }//end of k loop  
//     System.out.print(c[i][j]+" ");  //printing matrix element  
//     }//end of j loop  
//     System.out.println();//new line    
//     }    
//     }}

// the multiplication of two matrices taking input by the user
public class Sam1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[][]=new int[3][3],b[][]=new int[3][3],c[][]= new int[3][3];
        // int
        // int 
        System.out.println("ENTER NUMBER IN FIRST MATRIX :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("ENTER NUMBER AT INDEX :["+i+"]["+j+"]");
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("ENTER NUMBER IN SECOND MATRIX :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("ENTER NUMBER AT INDEX :["+i+"]["+j+"]");
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("FIRST MATRIX:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" " );
            }
            System.out.println();
        }
        System.out.println("SECOND MATRIX:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+" " );
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
              c[i][j]=0;      
              for(int k=0;k<3;k++){      
                 c[i][j]+=a[i][k]*b[k][j];      
              }//end of k loop  
              System.out.print(c[i][j]+" ");  //printing matrix element  
            }//end of j loop  
            System.out.println();//new line    
        }    
    }
}

// TRANSPOSE OF A 2*2 MATRIX
// public class Sam1 {
//     public static void main(String[] args) {
//         int row = 2, column = 3;
//         int[][] matrix = { { 2, 3, 4 }, { 5, 6, 4 }, };

//         // Display current matrix
//         display(matrix);

//         // Transpose the matrix
//         int[][] transpose = new int[column][row];
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < column; j++) {
//                 transpose[j][i] = matrix[i][j];
//             }
//         }
//         // Display transposed matrix
//         display(transpose);
//     }

//     public static void display(int[][] matrix) {
//         System.out.println("The matrix is: ");
//         for (int[] row : matrix) {
//             for (int column : row) {
//                 System.out.print(column + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// TRANSPOSE OF A 3*3 MATRIX by taking input from user
// public class Sam1 {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// int a[][] = new int[3][3], b[][] = new int[3][3];
// System.out.println("ENTER NUMBER IN MATRIX :");
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 3; j++) {
// System.out.println("ENTER NUMBER AT INDEX :[" + i + "][" + j + "]");
// a[i][j] = sc.nextInt();
// }
// }

// System.out.println("1MATRIX:");
// for(int i=0;i<3;i++){
// for(int j=0;j<3;j++){
// System.out.print(a[i][j]+" " );
// }
// System.out.println();
// }
// System.out.println("TRANSPOSE MATRIX:" );
// for (int i = 0; i < 3; i++)
// {
// for (int j = 0; j < 3; j++)
// {
// b[i][j]=a[j][i] ;
// System.out.print(b[i][j]+" ");

// }
// System.out.println();
// }

// }
// }

// //sum of diagonal of a matrix

// import java.util.*;

// class Sam1
// {
// public static void main(String args[])
// {
// Scanner sc = new Scanner(System.in);

// int i,j,row,col,sum=0;
// System.out.println("Enter the number of rows:");
// row = sc.nextInt();
// System.out.println("Enter the number of columns:");
// col = sc.nextInt();

// int[][] mat = new int[row][col];

// System.out.println("Enter the elements of the matrix") ;
// for(i=0;i<row;i++)
// {
// for(j=0;j<col;j++)
// {
// mat[i][j] = sc.nextInt();
// }
// }

// System.out.println("The elements of the matrix") ;
// for(i=0;i<row;i++)
// {
// for(j=0;j<col;j++)
// {
// System.out.print(mat[i][j]+"\t");
// }
// System.out.println("");
// }

// for(i=0;i<row;i++)
// {
// for(j=0;j<col;j++)
// {
// if(i==j) //this condition checks for diagonal
// {
// sum = sum + mat[i][j];
// }
// }
// }

// System.out.printf("SUM of DIAGONAL elements of the matrix = "+sum) ;
// }
// }

// // public class Sam1 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         String a[][] = new String[5][5];

//         for (i = 0; i < 5; i++) {
//             for (j = 0; j < 5; j++) {
//                 a[i][j] = sc.nextLine();
//             }
//         }
//     }
// // }