package cnam;

import com.javaeasily.demos.App;

import java.
        io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


//public class num_01_premier_program {
//
//    public static void main(String[] args) {
//        System.out.println("Cameltoe Fuck");
//        x = MOOC.readInt();
//
//        double centimetres = 10;
//
//        double result = centimetres * 0.393701;
//
//        System.out.println(centimetres + " cm = " + result + " inches");
//    }
//}





public class num_01_premier_program {
    private static Object Character;
    private static Object String;
    private static Object Integer;

    // EXO 1

//    public static void main(String[] args) {
//
//        int x;
//
//        System.out.println("Cameltoe Fuck");
//
//        x = MOOC.readInt();
//        System.out.println(x);
//
//        double centimetres = 10;
//
//
//        double result = centimetres * 0.393701;
//
//        System.out.println(centimetres + " cm = " + result + " inches");
//    }

//
/*    public static void main(String[] args) {
        double euros;
        double dollars;
        System.out.println("Somme en euros? ");
        euros = Terminal.lireDouble();
        dollars = euros * 1.118;
        System.out.println("La somme en dollars: ");
        System.out.println(dollars);
    }*/

    // Question 1 heures et minutes

//    public static void main(String[] args) {
//
//        int time = 197;
//        int minutes;
//        int hours;
//
//        hours = time / 60;
//        minutes = time % 60;
//
//        System.out.println("hours = " + hours);
//        System.out.println(minutes);
//
//        System.out.println("Time is " + hours + " and " + minutes + " minutes. Have a nice day :)");
//    }


    // Question 2 heures, minutes et jour

//    public static void main(String[] args) {
//
//        int time = 3067;
//        int minutes;
//        int hours;
//        int days;
//        int not_days;
//
//
////        hours = time%24;
//        not_days = time%(24*60);
//        hours = not_days / 60;
//
//        days = time / (24*60);
//
//        minutes = time % 60;
//
////        System.out.println("hours = " + hours);
//        System.out.println(minutes);
//        System.out.println("not_days = " + not_days);
//        System.out.println("hours = " + hours);
//        System.out.println("minutes = " + minutes);
//        System.out.println("days = " + days);
////        System.out.println("days = " + days);
//
////        System.out.println("Time is " + hours + " and " + minutes + " minutes. Have a nice day :)");
//    }


////    EXO - Les colis de Mamie léonie
//
//    public static void main(String[] args) {
//
//        int gateau = 250;
//        int howMuch = 38;
//        double totalWeight;
//
//        totalWeight = gateau*howMuch;
//
//        System.out.println("1 gateau = " + gateau + "g");
//        System.out.println("Total weight: " + totalWeight);
//        System.out.println("Total weight in kilos: " + totalWeight/1000+"kg");
//    }


//    //    Exercice 3.1.1 positif ou négatif
//
//    public static void main(String[] args) {
//
//        int number = 0;
//        System.out.println("Given number = " + number);
//
//        if (number > 0) {
//            System.out.println("Positive");
//        } else if (number < 0) {
//
//            System.out.println("Negative");
//        } else {
//            System.out.println("ZERO!");
//        }
//    }

    //    Exercice 3.1.2 mention au BAC
//
//    public static void main(String[] args) {
//
//
//        while (true) {
//
//            System.out.println("Please enter the result: ");
//            Scanner sc= new Scanner(System.in);
//            double result = sc.nextInt();
//            System.out.println("The result is "+result);
//            if (result < 8) {
//                System.out.println("Ajourne");
//            } else if (result >= 8 && result <10) {
//                System.out.println("Rattrapage");
//            } else if (result >= 10 && result <12) {
//                System.out.println("Admis");
//            } else if (result >= 12 && result <14) {
//                System.out.println("Assez bien");
//            } else if (result >= 14 && result <16) {
//                System.out.println("Bien");
//            } else {
//                System.out.println("Tres bien");
//            }
//        }
//    }


//    //    Exercice 3.1.3 calculs
//
//    public static void main(String[] args) {
//
//
//        while (true) {
//
//
//            try {
//                System.out.println("Please enter the number from 1 to 9: ");
//                Scanner sc= new Scanner(System.in);
//                int result = sc.nextInt();
//
//                if (result != 1 && result != 2 && result != 3 && result != 4 && result != 5 && result != 6 && result != 7 && result != 8 && result != 9) {
//                    System.out.println("Must be a NUMBER from 1 to 9");
//                    System.out.println("Fuck off");
//                    break;
//                }
//                System.out.println("The number is "+result);
//
//                for (int i=1; i<10; i++) {
//                    System.out.println(i+" X " + result + " = " + (i*result));
//                }
//            } catch (Exception e) {
//                System.out.println("NOPE");
//            }
//        }
//    }


//    //    Exercice: Un programme qui calcule x^y où x et y sont deux entiers saisis au clavier.
//
//    public static void main(String[] args) {
//
//
//        while (true) {
//            try {
//                System.out.println("Please enter the numbers X and Y: ");
//                Scanner sc= new Scanner(System.in);
//                System.out.println("Enter X Please: ");
//                int X = sc.nextInt();
//                System.out.println("Enter Y Please: ");
//                int Y = sc.nextInt();
//
//                int result = 1;
//
//                for (int i=0; i<Y; i++) {
//                    result*=X;
//                }
//                System.out.println(X + " to the power of " + Y + " = " + result);
//                System.out.println("____________________________________________");
//            } catch (Exception e) {
//                System.out.println("NOPE");
//            }
//        }
//    }


