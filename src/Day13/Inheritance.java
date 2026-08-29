package Day13;

import java.lang.classfile.Superclass;

public class Inheritance {
    static class MulitlevelInheritance {
        static class GrandFather {
            void land1() {
                System.out.println("THis belongs to grandfather");
            }
        }

        static class Father extends GrandFather {
            void land2() {
                System.out.println("THis belongs to father");
            }

            void Car() {
                System.out.println("THis Car belongs to father");
            }
        }

        static class Child extends Father {
            void land3() {
                System.out.println("THis belongs to child");
            }

            void bike() {
                System.out.println("THis bike belongs to Child");
            }
        }

        public static void main(String[] args) {
            System.out.println("CALLING FROM CHILD CLASS");
            Child c1 = new Child();
            c1.land1();
            c1.land2();
            c1.land3();
            c1.bike();
            c1.Car();
        }
    }



    static class HierarchicalInheritance {
        static class Employee {
            int empID;
            String empName;

            Employee(int empID, String empName) {
                this.empID = empID;
                this.empName = empName;
            }
            Employee() {}
            void logIN(){
                System.out.println(this.empName + " Logged In");
            }
            void logOUT(){
                System.out.println(this.empName + " Logged Out \n");
            }

        }
        static class Developer extends Employee {

            Developer(int empID, String empName) {
                super(empID, empName);
            }


            void develop(){
                System.out.println(super.empName + " Developping");
            }
        }



        static class Manager extends Employee {
            Manager(int empID, String empName) {
                super(empID, empName);
            }

            void work(){
                System.out.println(super.empName + " Is the Manager");
            }
        }

        static class SalesPerson extends Employee {
            SalesPerson(int empID, String empName) {
                super(empID, empName);
            }

            void sell(){
                System.out.println(super.empName + " Selling");
            }
        }

        static class Main{
            public static void main(String[] args) {
                Developer D1 = new Developer(123, "XENO");
                Developer D2 = new Developer(234, "MONO");
                Manager M1 = new Manager(234, "ZER0");
                SalesPerson SP1 = new SalesPerson(189, "D0R0");

                D1.logIN();
                D1.develop();
                D1.logOUT();


                D2.logIN();
                D2.develop();
                D2.logOUT();


                M1.logIN();
                M1.work();
                M1.logOUT();


                SP1.logIN();
                SP1.sell();
                SP1.logOUT();

            }
        }
    }
}
