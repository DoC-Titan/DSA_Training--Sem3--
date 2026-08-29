package Day11;

public class StringSwap {

    public static void main(String[] args) {

//        String S = new String("ABCD");
//
//        char[] ch = new char[S.length()];
//
//        for (int i = 0; i < S.length(); i++) {
//            ch[i] = S.charAt(i);
//        }
//
//        for (int i = 0; i < ch.length - 1; i += 2) {
//            char temp = ch[i];
//            ch[i] = ch[i + 1];
//            ch[i + 1] = temp;
//        }
//
//        String S2 = new String(ch);
//        System.out.println(S2);

        String S = "ABCeDF";
        String result = ""; // empty string

        for (int i = 0; i < S.length() ; i += 2) {
            if(i  == S.length() - 1){
                result += S.charAt(i);
            }
            else {
                result += S.charAt(i + 1);

                result += S.charAt(i);
            }
        }

        System.out.println(result); // "BADC"
    }



    static class  LargestWord{
        public static void main(String[] args){

            String S1 =  new String("pneumonoultramicroscopicsilicovolcanoconiosis is the largest word");
            String[] Word = S1.split("\\s+");
            String Maxword = "";

            for(int i = 0;  i < Word.length ; i++){
                if(Word[i].length() > Maxword.length()){
                    Maxword = Word[i];
                }
            }
            System.out.println("LArgest Word: " + Maxword);

        }
    }

    static class  ReverseWord{
        public static void main(String[] args){

            String S1 =  new String("The largest Word");
            String[] Word = S1.split(" ");
            String ReverseWord = "";


            for(int i = Word.length - 1;  i >= 0  ; i--){
                ReverseWord += Word[i];
                if( i != 0){
                    ReverseWord += " ";
                }

            }
            System.out.println("Reveresed Word: " + ReverseWord);

        }
    }
}