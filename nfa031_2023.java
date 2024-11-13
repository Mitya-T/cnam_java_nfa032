package cnam;

import java.util.*;


public class nfa031_2023 {

/*//    EXO - Bonjour monsieur Dupont, bonjour madame Martin ...

    public static void main(String[] args) {

        while (true) {

            try {

                System.out.println("EXO - Bonjour monsieur Dupont, bonjour madame Martin...");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your name Please: ");
                String name = sc.next();
                System.out.println("R U a GIRL? : ");
                String isAgirl = sc.next();

                if (isAgirl.equals("O") || isAgirl.equals("N")) {

                    if (isAgirl.equals("O")) {
                        System.out.println("Bonjour Mme " + name);
                    } else {
                        System.out.println("Bonjour Mr. " + name);
                    }
                }
                System.out.println("bye");
                break;

            } catch (Exception e) {
                System.out.println("NOPE");
            }

        }

    }*/

/*//    EXO - Bonjour monsieur Dupont, bonjour madame Martin ...

    public static void main(String[] args) {

        while (true) {
            try {

                System.out.println("EXO - Bonjour monsieur Dupont, bonjour madame Martin...");
//                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your name Please: ");
                String name = MOOC.readString();
                System.out.println("R U a GIRL? : ");
                String isAgirl = MOOC.readString();

                if (isAgirl.equals("O") || isAgirl.equals("N")) {

                    if (isAgirl.equals("O")) {
                        System.out.println("Bonjour Madame " + name);
                    } else {
                        System.out.println("Bonjour Monsieur " + name);
                    }
                }
                System.out.println("bye");
                break;

            } catch (Exception e) {
                System.out.println("NOPE");
            }
        }
    }
}*/


/*    public static void main(String[] args) {

        while (true) {
            try {

                System.out.println("EXO - Table de Multiplication");
                Scanner sc = new Scanner(System.in);
                System.out.println("Entrez le nombre à multiplier: ");
                int number = sc.nextInt();
                System.out.println("Multiplication table for " + number);
                int length = String.valueOf(number).length();
                System.out.println("Length of a number is " + length);

                if (length < 2) {
                    for (int i = 1; i < 10; i++) {

                        if ((number * i) < 10) {
                            System.out.println(i + " X " + number + " =  " + (number * i));
                        } else {
                            System.out.println(i + " X " + number + " = " + (number * i));
                        }
                    }
                } else {
                    System.out.println("Must be only one digit");
                }

            } catch (Exception e) {
                System.out.println("NOPE");
            }
        }
    }*/

/*    public static void main(String[] args) {
        System.out.println("Entrez le nombre à multiplier: ");
        int number = MOOC.readInt();
        int length = String.valueOf(number).length();
        if (length < 2) {
            for (int i = 1; i < 10; i++) {

                if ((number * i) < 10) {
                    System.out.println(i + " X " + number + " =  " + (number * i));
                } else {
                    System.out.println(i + " X " + number + " = " + (number * i));
                }
            }
        } else {
            System.out.println("Must be only one digit");
        }
    }
}*/


/*    public static void main(String[] args) {

        // Declaring lists for two escargots
        List myListSnail_1 = new ArrayList();
        List myListSnail_2 = new ArrayList();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n ########## La course des escargots ##########\n\n");
        int escargot1 = 0;
        int escargot2 = 0;
        int dice1 = 0;
        int dice2 = 0;
        int step = 1;
        int temp1 = 0;
        int temp2 = 0;

        // Generating random numbers
        Random rand = new Random();


        while (escargot1 < 50 && escargot2 < 50) {

            // Checking points
            System.out.println("escargot1 got " + temp1 + " + " + dice1 + " = " + escargot1 + " points");
            System.out.println("escargot2 got " + temp2 + " + " + dice2 + " = " + escargot2 + " points\n");
            System.out.println("-------------------------------------");

            // Throwing dice:
            dice1 = rand.nextInt(6)+1;
            dice2 = rand.nextInt(6)+1;


            if (dice1 > 0 && dice2 > 0) {
                System.out.println("\t -- step " + step + " --");

                temp1 = escargot1;
                temp2 = escargot2;

                escargot1 += dice1;
                myListSnail_1.add(dice1);
                escargot2 += dice2;
                myListSnail_2.add(dice2);

                System.out.println("Dice1 is " + dice1);
                System.out.println("Dice2 is " + dice2);

                step++;
            } else {
                System.out.println("-------------------------------------");
            }

        }

        System.out.println("\nescargot1 count is 50 or more: " + escargot1);
        System.out.println("\nescargot2 count is 50 or more: " + escargot2);

        if (escargot1 < escargot2) {
            System.out.println("\n\tESCARGOT 2 wins!");
            for (int i = 0; i < myListSnail_2.size(); i++) {
                System.out.print(myListSnail_2.get(i) + " | ");
            }
        } else if (escargot1 > escargot2) {
            System.out.println("\n\tESCARGOT 1 wins!");
            for (int i = 0; i < myListSnail_1.size(); i++) {
                System.out.print(myListSnail_1.get(i) + " | ");
            }
        } else {
            System.out.println("\n\tDRAW");
        }
        System.out.println("\n\t ### GAME OVER ###");
    }*/


//        Question 5
//        Ecrire un programme qui saisit d’abord un nombre n, puis ensuite saisit n caractères et les place
//        dans un tableau.


        public static void main(String[] args) {

            List<Character> myList = new ArrayList<>();
            int [] lala;
            lala = new int[10];

            Scanner sc = new Scanner(System.in);
            int countCapitals = 0;
            int countCharacters = 0;
//            char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//            char[] majus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();


            for (int i=0; i<3; i++) {
                System.out.println("object "+(i+1)+":");
                String numb = sc.next();
                char firstChar = numb.charAt(0);

                myList.add(firstChar);
            }

            System.out.println(myList.contains('t')); // to check if list contains "t"

            for (int x=0; x<myList.size(); x++) {
                System.out.println(myList.get(x));
                System.out.println("###############");
                char tst = myList.get(x);
                if (Character.isUpperCase(tst)){
                    countCapitals +=1;
                } else {
                    countCharacters +=1;
                }

            }

            for (int x = 0; x < myList.size(); x++) {
                char element = myList.get(x);

                System.out.println("Element: " + element);

                if (Character.isUpperCase(element)) {
                    System.out.println("It's a capital character.");
                } else {
                    System.out.println("It's NOT a capital character.");
                }

                System.out.println("-----------");
            }


            System.out.println("countCharacters = " + countCharacters);
            System.out.println("countCapitals = " + countCapitals);
        }



/*
        public static void main(String[] args) {
            char[] aMixed = "aAbBqwerrtyASFDSDFDF0123456   +_)(£*^\"(£)(&07097097".toCharArray();
            int cntLower = 0, cntUpper =  0;
            for (char ch: aMixed)
                if ( Character.isLowerCase( ch ) )
                    cntLower++;
                else if (Character.isUpperCase(ch))
                    cntUpper++;
            System.out.printf("Found lower case chars %d, upper case chars %d%n", cntLower, cntUpper);
        }
*/






}


