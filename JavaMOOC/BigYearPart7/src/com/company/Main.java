package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Birds> birds = new ArrayList<>();
       // UserInterface ui = new UserInterface(scanner);

        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();

            if (command.toLowerCase(Locale.ROOT).trim().equals("quit")) {
                break;
            }

            switch (command.toLowerCase(Locale.ROOT)) {
                case "quit":
                    break;

                case "add":
                    // calls method
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Name in Latin: ");
                    String latinName = scanner.nextLine();
                    Birds recipe = new Birds(name, latinName);
                    break;


                case "observation":
                    System.out.println("Bird?");
                    String searchWord = scanner.nextLine();
                     // if bird database does not contain searchWord.toLowerCase
                        for (Birds e : birds) {
                            if (e.nameContains(searchWord.toLowerCase(Locale.ROOT))) {
                                e.addObservation();
                            } else {
                                System.out.println("Not a bird!");
                            }

                        }
                    break;


                case "all":
                    for (Birds e : birds){
                        System.out.println(e);
                    }
                    break;


                case "one":
                    System.out.println(birds.indexOf(0));
                    break;


                default:
                    System.out.println("Unknown command");
                    break;

            }

        }

    }
}




