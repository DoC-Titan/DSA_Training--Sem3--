package DAY6;

public class Prefixsum {


    public static void main(String[] args){

        int[] arr = {2,3,2,6};
        int i = 0;
        int sum = 0;
        int[] prefix = new int[arr.length];
        for(i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            prefix[i] = sum;



        }
        System.out.println("Result: ");
        for(i = 0; i < arr.length ; i++){

            int data = prefix[i];

            System.out.print(data);
        }


    }
}
