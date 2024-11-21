package com.event.registration; // Package declaration at the top

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Event Registration Form ===");
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your Contact Number: ");
        String contact = scanner.nextLine();

        System.out.println("\n--- Registration Details ---");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Contact: " + contact);

        System.out.println("\nRegistration Successful! Thank you for registering.");
        scanner.close();
    }
}