    //    Exercice: Écrivez un programme qui affiche la valeur de la fonction x^2 (la fonction qui à un entier associe son carré) pour les dix premiers entiers positifs.

//    public static void main(String[] args) {
//
//
//
//            try {
//                System.out.println("Please enter the numbers X and Y: ");
//                Scanner sc= new Scanner(System.in);
//                System.out.println("Enter X Please: ");
//                int X = sc.nextInt();
//                int res = X*X;
//                System.out.println(res);
//
//            } catch (Exception e) {
//                System.out.println("NOPE");
//            }
//
//    }


//    Exercice 3.1.5 dessins

    // RECTANGLE

//    public static void main(String[] args) {
//
//        int taille = 10;
//        for (int i=0; i<taille; i++) {
//            for (int y=0; y<taille; y++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }


    // TRIANGLE

//    MY SOLUTION - not finished
//    public static void main(String[] args) {
//
//        int lines = 5;
//
//        for (int i=0; i<lines; i++) {
//
//            for (int x=0; x<i; x++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }



//SOLUTION!!!!
//            int sizeOfPyramid = 8;
//
//            for(int i=1;i<=sizeOfPyramid;i++) {
//                // print reduced number of spaces for each new row
//                for(int j=i;j<=sizeOfPyramid-1;j++) {
//                    System.out.print(" ");
//                }
//
//                // the number of asterisks per row is 2*rownumber-1
//                for(int k=1;k<=2*i-1;k++){
//                    System.out.print("*");
//                }
//                System.out.println("");
//            }
//    }


////    EXO - Bonjour monsieur Dupont, bonjour madame Martin ...
//
//    public static void main(String[] args) {
//
//        while (true) {
//            try {
//
//                System.out.println("EXO - Bonjour monsieur Dupont, bonjour madame Martin...");
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Enter your name Please: ");
//                String name = sc.next();
//                System.out.println("R U a GIRL? : ");
//                String isAgirl = sc.next();
//
//                if (isAgirl.equals("O") || isAgirl.equals("N")) {
//
//                    if (isAgirl.equals("O")) {
//                        System.out.println("Bonjour Mme " + name);
//                    } else {
//                        System.out.println("Bonjour Mr. " + name);
//                    }
//                }
//                System.out.println("bye");
//                break;
//
//            } catch (Exception e) {
//                System.out.println("NOPE");
//            }
//
//        }
//
//    }


