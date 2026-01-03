package bloodbank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Donor donor = new Donor();

        while (true) {
            System.out.println("\n--- Blood Bank Management System ---");
            System.out.println("1. Add Donor");
            System.out.println("2. View Donor");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                donor.addDonor();
            } else if (choice == 2) {
                donor.viewDonor();
            } else if (choice == 3) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
