package DAY6;
import java.util.Arrays;

public class suffix {





        public static void main(String[] args){

            int[] arr = {1,2,5,6,7,2};
            int i;
            int sum = 0;

            int[] prefix = new int[arr.length];

            for(i = arr.length - 1  ; i >= 0 ; i--){
                sum += arr[i];
                prefix[i] = sum;
            }
            prefix[arr.length - 1] =0;
            System.out.println("Result: ");
            System.out.println(Arrays.toString(prefix));


        }


}
