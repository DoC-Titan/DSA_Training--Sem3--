package Day8;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] Arr = new int[3][3];
//
//        System.out.println("Enter Values in Matrix(3x3)");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("Row: " + i + " " + "Column: " + j + " = ");
//                Arr[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("\nMatrix:");
//        for (int[] row : Arr) {
//            for (int colm : row) {
//                System.out.print(colm + " ");   // added space
//            }
//            System.out.println();               // new line after each row
//        }
//
//       sc.close();  // good practice: close the scanner
//        int SumR1 = 0;
//        int SumR2 = 0;
//        int SumR3 = 0;
//        int[][] Arr = {{1,2,3} , {4,5,6} , {7,8,9}};
//        for(int i = 0; i< 3; i++){
//            for(int j = 0 ; j<3; j++){
//                if(i==0){
//                    SumR1 += Arr[i][j];
//                }
//                if(i==1){
//                    SumR2 += Arr[i][j];
//                }
//                if(i==2){
//                    SumR3 += Arr[i][j];
//                }
//            }
//        }
//        System.out.println("Sum Row 1: " + SumR1 + " \n"  + "Sum Row 2: " + SumR2 +" \n"+  "Sum Row 3: " + SumR3);
//        int max = Math.max(SumR1, Math.max(SumR2, SumR3));
//        System.out.println("MAximum sum of the rows: " + max);
//
//        System.out.println();
//
//
//
//        int SumC1 = 0;
//        int SumC2 = 0;
//        int SumC3 = 0;
//
//        for(int i = 0; i< 3; i++){
//            for(int j = 0 ; j<3; j++){
//                if(j==0){
//                    SumC1 += Arr[i][j];
//                }
//                if(j==1){
//                    SumC2 += Arr[i][j];
//                }
//                if(j==2){
//                    SumC3 += Arr[i][j];
//                }
//            }
//        }
//        System.out.println("Sum Column 1: " + SumC1 + " \n"  + "Sum Column 2: " + SumC2 +" \n"+  "Sum Column 3: " + SumC3);
//        int max1 = Math.max(SumC1, Math.max(SumC2, SumC3));
//        System.out.println("MAximum sum of the Column: " + max1);

        System.out.println("Orginal Matrix");
        int[][] Arr = {{3,5,7} , {8,10,11} , {9,6,1}};
        for(int i  = 0; i<3 ;i++){
            for(int j = 0; j< 3 ; j++){
                System.out.print(Arr[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Transpose of Matrix");
        for(int i  = 0; i<3 ;i++){
            for(int j = 0; j< 3 ; j++){
                System.out.print(Arr[j][i] + "   ");
            }
            System.out.println();
        }




    }
}