import java.util.Scanner;

public class banking_systemV1dot2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] username = {"Joe Doe", "Alice Smith", "Bob Jones"};
        String[] passwords = {"pass123", "alice2024", "bobpass"};
        double[] balances = {150.10, 2500.00, 450.50};

        int userIndex = -1;
        boolean loggedIn = false;
        int pass_tries = 3;

        while (pass_tries > 0 && !loggedIn) {
            System.out.print("Please enter your Password: ");
            String passW = input.nextLine();

            for (int i = 0; i < passwords.length; i++) {
                if (passW.equals(passwords[i])) {
                    loggedIn = true;
                    userIndex = i;
                    break;
                }
            }

            if (!loggedIn) {
                pass_tries--;
                System.out.println("Password wrong. Tries left: " + pass_tries);
            }
        }

        if (loggedIn) {
            System.out.println("\nWelcome Mr " + username[userIndex]);
            System.out.println("Your current balance is: R" + balances[userIndex]);

            System.out.print("Do you want to withdraw? (Y/N): ");
            String with_permission = input.next();

            if (with_permission.equalsIgnoreCase("Y")) {
                System.out.print("How much would you like to withdraw?: R");
                double with_amou = input.nextDouble();

                if (with_amou <= balances[userIndex]) {
                    balances[userIndex] = balances[userIndex] - with_amou;
                    System.out.println("You withdrew: R" + with_amou);
                    System.out.println("Your new balance is: R" + balances[userIndex]);
                } else {
                    System.out.println("Insufficient funds! Your balance is R" + balances[userIndex]);
                }
            }
        } else {
            System.out.println("Account locked. Contact UniBank support.");
        }

        input.close();
    }
}