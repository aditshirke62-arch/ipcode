import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int correctpin = 4423;
        int attempt = 1;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Pin:");
            int inputpin = sc.nextInt();

            if (inputpin == correctpin) {
                System.out.println("Access Granted");
                break;
            } else {
                System.out.println("Incorrect password");
            }

            attempt++;

        } while (attempt <= 3);

        if (attempt > 3) {
            System.out.println("Too many attempts. Access Denied.");
        }

        sc.close();
    }
}
