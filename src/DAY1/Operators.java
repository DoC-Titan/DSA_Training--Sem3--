package DAY1;

import java.util.Scanner;

public class Operators {
    public static int m1 = 90;
    public static int m2 = 80;
    public static int m3 = 31;

    public static void main(String[] args) {

        /*if(m1 < 35 || m2 < 35 || m3 < 35){
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
        if(m1 && 35 && m2 >= 35 && m3 >= 35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        81 -100 = A
        71 -80 = B
        61 - 70 = C
        0 - 60 = D
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your mark's: ");
        int marks = scanner.nextInt();

        if(marks > 80){
            System.out.println("A");
        }
        else if(marks >= 71){
            System.out.println("B");
        }
        else if(marks >= 61){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }



    }


}
