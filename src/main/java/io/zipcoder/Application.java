package io.zipcoder;


import java.util.ArrayList;
import java.util.Scanner;

public class Application {

        public static void main(String[] args) {

            String petType, petName;
            ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many pets do you have");
            int numberOfPets = scanner.nextInt();

            for (int i = 1; i < numberOfPets; i++) {
                System.out.println("What pet do you have?");
                petType = scanner.next();
                System.out.println("what is your pets name?");
                petName = scanner.next();
                if ("dog".equals(petType.toLowerCase())) {
                    animalArrayList.add(new Dog(petType, petName));
                } else if ("cat".equals(petType.toLowerCase())) {
                    animalArrayList.add(new Cat(petType, petName));
                } else if ("zebra".equals(petType.toLowerCase())) {
                    animalArrayList.add(new Zebra(petType, petName));
                }
            }
            for (Animal animalObj : animalArrayList) {
                System.out.println(animalObj.getName() + " " + animalObj.speak());
            }
        }

    }