    //    EXO - Bonjour monsieur Dupont, bonjour madame Martin ...

//    public static void main(String[] args) {
//
//        while (true) {
//            try {
//
//                System.out.println("EXO - Table de Multiplication");
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Entrez le nombre à multiplier: ");
//                int number = sc.nextInt();
//                System.out.println("Multiplication table for " + number);
//
//                for (int i=1; i<10; i++) {
//                    System.out.println(i + " X " + number + " = " + (number*i));
//                }
//
//            } catch (Exception e) {
//                System.out.println("NOPE");
//            }
//
//        }
//
//    }

//    public static void main(String[] args) {
//
//        while (true) {
//            try {
//
//                System.out.println("EXO - Table de Multiplication");
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Entrez le nombre à multiplier: ");
//                int number = sc.nextInt();
//                System.out.println("Multiplication table for " + number);
//                int length = String.valueOf(number).length();
//                System.out.println("Length of a number is " + length);
//
//                if (length < 2) {
//                    for (int i=1; i<10; i++) {
//
//                        if ((number*i)<10) {
//                            System.out.println(i + " X " + number + " =  " + (number*i));
//                        } else {
//                            System.out.println(i + " X " + number + " = " + (number*i));
//                        }
//                    }
//                }
//                else {
//                    System.out.println("Must be only one digit");
//                }
//
//            } catch (Exception e) {
//                System.out.println("NOPE");
//            }
//        }
//    }

//    public static void main(String[] args) {
//
//        System.out.println("\n### NFA031: premier devoir ### - TRUBETSKOY DIMITRI, dmitrii.trubetskoy@gmail.com");
//        System.out.println();
//
//        while (true) {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Please enter a number: ");
//                double number = sc.nextDouble();
//                System.out.println("Please enter a %: ");
//
//
//                try {
//                    double percentage = sc.nextDouble();
//                    System.out.println("Please enter number of iterations: ");
//                    int iter = sc.nextInt();
//
//                    System.out.println();
//                    System.out.println("Number chosen is " + number);
//                    System.out.println("% chosen is " + percentage);
//                    System.out.println("Needs to be iterated " + iter + " times.");
//                    System.out.println();
//
//
//                    for (int i=0; i<iter; i++) {
//                        number = number*(1+percentage/100);
//                        System.out.println("Iteration \u2116"+(i+1)+" = "+number);
//                    }
//                    break;
//
//                } catch (Exception e) {
//                    System.out.println("Please use symbol ',' (comma) instead of '.'(dot)!!! Thank you. ");
//                    break;
//                }
//        }
//    }



//    ------------------------------ Exercices sur les tableaux ------------------------------

    // Question 1.
    //
    //Ecrire un programme qui saisit un entier au clavier et qui recherche si cet entier appartient au
    //tableau (réponse de type oui/non).

//    public static void main(String[] args) {
//
//        int[] tab = {12,15,13,10,8,9,13,14};
//
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Choose a number: ");
//            int value = sc.nextInt();
//            boolean yes = false;
//
//            for (int i=0; i<tab.length; i++) {
//                if (tab[i] == value) {
//                    yes = true;
//                } else if (value == 0) {
//                    System.out.println("Thanks. Good bye");
//                    System.exit(0);
//                }
//            }
//
//            if (yes == true) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }



//    // Question 2.
//
//    //Ecrire un programme qui saisit un entier au clavier et qui recherche si cet entier appartient au
//    //tableau. Au cas où la réponse est positive, l’indice de cet entier dans le tableau est affiché. S’il y a
//    //plusieurs occurrences, le dernier indice est affiché.
//
//
//    public static void main(String[] args) {
//
//        int[] tab = {12,15,13,10,8,9,13,14};
//
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("\nChoose a number: ");
//            int value = sc.nextInt();
//            boolean yes = false;
//
//            int lastIndex = 0;
//
//
//            for (int i=0; i<tab.length; i++) {
//                if (tab[i] == value) {
//                    yes = true;
//                    lastIndex = i;
////                    System.out.println("The index of this value is " + i );
//                } else if (value == 0) {
//                    System.out.println("Thanks. Good bye");
//                    System.exit(0);
//                }
//            }
//
//            if (yes == true) {
//                System.out.println("\nYES");
//                System.out.println("Last index of " + value + " is " + lastIndex);
//            } else {
//                System.out.println("\nNOPE, there is no number " + value);
//            }
//        }
//    }


    // Question 3.

