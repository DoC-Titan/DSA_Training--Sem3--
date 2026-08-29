    package Day14;

    public class Interfaces {

        /*
        Interface and Functional Interface : If there is only one abstract method then the Interface is called Functional interface Use's an annotation called -- @FunctionalInterface
        But in Functional interface we use Lambda expression Anonymous function so that to override the method of the Functional Interface without needing a  class to be implement to override.
         */

        static class NotConstructor {

            interface Transaction {
                void process(double data);
            }


            static class Credit_Card implements Transaction {
                @Override
                public void process(double data) {
                    System.out.println("Payment Processing through Credit Card: " + data);
                }
            }

            static class Debit_Card implements Transaction {
                @Override
                public void process(double data) {
                    System.out.println("Payment Processing through Debit Card: " + data);

                }
            }

            static class Main {
                static void main(String[] args) {

                    Credit_Card cc = new Credit_Card();
                    Debit_Card dc = new Debit_Card();
                    cc.process(10);
                    dc.process(10);

                    Transaction t1 = new Credit_Card();
                    t1.process(10_00);

                }
            }

            static class ObjArray {
                void main(String[] args) {
                    Transaction[] Arr = {new Credit_Card(), new Debit_Card(), new Debit_Card()};
                    for (Transaction t : Arr) {
                        t.process(10_000);
                    }

                }
            }
        }
        //------------------------------------------------------------


        static class withConstructor{
            public interface Transaction{
                void process();
            }

            static class Credit_Card implements Transaction{
                double data;
                Credit_Card(double data) {
                    this.data = data;
                }
                @Override
                public void process() {
                    System.out.println("Payment Processing through Credit Card: "  + this.data);
                }
            }

            static class Debit_Card implements Transaction{
                double data;
                Debit_Card(double data) {
                    this.data = data;
                }
                @Override
                public void process() {
                    System.out.println("Payment Processing through Debit Card: "  + this.data);

                }
            }
            public static class ObjArray{
               public static void main(String[] args){
                    Transaction [] Arr = {new Credit_Card(1000),new Debit_Card(50000), new Debit_Card(1234567890)};
                    for(Transaction t : Arr){
                        t.process();
                    }

                }
            }
        }
    }
