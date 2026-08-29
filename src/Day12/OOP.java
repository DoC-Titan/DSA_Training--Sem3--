    package Day12;

    public class OOP {

        static class Student{
            int rollNo;
            String Email;
            String Name;
            static String CollegeName = "RBU";
            Student(int rollNo , String Email , String Name){
                this.rollNo = rollNo;
                this.Email = Email;
                this.Name = Name;
            }

            Student(){
                System.out.println("Welcome Student");
                System.out.println(this.rollNo);
            }
            Student(int a ){
                this();
                System.out.println("Int " + a);
            }
            public static void main(String[] args){

                Student s1 = new Student(101 , "123@gmail.com" , "Rohan");
                System.out.println(s1.Name);
                System.out.println(s1.rollNo);
                System.out.println(s1.Email);
                System.out.println(Student.CollegeName);
                System.out.println(s1.CollegeName);

                System.out.println();

                Student s3 = new Student(69 , "VALUESNULL@gmail.com" , "P-Diddy");
                System.out.println(+ s3.rollNo);
                System.out.println(s3.Email);
                System.out.println(s3.Name);
                System.out.println(Student.CollegeName);
                System.out.println(s3.CollegeName);

    //            Student S1 = new Student();
    //            S1.rollNo = 100;
    //            S1.Email = "rohanmeshram324@gmail.com";
    //            S1.Name = "Rohan Meshram";
    //            System.out.println("Roll NO. of Student: " + S1.rollNo);
    //            System.out.println("Name of the Student: " + S1.Name);
    //            System.out.println("Email of the Student: " + S1.Email);
    //            System.out.println("College Name: " + Student.CollegeName);
    //
    //
    //            Student S2 = new Student();
    //
    //            S2.rollNo = 10;
    //            S2.Email = "324@gmail.com";
    //            S2.Name = "R0han";
    //            System.out.println("\nRoll NO. of Student: " + S2.rollNo);
    //            System.out.println("Name of the Student: " + S2.Name);
    //            System.out.println("Email of the Student: " + S2.Email);
    //            System.out.println("College Name: " + Student.CollegeName);

            }
        }


    }