    //Ecrire un programme qui saisit un entier au clavier et qui recherche si cet entier appartient au
    //tableau. Au cas où la réponse est positive, l’indice de cet entier dans le tableau est affiché.
    //
    // Même question, mais s’il y a plusieurs occurrences, le PREMIER indice est affiché.


//    public static void main(String[] args) {
//
//        int[] tab = {12,15,13,10,8,9,13,14};
//
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("\nChoose a number: ");
//            int value = sc.nextInt();
//            boolean yes = false;
//            List myList = new ArrayList();
//
//
//            for (int i=0; i<tab.length; i++) {
//                if (tab[i] == value) {
//                    yes = true;
//                    myList.add(i);
//                } else if (value == 0) {
//                    System.out.println("Thanks. Good bye");
//                    System.exit(0);
//                }
//            }
//
//            if (yes == true) {
//                System.out.println("\nYES");
//                System.out.println("Last index of " + value + " is " + myList.get(0));
//
//            } else {
//                System.out.println("\nNOPE, there is no number " + value);
//            }
//        }
//    }

//    // Question 4.
//
//    //Ecrire un programme qui saisit un entier et un indice et met cet entier dans le tableau à cet indice.
//    //Il faudra vérifier que l’indice correspond bien à une case du tableau (par exemple 0 ou 3 sont corrects,
//    //mais -1 ou 123 ne sont pas des indices corrects pour ce tableau). Le programme affichera le contenu
//    //du tableau avant et après cette transformation.
//
//
//    public static void main(String[] args) {
//
//        while (true) {
//            int[] tab = {12,15,13,10,8,9,13,14};
//
//            System.out.println("Array BEFORE transformation: ");
//            System.out.println("\n----------------------------------------");
//            for (int i=0; i<tab.length; i++) {
//                System.out.print(tab[i] + " | ");
//            }
//
//            System.out.println("\n----------------------------------------");
//
//            Scanner sc = new Scanner(System.in);
//            System.out.println("\nChoose a number: ");
//            int num = sc.nextInt();
//            System.out.println("\nChoose a position: ");
//            int pos = sc.nextInt();
//
//            while (pos < tab.length && pos >= 0) {
//                tab[pos] = num;
//
//                System.out.println("Array AFTER transformation: ");
//                System.out.println("\n----------------------------------------");
//                for (int i=0; i<tab.length; i++) {
//                    System.out.print(tab[i] + " | ");
//                }
//                System.out.println("\n----------------------------------------");
//                System.exit(0);
//            }
//
//            System.out.println("Error - out of array range");
//            System.exit(0);
//        }
//    }

    // Question 5.

    //Ecrire un programme qui saisit deux indices et échange les valeurs contenues dans le tableau à ces
    //deux indices. Le programme affichera le contenu du tableau avant et après cette transformation.


//    public static void main(String[] args) {
//
//        while (true) {
//            int[] tab = {12,15,13,10,8,9,13,14};
//
//            System.out.println("\n\tArray BEFORE transformation: ");
//            System.out.println("\n----------------------------------------");
//            for (int i=0; i<tab.length; i++) {
//                System.out.print(tab[i] + " | ");
//            }
//            System.out.println("\n----------------------------------------");
//
//            int value1;
//            int value2;
//
//            Scanner sc = new Scanner(System.in);
//            System.out.println("\nChoose 1st index: ");
//            int firstIndex = sc.nextInt();
//            System.out.println("\nChoose 2nd index: ");
//            int secondIndex = sc.nextInt();
//
//            if (firstIndex < tab.length && firstIndex >= 0 && secondIndex < tab.length && secondIndex >= 0) {
//                value1 = tab[firstIndex];
//                value2 = tab[secondIndex];
//
//
//
//                System.out.println("Values chosen are: " + value1 + " and " + value2);
//
//                tab[firstIndex] = value2;
//                tab[secondIndex] = value1;
//
//                System.out.println("\nArray AFTER transformation: ");
//                System.out.println("\n----------------------------------------");
//                for (int i=0; i<tab.length; i++) {
//                    System.out.print(tab[i] + " | ");
//                }
//                System.out.println("\n----------------------------------------");
//            } else {
//                System.out.println("ERROR, OUT OF RANGE");
//            }
//        }
//    }

//    Exercice 5.1.2 tableau entré au clavier

//    Question 1
//    Ecrire un programme qui saisit 6 entiers et les stocke dans un tableau, puis affiche le contenu de
//    ce tableau une fois qu’il est rempli.

//    public static void main(String[] args) {
//
//        List mylist = new ArrayList<>();
//
//        Scanner sc = new Scanner(System.in);
//
//        for (int i=0; i<6; i++) {
//            System.out.println("\nChoose element \u2116"+(i+1)+":");
//            int elem = sc.nextInt();
//            mylist.add(elem);
//        }
//
//        for (Object element :
//                mylist) {
//            System.out.print(element + " | ");
//        }
//    }



//    //    Question 2
//    //Reprendre la partie saisie du programme précédent pour écrire un nouveau programme qui recherche
//    //et affiche le plus grand élément du tableau.
//
//        public static void main(String[] args) {
//
//            List mylist = new ArrayList<>();
//            Scanner sc = new Scanner(System.in);
//            int maximal = 0;
//
//            for (int i=0; i<3; i++) {
//                System.out.println("\nChoose element \u2116"+(i+1)+":");
//                int elem = sc.nextInt();
//                mylist.add(elem);
//            }
//            System.out.println(mylist);
//
//            System.out.println("Max val: " + Collections.max(mylist,null));
//            System.out.println("Min val: " + Collections.min(mylist,null));
//    }


