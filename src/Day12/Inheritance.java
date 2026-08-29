package Day12;

public class Inheritance {

    static void ScholarshipEligble(float attendence, float CGPA) {
        if (attendence >= 75.0f && CGPA >= 9.0f) {
            System.out.println("You are Scholarship Eligible");
        } else {
            System.out.println("You are not Scholarship Eligib             m                                                      ble");
        }
    }

    void printDetails(OOP.Student S5) {
        System.out.println("Roll No: " + S5.rollNo);
        System.out.println("Email: " + S5.Email);
        System.out.println("Name: " + S5.Name);
    }

    public static void main(String[] args) {

        OOP.Student S5 = new OOP.Student(
                101,
                "rohanMeshram@gmail.com",
                "Rohan Meshram"
        );

        Inheritance obj = new Inheritance();
        obj .printDetails(S5);

        ScholarshipEligble(85.0f, 9.2f);
    }
}