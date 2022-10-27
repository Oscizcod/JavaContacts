package com.example.javacontacts;


public class Main {
    public static void main(String[] args) {
        main_menu();
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