    //    Question 3
    //Même question, c’est à dire saisie d’un tableau et recherche du plus grand élément, mais cette fois
    //pour un tableau contenant des caractères.

//    public static void main(String[] args) {
//
//        String samoeDLinnoe = "";
//        int max=0;
//        int dlina;
//
//        List <String> mylist = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//
//        for (int i=0; i<3; i++) {
//            System.out.println("\nChoose element \u2116"+(i+1)+":");
//            String elem = sc.next();
//            mylist.add(elem);
//        }
//        System.out.println(mylist);
//
//        for (int i=0; i<mylist.size(); i++) {
//            dlina = mylist.get(i).length();
//            if (dlina > max) {
//                max = dlina;
//                samoeDLinnoe =  mylist.get(i);
//            }
//        }
//
//        System.out.println("Max dlina is: "+ max);
//        System.out.println("Longest word is: "+ samoeDLinnoe);
//
//    }

    //Question 4
//        Ecrire un programme qui saisit un tableau de 6 entiers puis calcule la moyenne de ces six entiers.
//        Attention, la moyenne des entiers n’est pas un entier.

//    public static void main(String[] args) {
//
//        List<Integer> noviiList =  Arrays.asList(1, 2, 3, 4, 6);
//        System.out.println(noviiList);
//        double numberOfElements = noviiList.size();
//        double sum = 0;
//        double result;
//
//
//        System.out.println(numberOfElements);
//        for (int i=0; i<noviiList.size(); i++) {
//            sum += noviiList.get(i);
//        }
//
//        result = sum/numberOfElements;
//        System.out.println("Mean = " + result);
//    }


//    Question 5
//    Ecrire un programme qui saisit d’abord un nombre n, puis ensuite saisit n caractères et les place
//    dans un tableau.


//    public static void main(String[] args) {
//
//        List myList = new ArrayList();
//        Scanner sc = new Scanner(System.in);
//        int countCapitals = 0;
//        int countCharacters = 0;
//        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        char[] majus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
//
//
//        for (int i=0; i<3; i++) {
//            System.out.println("object "+(i+1)+":");
//            String num = sc.next();
//            myList.add(num);
//        }
//
//        System.out.println(myList.contains("t")); // to check if list contains "t"
//
//        for (int x=0; x<myList.size(); x++) {
//            System.out.println(myList.get(x));
//        }
//        System.out.println("countCharacters = " + countCharacters);
//        System.out.println("countCapitals = " + countCapitals);
//    }

//    public static void main(String[] args) {
//        char[] aMixed = "aAbBqwerrtyASFDSDFDF0123456   +_)(£*^\"(£)(&07097097".toCharArray();
//        int cntLower = 0, cntUpper =  0;
//        for (char ch: aMixed)
//            if ( Character.isLowerCase( ch ) )
//                cntLower++;
//            else if (Character.isUpperCase(ch))
//                cntUpper++;
//        System.out.printf("Found lower case chars %d, upper case chars %d%n", cntLower, cntUpper);
//    }


/*
    public static void main(String[] args) {

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
        int temp1=0;
        int temp2=0;

        // Generating random numbers
        Random rand = new Random();


        while (escargot1 < 50 && escargot2 < 50) {

            // Checking points
            System.out.println("escargot1 got " + temp1 + " + " + dice1 + " = " + escargot1+" points");
            System.out.println("escargot2 got " + temp2 + " + " + dice2 + " = " + escargot2+" points\n");
            System.out.println("-------------------------------------");

            // Throwing dice:
            dice1 = rand.nextInt(7);
            dice2 = rand.nextInt(7);


            if (dice1 > 0 && dice2 >0) {
                System.out.println("\t -- step " + step + " --");

                temp1 = escargot1;
                temp2 = escargot2;

                escargot1 += dice1;
                myListSnail_1.add(dice1);
                escargot2 += dice2;
                myListSnail_2.add(dice2);

                System.out.println("Dice1 is "+dice1);
                System.out.println("Dice2 is "+dice2);

                step ++;
            } else {
                System.out.println("-------------------------------------");
            }

        }

        System.out.println("\nescargot1 count is 50 or more: " + escargot1);
        System.out.println("\nescargot2 count is 50 or more: " + escargot2);

        if (escargot1 < escargot2) {
            System.out.println("\n\tESCARGOT 2 wins!");
            for (int i=0; i<myListSnail_2.size(); i++){
                System.out.print(myListSnail_2.get(i) + " | ");
            }
        }
        else if (escargot1 > escargot2) {
            System.out.println("\n\tESCARGOT 1 wins!");
            for (int i=0; i<myListSnail_1.size(); i++){
                System.out.print(myListSnail_1.get(i) + " | ");
            }
        }
        else {
            System.out.println("\n\tDRAW");
        }
        System.out.println("\n\t ### GAME OVER ###");
    }
*/

//    public static void main(String[] args) {
//
//        int dice;
//        int[] tab = new int[3];
//        boolean gameOver = false;
//        int winner;
//
//
//        System.out.println("\n\t -= SNAIL RUN =- ");
//
//        while (!gameOver) {
//            System.out.println("\n");
//            for (int i = 0; i < tab.length; i++) {
//
//                // Generating random numbers
//                dice = ThreadLocalRandom.current().nextInt(1, 6 + 1);
//                tab[i] += dice;
//
//                if (tab[i] >= 50) {
//                    gameOver = true;
//                    winner = i;
////                    System.out.println("Winner is snail N "+(i+1));
//                    System.out.println("Winner is snail N"+ (winner+1));
//                    break;
//                }
//
//
//                System.out.print("Dice" + (i + 1) + "=" + dice + " | ");
//            }
//
//            System.out.println("\n");
//            for (int i = 0; i < tab.length; i++) {
//                System.out.print(tab[i] + " | ");
//            }
//
//            System.out.println("\n________________________________________________________________");
//        }
//
//        System.out.println("\nGAME OVER");
//    }

