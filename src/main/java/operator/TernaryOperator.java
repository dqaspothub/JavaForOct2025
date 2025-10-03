package operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 19;

        int student_Mark = 35;

        // Traditional if-else
        String status;

        if (age >= 18) {
            status = "Adult";
        } else {
            status = "Minor";
        }

        // Ternary equivalent
        String ternaryStatus = (age >= 18) ? "Adult" : "Minor";

        System.out.println("If-Else Result: " + status);           // Adult
        System.out.println("Ternary Result: " + ternaryStatus);    // Adult

        if (student_Mark >= 35) {
            System.out.println("You are pass");

        } else {
            System.out.println("You are fail");
        }

        char student_Mark_Status = (student_Mark >= 35) ? 'P' : 'F';

        System.out.println(student_Mark_Status);
    }}