package Day9;

import java.util.Arrays;

public class string {
//
//
//    String S1 = "Sai";
//    String  S2 = "Sai";
//    String Literals, Stored in string constant poll, (intitially checks if the data is SCP already present or not// ,
//    Variables are stored in Stack memory (Data stored in SCP(Heap)) , Since S1 and S2 holds the same data , it will check where the data is
//    already present in the SCP or not , if present , in the Stack S2 will have the same address as S1 since it came first and map's the Same address

//    S1 = S1 + "Ram";
//    //since we are changing the String 1 it will check the SCP and if not present it create a new refrence inside the stack memory
    //String S3 = new string("Ram")
    //String objects are stored inside heap ,  it will always create a new


    //      == {Checks the Address}  &      equals()   {Checks the Data}

    //

//    public static void main(String[] args){
//
    ////        String S1  = new String("Apple's");
    ////
    ////        for(int i = 0; i < S1.length() ; i++ ){
    ////
    ////            System.out.print(S1.charAt(i) + "  ");
    ////
    ////
    ////        }
    ////        System.out.println();
    ////
    ////        for(int i = S1.length() - 1 ; i >=0 ; i--){
    ////
    ////
    ////
    ////
    ////            System.out.print(S1.charAt(i) + "  " );
    ////        }
//

//
//
//    }
    static class AlphabhetCount {

        public static void main(String[] args) {

            String S1 = new String("Sai@12$");
            int digit_count = 0;
            int char_Count = 0;
            int Special_Count = 0;

            for (int i = 0; i < S1.length(); i++) {

                char ch = S1.charAt(i);

                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    char_Count++;
                } else if (ch >= '0' && ch <= '9') {
                    digit_count++;
                } else {
                    Special_Count++;
                }

            }
            System.out.println("Character's: " + char_Count);
            System.out.println("Digits's: " + digit_count);
            System.out.println("Specials's: " + Special_Count);
        }
    }

    static class Frequency {
        public static void main(String[] args) {
            int[] freq = new int[256];
            String S = new String("aba!!aAAAAAbcz");
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                freq[ch]++;
            }

            for (int j = 0; j < freq.length; j++) {
                if (freq[j] > 0) {
                    System.out.println((char) j + "=" + freq[j]);
                }
            }
        }
    }

    static class Anagram {
        public static void main(String[] args) {
            int[] freq = new int[256];
            int[] freq1 = new int[256];
            String S = new String("silent");
            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                freq[ch]++;
            }
            String S1 = new String("listen");
            for (int i = 0; i < S1.length(); i++) {
                char ch = S1.charAt(i);
                freq1[ch]++;
            }

            if (Arrays.equals(freq, freq1)) {
                System.out.println(S1 + " and " + S + " Are Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }
}