    static void Rectangle(int x, int y, String ka){

        for (int z=0; z<y; z++){
            for (int i=0; i<x; i++)
                System.out.print(ka);
                System.out.println();
        }
    }



    static boolean Look(char[] array, int x){

        boolean isPresent = false;

        for (int element :
                array) {
            if (element == x){
                isPresent = true;
            }
        }
        return isPresent;
    }


    static int Counter(char[] arr, char x){
        int count=0;

        for (char element :
                arr) {
            if (element == x) {
                count++;
            }
        }
        return count;
    }

    static void Compare(char[] ar1, char[] ar2){
        boolean result;
        int counter = 0;
        for (char element :
                ar1) {
            result = Look(ar2, element);
            if (result==true){
                System.out.println("match!");
                counter++;
            } else {
                System.out.println("nope...");
            }
        }
        System.out.println("\ncounter = " + counter);
        if (counter == ar1.length){
            System.out.println("\nAll elements of the first array are in the second one");
        } else {
            System.out.println("\nNOT ALL...");
        }


    }

/*

    public static void main(String[] args) {
//        Rectangle(15, 3, "#");

        char[] tab = new char[]{'a','b','c','a','a','x'};
        char[] tab2 = new char[]{'a','b','c','a','x','r'};

// QUESTION 1
        System.out.println(Look(tab,'x')); // FALSE since no x in array
        System.out.println(Look(tab,'a')); // TRUE since no a is in array
        System.out.println("------------------------------------------------------------------------------------------------------");
// QUESTION 2
        System.out.println(Counter(tab, 'a')); // returns occurrence of elements in an array
        System.out.println("------------------------------------------------------------------------------------------------------");

// QUESTION 3
        Compare(tab,tab2); // verifies if elements of the first array are present at least once in another array

    }
*/




    static int division(int[] tab, int indice, int diviseur){
        return tab[indice]/diviseur;
    }

    public static int saisirChoix(int n) {

        Scanner sc = new Scanner(System.in);
        try {
            int imp = sc.nextInt();
            if (imp > n) {
                throw new Exception("MORE than N!!!");
            } else if (imp <= 0) {
                throw new Exception("Less than zero!");
            }
            System.out.println("Number is "+ imp);
            return imp;

        } catch (Exception e) {
            System.out.println(e);
        }
        return n;
    }

