package Day16.LamdaExpression;

public class LamdaExp {
    static class NotLamdaExp{

        static class Interface {
            @FunctionalInterface
            interface Greeting {
                void Greet(String data);
            }
        }

        static class A implements Interface.Greeting {
            @Override
            public void Greet(String data) {
                System.out.println("Welcome to the Hood, " + data);
            }
        } // Closes class A
    } // Closes class LamdaExp

    static class Main {
        // Fixed: Standard signature requires 'public static void main(String[] args)'
        public static void main(String[] args) {
            NotLamdaExp.A a = new NotLamdaExp.A();
            a.Greet("Rohan");
        }

    }

    static class UsingLamdaExp {

        static class Interface {
            @FunctionalInterface
            interface Greeting {
                void Greet(String data);
            }
        }

        static class Main{
            public static void main(String[] args) {Interface.Greeting greeting = data -> System.out.println("Welcome to the Hood " + data);
                greeting.Greet("Rohan");
            }
        }

    }




    static class Eligibility{

        static class Interface {
            @FunctionalInterface
            interface Eligible {
                void Elle(int age,String data);
            }
        }

        static class Main{
            public static void main(String[] args) {
                Interface.Eligible Greet = ((age, data) -> {
                    boolean IsEligible = age >= 21 && "Male".equals(data);
                    if(IsEligible){
                        System.out.println("You are eligible");
                    }
                    else if(age >= 18 && "Female".equals(data)){
                        System.out.println("You are eligible");
                    }

                    else{
                        System.out.println("You are not eligible");
                    }
                });
                Greet.Elle(19, "Male");   // Prints: You are not eligible (under 21)
                Greet.Elle(21, "Male");   // Prints: You are eligible
                Greet.Elle(19, "Female"); // Prints: You are eligible (18+)
            }
        }

    }

}