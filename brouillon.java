package cnam;

import java.util.*;
import java.util.stream.Collectors;


public class brouillon {
//    public static void main(String[] args) {
//        // Two strings to compare
//        String str1 = "apple";
//        String str2 = "apple";
//
//        // Compare the strings lexicographically
//        int result = str1.compareToIgnoreCase(str2);
//
//        System.out.println(result);
//
//        System.out.println("----------------------------------------");
//
//        // Print the comparison result
//        if (result < 0) {
//            System.out.println(str1 + " comes before " + str2 + " in alphabetical order.");
//        } else if (result > 0) {
//            System.out.println(str1 + " comes after " + str2 + " in alphabetical order.");
//        } else {
//            System.out.println(str1 + " and " + str2 + " are equal.");
//        }
//    }

//    public static void main(String[] args) {
//        // Array of names
//        String[] names = {"Alice", "Bob", "Charlie", "david"};
//
//        // Name to check
//        String nameToCheck = "David";
//
//        // Check if the name exists in the array, ignoring case differences
//        boolean exists = doesNameExist(names, nameToCheck);
//
//        // Print the result
//        if (exists) {
//            System.out.println(nameToCheck + " exists in the array.");
//        } else {
//            System.out.println(nameToCheck + " does not exist in the array.");
//        }
//    }
//
//    // Method to check if a name exists in the array, ignoring case differences
//    private static boolean doesNameExist(String[] names, String name) {
//        // Iterate through the array
//        for (int i = 0; i < names.length; i++) {
//            // Check if the current name in the array is equal to the name we're checking,
//            // ignoring case differences
//            if (names[i].equalsIgnoreCase(name)) {
//                System.out.println("==============================");
//                System.out.println(names[i].equalsIgnoreCase(name));
//                System.out.println("++++++++++++++++++++++++++++++");
//                return true; // Return true if a match is found
//            }
//        }
//        // If no match is found, return false
//        return false;
//    }

//    public static void main(String[] args) {
//        String name = "alex";
//        boolean res = name.equalsIgnoreCase("alex");
//        System.out.println(res);
//    }


//    public static void main(String[] args) {
//        // Two strings to compare
//        String str1 = "Hellob";
//        String str2 = "hello";
//
//        // Check if the strings are equal, ignoring case differences
//        boolean isEqual = str1.equalsIgnoreCase(str2);
//
//        // Print the result
//        if (isEqual) {
//            System.out.println("The strings are equal ignoring case.");
//        } else {
//            System.out.println("The strings are not equal ignoring case.");
//        }
//    }


//        public static void main(String[] args) {
//            // Create a Scanner object to read input from the user
//            Scanner scanner = new Scanner(System.in);
//
//            // Prompt the user to enter a single character
//            System.out.print("Please enter a single character: ");
//
//            // Read the next token (a word) from the user input
//            String input = scanner.next();
//
//            // Extract the first character from the input word
//            char response = input.charAt(0);
//
//            // Print the extracted character
//            System.out.println("The first character you entered is: " + response);
//
//            // Close the Scanner to release resources
//            scanner.close();
//        }



        public static void main(String[] args) {
            // Define the maximum number of elements
            final int MAX_ADHERENTS = 5;

            // Create an array of strings with a fixed size
            String[] noms = new String[MAX_ADHERENTS];

            // Populate the array with data
            noms[0] = "Alice";
            noms[1] = "Bob";
            noms[2] = "Charlie";
            noms[3] = "David";
            noms[4] = "Emma";

            // Print the elements of the array
            System.out.println("Elements of the array:");

            // FOREACH
            for (String nom:
                 noms) {
                System.out.println(nom);
            }

            // FOR
//            for (int i = 0; i < MAX_ADHERENTS; i++) {
//                System.out.println(noms[i]);
//            }
            List<String> foods = new LinkedList<>();
            foods.add("fuck");
            foods.add("salt");
            foods.add("milk");

            for (String food:
                 foods) {
                System.out.println(food);
            }

            Set<String> filteredFoods =
                    foods.stream()
                            .map(food -> food.toUpperCase())
                            .filter(food -> food.contains("SALT"))
                            .collect(Collectors.toSet());

            System.out.println(filteredFoods);

            System.out.println("####################################################################");
            greet("rambo", "gogog");
            String resu = greet2("lockheed", "dada?");
            System.out.println(resu);


        }

    static void greet(String lala, String shit) {
        System.out.println("wof, " + lala + "!" + "  and   " + shit);
    }

    static String greet2(String name, String question) {
//        System.out.println("Fuck you, " + name);
        String output = name;
        output = output + " " + question;
            return output;
    }

    // CLASSES AND OBJECTS



}