    static void showMenu (char[] arr) {
        for (char x :
                arr) {
            System.out.println(x);
        }
    }

    static void showMenuString (String[] arr) {
        for (String x :
                arr) {
            System.out.println(x);
        }
    }



//    public static void main(String[] args) {
////        saisirChoix(5);
//        char[] tab = new char[]{'a','b','c'};
//        String[] tab2 = new String[]{"red","yellow","green"};
//        showMenu(tab);
//        showMenuString(tab2);
//    }


//    public static void main(String[] args){
//        int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};
//        int x, y;
//        Terminal.ecrireString("Entrez l’indice de l’entier à diviser: ");
//        x = Terminal.lireInt();
//        Terminal.ecrireString("Entrez le diviseur: ");
//        y = Terminal.lireInt();
//        Terminal.ecrireString("Le résultat de la division est: ");
//        try {
//            Terminal.ecrireIntln(division(tableau,x,y));
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Out of range...!");
//        } catch (ArithmeticException e) {
//            System.out.println("nope...division by 0");
//        }
//    }


//    public static void main(String[] args) {
//        int[][] tab = {{11,32,3},{4,775,6},{7,899,9}};
//        int [] summa = new int[5];
//
//
//        System.out.println(tab[0][2]);
//        for(int i=0; i<tab.length; i++){
//
//            for (int j=0; j<tab[i].length; j++){
//                System.out.print("Row"+i+" = " + tab[i][j] + "  ");
//            }
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        int[][] tab = {{0,3,2,0},{2,3,0,1},{1,1,1,1},{5,1,0,0},{1,1,2,0}};
////        int [] summa = new int[5];
//
//
//        System.out.println(tab[0][2]);
//        for(int i=0; i<tab.length; i++){
//            int temp = 0;
//            for (int j=0; j<tab[i].length; j++){
//                System.out.print("Row"+i+" = " + tab[i][j] + "  ");
//                temp = temp + tab[i][j];
//            }
//            System.out.print("Whole cars sold by vendor "+ i +": " + temp);
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        int[][] tab = {{0,3,2,0},{2,3,0,1},{1,1,1,1},{5,1,0,0},{1,1,2,0}};
//        int [] car_prices = {100,200,300,150,400};
//        int [] total_sold = new int[0];
//        int sred_price = 0;
//
//
//        System.out.println(tab[0][2]);
//        for(int i=0; i<tab.length; i++){
//            int temp = 0;
//            for (int j=0; j<tab[i].length; j++){
//                System.out.print("Row"+i+" = " + tab[i][j] + "  ");
//                temp = temp + tab[i][j];
//            }
//            System.out.print("Whole cars sold by vendor "+ i +": " + temp);
//            total_sold = Arrays.copyOf(total_sold, total_sold.length + 1);
//            total_sold[total_sold.length - 1] = temp;
//            System.out.println();
//        }
//
//        System.out.println("--------------------");
//
//        for (int i=0; i<total_sold.length; i++) {
//            System.out.println("Iteration "+i);
//            System.out.println(total_sold[i]);
//        }
//        System.out.println("--------------------");
//
//        for (int i=0; i<total_sold.length;i++){
//
//            sred_price=total_sold[i]*car_prices[i];
//            System.out.println("Total price for vendor number "+i+" is "+sred_price);
//
//        }
//    }


//    public static void main(String[] args) {
//
//        int day;
//        int hour;
//        Scanner sc = new Scanner(System.in);
//        boolean[][] occupee =
//                {{false,true,true,true,false,true,true,false,true,false},
//                {false,true,true,true,false,true,true,false,true,false},
//                {false,false,true,true,false,false,true,false,true,false},
//                {true,true,false,true,false,true,true,false,true,true},
//                {false,true,false,true,false,true,true,false,false,false}};
//
//
//        System.out.println("Please choose day");
//        day = sc.nextInt();
//        System.out.println("Please choose hour");
//        hour = sc.nextInt();
//        System.out.println("day = " + day);
//        System.out.println("hour = " + hour);
//
//        if (occupee[day][hour]==true){
//            System.out.println("Nope, this is occupied");
//        } else {
//            System.out.println("Cool, you have reserved it");
//            occupee[day][hour]=false;
//        }
//
//
//    }

//    public static void main(String[] args) {
//
//
//        boolean[][] occupee =
//                {{false,true,true,true,false,true,true,false,true,false},
//                        {false,true,true,true,false,true,true,false,true,false},
//                        {false,false,true,true,false,false,true,false,true,false},
//                        {true,true,false,true,false,true,true,false,true,true},
//                        {false,true,false,true,false,true,true,false,false,false}};
//
//        double total = 0;
//        double counter_general = 0;
//
//
//        for(int i=0; i<occupee.length; i++){
//            int true_count = 0;
//            for (int j=0; j<occupee[i].length; j++){
//                System.out.print("Row"+i+" = " + occupee[i][j] + "  ");
//                counter_general++;
//                if (occupee[i][j]==true) {
//                    true_count++;
//                }
//            }
//            System.out.print("TRUES"+ true_count);
//            total = total+true_count;
//            System.out.println();
//        }
//
//        System.out.println("Total coult of trues: " + total);
//        System.out.println("counter_general = " + counter_general);
//        System.out.println("Percentage is: " + ((total/counter_general)*100)+"%");
//        System.out.println("----------------------end of the line------------------------------");
//    }


