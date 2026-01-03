package bloodbank;

import java.util.Scanner;

public class Donor {
    String name;
    int age;
    String bloodGroup;

    Scanner sc = new Scanner(System.in);

    public void addDonor() {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Blood Group: ");
        bloodGroup = sc.nextLine();

        System.out.println("Donor Added Successfully!");
    }

    public void viewDonor() {
        if (name == null) {
            System.out.println("No donor data available");
        } else {
            System.out.println("\n--- Donor Details ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Blood Group: " + bloodGroup);
        }
    }
}
