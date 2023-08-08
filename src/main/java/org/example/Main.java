package org.example;


import org.example.models.Offer;
import org.example.models.Stablishment;
import org.example.models.User;
import org.example.utilities.MyDate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        User userOne = new User();
        Stablishment stablishmentOne = new Stablishment();
        Offer offerOne = new Offer();
        /*
        System.out.println("Add your user name");
        userOne.setNames(read.nextLine());
        System.out.println(userOne.getNames());

        System.out.println("Add your location");
        userOne.setLocation(read.nextInt());
        System.out.println(userOne.getLocation());
        }

        System.out.println("ADD your email address");
        userOne.setEmail(read.next());
        System.out.println(userOne.getEmail());


        System.out.println("Add the nit of your stablishment");
        stablishmentOne.setNit(read.next());
        System.out.println(stablishmentOne.getNit());


        System.out.println("Add your stablishment's name");
        stablishmentOne.setName(read.next());
        System.out.println(stablishmentOne.getName());


        System.out.println("Add your offer's title");
        offerOne.setTitle(read.nextLine());
        System.out.println(offerOne.getTitle());


        System.out.println("Add the begining's date of your event");
        offerOne.setDateBegining(read.next());
        System.out.println(offerOne.getDateBegining());

        System.out.println("Add the last's date of your event");
        offerOne.setDateLast(read.next());
        System.out.println(offerOne.getDateLast());

         */

        System.out.println("Add the person cost");
        offerOne.setCostPerson(read.nextDouble());
        System.out.println(offerOne.getCostPerson());
    }
}