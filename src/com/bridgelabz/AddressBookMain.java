package com.bridgelabz;

import java.util.Scanner;

import java.util.Scanner;

public class AddressBookMain {
    // main method
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System ! ");
        //Create an Object
        Contacts obj = new Contacts();
        obj.setFirstName("Bala");
        obj.setLastName("Chandar");
        obj.setCity("MTM");
        obj.setState("AP");
        obj.setPin("521100");
        obj.setMobileNo("9441520386");
        obj.setEmail("Bala@gmail.com");
        System.out.println("Contact details: "+obj.getFirstName()+" "+ obj.getLastName()+" "+ obj.getCity()+" "+ obj.getState()+" "+ obj.getPin()+" "+ obj.getMobileNo()+" "+ obj.getEmail());
        System.out.println("Thank for Using Address book");

    }
}


	

