package Day17;

public class Exception {
    /*
    Exception is an unexpected event that occurs at runtime that will when ever its raised  the
    program is terminated abnormally  therefore the rest of the code won't be exceuted.
    Catch and try and throws to handle exception;

    parent class for Exception is the Exception itself.

    One try block can have multiple catch block
     */

    public static void main(String [ ] Args){

        System.out.println("LInes of code");

        try{
            System.out.println(80/0);
        }catch(ArithmeticException e){
            System.out.println("Don't divide by zero");
        }

        System.out.println("Lines of COde");

    }
}
