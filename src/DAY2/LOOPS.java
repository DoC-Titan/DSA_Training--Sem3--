package DAY2;

//Multiplication table

public class LOOPS {

    static void main(String[] args) {
//
//        int n= 5;
//        for(int i = 1; i <= 10; i++){
//
//            System.out.println(n + " x " + i + " = " + i*n);
//
//        }
//        int num = 123;
//        int count = 0;
//        int sum = 0;
//        int value = 0;
//
//        while(num != 0){
//
//             value = num % 10;
//             sum = sum + value;
//             num /= 10;
//            count++;
//        }
//        System.out.println("Sum of digits: " + sum);
//
//        int num = 1253;
//        int num7 = num;
//        int num3 =0;
//        int num0 = Integer.MIN_VALUE;
//        while(num!=0){
//            int num1 = num % 10;
//            num /= 10;
//            if(num1 > num0){
//                num0 = num1;
//            }
//        }
//
//        System.out.println("LArgest digit = " + num0);
//        while(num7 != 0){
//            int num2 = num7 % 10;
//            num7 /= 10;
//            if(num2 < num0 && num2 > num3){
//                num3 = num2;
//            }
//        }
//        System.out.println("Second largest Digit = " + num3);
//
//        int num = 1325;
//        int M = Integer.MIN_VALUE;
//        int SM = Integer.MIN_VALUE;
//
//        while(num != 0){
//
//            int digit = num % 10;
//
//            if(digit > M){
//                M = digit;
//
//            }
//        }
//
//
//    }
//        //perfect number
//        int num = 9;
//        int sum= 0;
//        for (int i = 1; i < num; i++) {
//            if (num % i == 0) {
//                sum += i;
//            }
//        }
//        if(sum == num){
//            System.out.println("Perfect Number");
//        }
//        else{
//            System.out.println("Not a perfect Number");
//        }
//        Prime Number
//
//        //patters
//        int row = 5;
//        int column = 5;
//        for(int i = 0 ; i< row ; i++){
//            for(int j = 0; j < column; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        #$#$#
//        for(int i = 1; i<=5 ; i++){
//            for(int j =1 ; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        for(int i = 5; i>=1 ; i--){
//            for(int j =5 ; j>=i; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        for(int i = 5; i>=1 ; i--){
//            for(int j =1 ; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        for(int i = 1; i<=5 ; i++){
//            for(int j =1 ; j<=5; j++){
//                if(j % 2 ==  0)
//                    System.out.print("$");
//                else{
//                    System.out.print("#");
//                }
//            }
//            System.out.println();
//        }



//                int n = 7;
//                int mid = n / 2;
//
//                for(int i = 0; i < n; i++) {
//                    for (int j = 0; j < n; j++) {
//                        if ((i == mid || j == mid) ||
//                                (i == 0 && j > mid) ||
//                                (i == n - 1 && j < mid) ||
//                                (j == 0 && i < mid) ||
//                                (j == n - 1 && i > mid)) {
//                            System.out.print("* ");
//                        } else {
//                            System.out.print("  ");
//                        }
//                    }
//                    System.out.println();
//                }
//
//

//                int n = 7;
//                for (int i = 1; i < n; i++) {
//                    for (int j = 0; j < n; j++) {
//
//                        if ((i == 1 && j % 3!= 0 ) || (i==2 && j % 3 ==0)||
//                                ( i-j ==  3) || (i+j == 9)) {
//                            System.out.print("* ");
//                        }
//                        else {
//                            System.out.print("  ");
//                        }
//                    }
//                    System.out.println();
//                }

        for(int i = 1 ; i<=5 ; i++){
            for(int j = 5 ; j > i - 1; j--){
                if(i > j){
                    System.out.print("x");
                }
                else{
                    System.out.print(j);
                }

            }
            System.out.println();
        }





    }
}


