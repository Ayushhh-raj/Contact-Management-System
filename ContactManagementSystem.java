package com.ContactManagement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ContactManagementSystem {
	public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. List Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    contactManager.addContact(new Contact(name, phoneNumber, email));
                    break;
                case 2:
                    System.out.print("Enter Name of Contact to Delete: ");
                    name = scanner.nextLine();
                    contactManager.deleteContact(name);
                    break;
                case 3:
                    System.out.print("Enter Name of Contact to Search: ");
                    name = scanner.nextLine();
                    contactManager.searchContact(name);
                    break;
                case 4:
                    contactManager.listContacts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