        static void show(String[] employes, String[] departs, int [] service ) {
            for (int i=0; i<employes.length; i++) {
                System.out.println("Worker " + employes[i] + " service index is " + service[i] + " and he/she works at " + departs[service[i]]);
            }
        }

        static void whoixu(int choice, String[] depts, String[] people, int[] services) {
            System.out.println("Service chosen: " + choice);
            System.out.println("Employés du service " + depts[choice-1]);
            for (int i=0; i<services.length; i++){
//                System.out.println(services[i]);
                if (services[i]==(choice-1)){
                    System.out.println(people[i]);
                }
            }
        }


        static int menu() {
            Scanner sc = new Scanner(System.in);

            int choice;
            while (true) {

                System.out.println("\n1 service bureau d’étude\n" +
                        "2 service ressources humaines\n" +
                        "3 service service commercial\n" +
                        "4 service gestion financière\n" +
                        "\nEntrez le numéro du service qui vous intéresse:");

                choice = sc.nextInt();
                if (choice < 1 || choice > 4) {
                    System.out.println("TRY AGAIN");
                } else {
                    break;
                }
            }
            return choice;
        }

        static void add(String[] employes, String new_employee){

            for (int i=0;i<employes.length;i++){
                if (employes[i]==null) {
                    employes[i] = new_employee;
                    break;
                }
            }
        }


        static void retraite(String[] employes, int emp_to_retreat){

            employes[emp_to_retreat] = null;


        }








        public static void main(String[] args){
/*
            String[] departs = {"bureau d’étude","ressources humaines","service commercial","gestion financière"};
            String[] employes = {"Jean", "John", "Jeannot","Jeanne","Jeannette","Janeton", "Giovanna", "Juan", "Juanito"};
            int[] service = {0, 1, 0, 2, 1, 3, 3, 2, 0};
*/

            String[] departs = {"bureau d’étude","ressources humaines","service commercial","gestion financière"};
            String[] employes = new String [12];
            String[] emp2 = {"Jean", "John", "Jeannot","Jeanne","Jeannette","Janeton", "Giovanna", "Juan", "Juanito"};
            int[] service = {0, 1, 0, 2, 1, 3, 3, 2, 0};

//            show(employes, departs, service);
//            int vibor = menu();
//            whoixu(vibor, departs, employes, service);

            for(int i=0; i<emp2.length; i++){
                employes[i] = emp2[i];
            }

            for (String x: employes
                 ) {
                if (x!=null)
                System.out.println(x);
            }
            System.out.println("------------------------------------------------------");
            add(employes,"Petya");
            add(employes,"Masha");
            add(employes,"posrosenok");


            retraite(employes, 0);
            retraite(employes, 11);


            for (String x: employes
            ) {
                if (x!=null)
                    System.out.println(x);
            }


        }




}






//class Exceptions1{
//    static int division(int[] tab, int indice, int diviseur){
//        return tab[indice]/diviseur;
//    }
//    public static void main(String[] args){
//        int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};
//        int x, y;
//        Terminal.ecrireString("Entrez l’indice de l’entier à diviser: ");
//        x = Terminal.lireInt();
//        Terminal.ecrireString("Entrez le diviseur: ");
//        y = Terminal.lireInt();
//        Terminal.ecrireString("Le résultat de la division est: ");
//        Terminal.ecrireIntln(division(tableau,x,y));
//    }
//}

