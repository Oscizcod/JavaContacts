package com.example.javacontacts;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize flag
        boolean appRunning = true;

        while (appRunning) {
            main_menu();

            // Get user input for main menu option
            Scanner scanner = new Scanner(System.in);
            int mainMenuInp;

            try {
                mainMenuInp = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error! Please enter an option from the menu.\n");
                continue;
            }

            switch (mainMenuInp) {
                // Accessing contacts
                case  1:
                    boolean mainMenuRunning = true;

                    while (mainMenuRunning) {
                        contact_menu();

                        int contactMenuInp;

                        try {
                            contactMenuInp = scanner.nextInt();
                        } catch (Exception e) {
                            System.out.println("Error! Please enter an option from the menu.\n");
                            continue;
                        }

                        switch (contactMenuInp) {
                            case 1:
                                // Show all contacts
                                break;
                            case 2:
                                // Add a new contact
                                break;
                            case 3:
                                // Search for contact
                                break;
                            case 4:
                                // Delete contact
                                break;
                            case 5:
                                // Return to main menu
                                mainMenuRunning = false;
                                break;
                            default:
                                System.out.println("Error! Please enter an option from the menu.");
                        }
                    }

                    break;

                // Accessing messages
                case 2:
                    message_menu();
                    break;

                // Quit application
                case 3:
                    appRunning = false;
                    break;
                default:
                    System.out.println("Error! Please enter one of the options provided in the menu.\n");
            }
        }
    }
    public static void main_menu() {
        System.out.println("Welcome to the phone contact app!\n");
        System.out.println("Please select from the following options:\n"
                            + "\t1. Manage contacts\n"
                            + "\t2. Messages\n"
                            + "\t3. Quit\n");
    }

    public static void contact_menu() {
        System.out.println("Please select from the following options:\n\n "
                            + "\t1. Display contacts\n"
                            + "\t2. Add a new contact\n"
                            + "\t3. Search for a contact\n"
                            + "\t4. Delete a contact\n"
                            + "\t5. Go back to previous menu\n");
    }

    public static void message_menu() {
        System.out.println("Please select from the following options:\n\n"
                            + "\t1. See all messages\n"
                            + "\t2. Send a new message\n"
                            + "\t3. Go back to previous menu\n");
    }


}
