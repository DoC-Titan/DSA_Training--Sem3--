package DAY10;

public class Decode {
    //DAy10
    static class EncodeString {
        public static void main(String[] args) {
            String S = "aaabbxxaa";

            int count = 1; // moved OUTSIDE the for loop so it persists across a run

            for (int i = 0; i < S.length(); i++) {

                if (i + 1 < S.length() && S.charAt(i) == S.charAt(i + 1)) {
                    count++;

                }
                else{
                    System.out.print(S.charAt(i) + "" + count);
                    count = 1;

                }

            }

        }
    }
    static class DecodeString {
        public static void main(String[] args) {
            String S = "a30x2a2g2z1x3";
            StringBuilder S1 = new StringBuilder();

            int i = 0;
            while (i < S.length()) {
                char ch = S.charAt(i);   // the letter
                i++;

                // read ALL following digits to build the full number (handles multi-digit counts)
                int count = 0;
                while (i < S.length() && Character.isDigit(S.charAt(i))) {
                    count = count * 10 + (S.charAt(i) - '0');
                    i++;
                }

                // append the letter 'count' times
                for (int j = 0; j < count; j++) {
                    S1.append(ch);
                }
            }

            System.out.println(S1.toString());
        }
    }
}

