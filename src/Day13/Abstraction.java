package Day13;

public class Abstraction {

    static abstract class ATM {
        abstract void Deposit();
        abstract void Withdrawal();

        void welcome(){
            System.out.println("Welcome to ATM");
        }
    }
    static class SBI extends ATM {
        @Override
        void Deposit(){
            System.out.println("Deposited to SBI");

        }
        @Override
        void Withdrawal(){
            System.out.println("Withdrawn from SBI");
        }
    }

    static class Kotak extends ATM {
        @Override
        void Deposit(){
            System.out.println("Deposited to Kotak with -10rs penalty");
        }
        @Override
        void Withdrawal(){
            System.out.println("Withdrawn from Kotak  with -10rs penalty");
        }
    }

    static void main() {
        SBI s3 = new SBI();
        s3.welcome();
        s3.Deposit();
        s3.Withdrawal();

        System.out.println();

        Kotak k1 = new Kotak();
        k1.welcome();
        k1.Deposit();
        k1.Withdrawal();

        System.out.println();

        ATM s2 = new Kotak();
        s2.welcome();
        s2.Deposit();
        s2.Withdrawal();


    }
}
