import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a secure password that meets these requirements:");
        System.out.println("- Is at least 8 characters long");
        System.out.println("- Contains at least one uppercase letter");
        System.out.println("- Contains at least one lowercase letter");
        System.out.println("- Contains at least one numeric digit");
        System.out.println("- Contains at least one of these symbols: ! @ # $ % ^ & * ?");
        System.out.print("\nEnter your secure password: ");
        String password = scanner.nextLine();

    /* to be implemented
       create and use a SecurePassword object with the user’s password and determine
       if it’s secure (using isSecure()), and if not, provide them a status update
       (using status()) and prompt them to try again until they have a password that
       meets all requirements.  Then inform them, "Password is secure" and end.

       Note that, as the user provides updated passwords, you will need to update the
       password in your SecurePassword object using the setter method, .setPassword(),
    */

        SecurePassword p =  new SecurePassword(password);
        String change = "y";

        while (change.equals("y")) {
            if (p.isSecure()) System.out.println(p.status());
            else System.out.println(p.status());

            System.out.print("Would you like to change your password (y or n): ");
            change = scanner.nextLine();

            if (change.equals("y")) {
                System.out.print("Enter your new password:");
                p.setPassword(scanner.nextLine());
            }
        }

        System.out.println("Have a good day.");

    }
}