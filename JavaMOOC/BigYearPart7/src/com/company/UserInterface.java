//package com.company;
//
//import java.util.Scanner;
//
//public class UserInterface {
//
//    private Scanner scanner;
//
//    public UserInterface(Scanner scanner) {
//        this.scanner = scanner;
//    }
//
//    public static void start() {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("?");
//            String command = scanner.nextLine();
//
//            switch (command) {
//                case "quit":
//                    break;
//
//                case "add":
//                    // calls method
//                    System.out.println("Name: ");
//                    String name = scanner.nextLine();
//                    System.out.println("Name in Latin: ");
//                    String latinName = scanner.nextLine();
//                    Birds recipe = new Birds(name, latinName);
//
//                    break;
//
//                case "observation":
//                    System.out.println("Bird?");
//                    String searchWord = scanner.nextLine();
//                    if (searchWord.) // if bird database does not contain searchWord.toLowerCase sout "Not a bird!"
//                    break;
//
//                case "all":
//                    Birds[] birds;
//                    for (Birds e : birds){
//
//                    }
//                    break;
//
//                case "one":
//                    searchWord = scanner.nextLine();
//                    break;
//
//                default:
//                    System.out.println("Unknown command");
//
//            }
//
//        }
//
//    }
//}
//
