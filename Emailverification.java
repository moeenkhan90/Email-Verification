import java.util.Scanner;

public class Emailverification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        if (email.contains("@") && email.contains(".")
                && email.indexOf("@") > 0
                && email.indexOf("@") < email.lastIndexOf(".")) {

            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}