package DAY6;

import java.util.Arrays;

public class Productfix {

//    public static void main(String[] args){
//
//        int[] arr = {1,2,3,4};
//
//        int[] prodfix = new int[arr.length];
//        for(int i = 0 ; i < arr.length ; i++){
//            int prod = 1;
//            for(int j = 0 ; j< arr.length; j++){
//
//                if(i != j){
//                    prod *= arr[j];
//
//
//                }
//                prodfix[i] = prod;
//            }
//
//        }
//        System.out.println("REsult");
//     System.out.println(Arrays.toString(prodfix));
//
//    }






        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4};
            int[] prodfix = getProductExceptSelf(arr);

            System.out.println("Result");
            System.out.println(Arrays.toString(prodfix));
        }

        public static int[] getProductExceptSelf(int[] arr) {
            int n = arr.length;
            int[] prodfix = new int[n];

            int zeroCount = 0;
            int totalProductWithoutZero = 1;

            // Step 1: Calculate total product of non-zero numbers & count zeros
            for (int num : arr) {
                if (num == 0) {
                    zeroCount++;
                } else {
                    totalProductWithoutZero *= num;
                }
            }

            // Step 2: Handle cases intuitively

            // Case A: More than 1 zero -> everything becomes 0
            if (zeroCount > 1) {
                return prodfix; // Java arrays default to all 0s
            }

            // Case B: Exactly 1 zero -> only the zero index gets a non-zero value
            if (zeroCount == 1) {
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 0) {
                        prodfix[i] = totalProductWithoutZero;
                    }
                }
                return prodfix;
            }

            // Case C: No zeros -> normal division
            for (int i = 0; i < n; i++) {
                prodfix[i] = totalProductWithoutZero / arr[i];
            }

            return prodfix;
        }


}
