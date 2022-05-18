package com.bridgelabz;

import static com.bridgelabz.AddressBook.input1;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program!!");
        AddressBook addressBook = new AddressBook();

        int choice;

        do {
            System.out.println("Enter your choice: ");
            System.out.println("1: Create contact.");
            System.out.println("0: Exit.");
            choice = input1.nextInt();

            switch (choice){
                case 1:
                    addressBook.createContact();
                break;

                default:
                    System.out.println("Enter valid input.");
            }
        }while (choice != 0);
    }
}
