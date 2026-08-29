package Day16;

public class Encapsulaion {


    //It's a process of binding, grouping, and wrapping of various variables and methods in single container(class);
    //It can prevent data misuse by using access modifiers, {public, private , protected}
    //-----------------------------Public: Methods Can be accessed throught the package
    //
    //-----------------------------Private: Cannod be accesed by the packages not even by the child class( Cannot be changed outised the class )
    //---------------------------------------------Setter & Getters  (Only way to change Private access modifiers outiside the class):



    static class Bank{
        int accNumber;
        String name;
        private double balance = 1_000;

        Bank(int accNumber, String name){
            this.accNumber = accNumber;
            this.name = name;

        }
        public double getBalance() { //This is a getter method
            return balance;
        }
        public void setBalance(double balance) {  // this is a Setter Method
            this.balance = balance;
        }

        public double withdrawl(double amount){
            if(amount > this.balance){
                System.out.println("Insufficient funds");
            }
            else if(amount < 0){
                System.out.println("Enter a positive number");
            }
            else{
                this.balance -= amount;

            }
            return balance;
        }

        public String deposit(double amount) {
            return amount <= 0
                    ? "Enter Valid Number"
                    : "Deposit successful. New balance: " + (this.balance += amount);
        }


    }

     static class SbiBank{

        static class Sbi extends Bank{
            Sbi(int acc ,  String name){
                super(acc, name);

            }
        }

        public static void main(String[] args){
            Sbi S = new Sbi(3456789 , "EXO");
            System.out.println("Account Number: " + S.accNumber + "\nName: " + S.name + "\nBalance Before:" + S.getBalance());

            //S.balance; Will not work because its a private variable therfore we need to create a Getter method for it.

            S.setBalance(100_000);
            System.out.println("Balance After using the setter Method: " + S.getBalance());

            S.deposit(100_000);
            System.out.println("Balance After Deposit: " + S.getBalance());

        }

    }


    public static void main(String[] args){
        Bank b = new Bank(12345678, "Rohan");
        System.out.println("Account Number: " + b.accNumber + " \nName: " + b.name);
    }




}
