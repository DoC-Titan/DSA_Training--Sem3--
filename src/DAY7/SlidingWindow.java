package DAY7;

public class SlidingWindow {

//    public static void main(String[] args){
//
//        int k = 3;
//        int WindowSum = 0;
//        int [] Arr = {4,7,10,17,5,9,1};
//        int [] SubArr = new int[3];
//        for(int i = 0; i< k ; i++){
//            WindowSum += Arr[i];
//        }
//
//        int MaxSum = WindowSum;
//            for(int i = k ; i < Arr.length; i++){
//                WindowSum += Arr[i] - Arr[i - k];
//                MaxSum = Math.max(WindowSum,MaxSum);
//            }
//        System.out.println("MAX-Sum of Subarray: " + MaxSum);
//
//    }

    static int maxSumArray(int[] Arr, int k ){
        int sum = 0;
        int max = 0;

        for(int i =0 ; i < k ; i++){
            sum += Arr[i];
        }
        int MAX = sum;
        for(int i = 0 ; i < Arr.length - k; i++){
               sum +=  - Arr[i] + Arr[i + k];
               max = Math.max(sum,max);
        }



        return max;
    }

    public static void main(String[] args){
        int [] Arr = {4,7,10,17,5,9,1};
        int k = 3;

        System.out.println("MAX-SUM-SUBARRAY: " + maxSumArray(Arr , k)) ;

    }

}
