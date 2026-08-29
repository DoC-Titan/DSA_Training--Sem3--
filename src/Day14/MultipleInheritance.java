package Day14;

public class MultipleInheritance {
    public interface A{
        void M1();
        void M2();

        static void M3(){
            System.out.println("Interface A , M3 method");
        }
    }
    public interface B{
        void M4();
        void M5(int a);

        static void M3(){
            System.out.println("Interface B , M3 method");
        }
    }

     static class X implements A,B{
        @Override
        public void M1(){

        }
        @Override
        public void M2(){

        }

        @Override
         public void M4(){

        }
        @Override
        public void M5(int a){

        }
    }
    static class Main{
        public static void main(String[] args){
            X x = new X();
            x.M1();
            x.M2();

            A.M3();
            B.M3();

        }
    }
}
