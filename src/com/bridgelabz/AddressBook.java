package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    static Scanner input = new Scanner(System.in);
    static Scanner input1 = new Scanner(System.in);

    public void createContact(){
        System.out.println("Enter First name: ");
        String firstName = input.next();
        System.out.println("Enter Last name: ");
        String lastName = input.next();
        System.out.println("Enter Address: ");
        String address = input.next();
        System.out.println("Enter City: ");
        String city = input.next();
        System.out.println("Enter State: ");
        String state = input.next();
        System.out.println("Enter Zip: ");
        int zip = input.nextInt();
        System.out.println("Enter Mobile number: ");
        String phoneNumber = input.next();
        System.out.println("Enter Email: ");
        String email = input.next();

        Contact contact = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
        System.out.println(contact);
    }
}
