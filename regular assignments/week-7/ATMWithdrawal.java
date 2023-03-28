import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();

        if (amount % 100 != 0) {
            System.out.println("Entered amount must be multiples of 100");
            return;
        }

        int numNotes500 = amount / 500;
        int numNotes200 = (amount % 500) / 200;
        int numNotes100 = (amount % 500 % 200) / 100;
        int totalNotes = numNotes500 + numNotes200 + numNotes100;

        System.out.println("Minimum number of notes: " + totalNotes);

        scanner.close();
    }
}