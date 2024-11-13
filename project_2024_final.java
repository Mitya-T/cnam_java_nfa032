package cnam;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.Year;
import java.time.LocalDate;


public class project_2024_final {


    static int nombreAdherents = 0;
    static int anneeCourante = Year.now().getValue();
    static int moisCourant = LocalDate.now().getMonthValue();

    static String[] noms;
    static String[] prenoms;
    static int[] anneesFinAdhesion;

    public static void main(String[] args) {

        int MAX_ADHERENTS = 20; // pourquoi pas
        noms = new String[MAX_ADHERENTS];
        prenoms = new String[MAX_ADHERENTS];
        anneesFinAdhesion = new int[MAX_ADHERENTS];

        initializeData();

        Scanner sc = new Scanner(System.in);

        System.out.println("Annee Courante: " + anneeCourante);
        System.out.println("Mois = " + moisCourant);
        System.out.println("Adherents = " + nombreAdherents);

        System.out.println("----------------------------------");



        while (true) {
            try {
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Menu:");
                System.out.println("1. Afficher la liste de tous les adherents et anciens adherents");
                System.out.println("2. Afficher la liste des adherents avec cotisation a jour");
                System.out.println("3. Enregistrer une adhesion ou un renouvellement");
                System.out.println("4. Quitter");

                int choix = sc.nextInt();

                switch (choix) {
                    case 1:
                        afficherListeAdherents(noms, prenoms, anneesFinAdhesion);
                        break;
                    case 2:
                        afficherAdherentsCotisationAJour(noms, prenoms, anneesFinAdhesion);
                        break;
                    case 3:
                        enregistrerAdhesionOuRenouvellement();
                        break;
                    case 4:
                        System.out.println("Au revoir !");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Choix invalide, veuillez reessayer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Consume the invalid input
            } catch (Exception e) {
                System.out.println("An error occurred during menu selection.");
            }
        }
    }


    private static void initializeData() {
        ajouterAdherent("lennon", "john", 2021);
        ajouterAdherent("starr", "ringo", 2023);
        ajouterAdherent("harrison", "george", 2022);
        ajouterAdherent("mccartney", "paul", 2021);
        ajouterAdherent("mercury", "freddie", 2022);
        ajouterAdherent("morrison", "jim", 2021);
        ajouterAdherent("presley", "elvis", 2021);
        ajouterAdherent("hetfield", "james", 2024);

    }



    private static void afficherListeAdherents(String[] noms, String[] prenoms, int[] anneesFinAdhesion) {
        System.out.println("Liste des adherents et anciens adherents :");
        for (int i = 0; i < nombreAdherents; i++) {
            System.out.println(noms[i] + " " + prenoms[i] + " - Fin adhesion : " + anneesFinAdhesion[i]);
        }
    }


    private static void afficherAdherentsCotisationAJour(String[] noms, String[] prenoms, int[] anneesFinAdhesion) {
        System.out.println("Liste des adherents avec cotisation a jour :");

        for (int i = 0; i < nombreAdherents; i++) {
            if (anneesFinAdhesion[i] >= anneeCourante) {
                System.out.println(noms[i] + " " + prenoms[i] + " - Fin adhesion : " + anneesFinAdhesion[i]);
            }
        }
    }

    private static void enregistrerAdhesionOuRenouvellement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le nom de l'adherent :");
        String nom = sc.next();

        System.out.println("Entrez le prenom de l'adherent :");
        String prenom = sc.next();

        int anneeFinAdhesion;

        if (nomExist(nom)) {

            int index = getIndexByNom(nom);
            System.out.println("Annee de renouvellement pour " + nom + " " + prenom + ": " + anneesFinAdhesion[index]);
            System.out.println("Cet adherent existe deja. Voulez-vous le renouveler ? (O/N)");

            char reponse = sc.next().charAt(0);


            if (reponse == 'O' || reponse == 'o') {
                if (anneesFinAdhesion[index] == anneeCourante && LocalDate.now().getMonthValue() != 12){
                    System.out.println("Il n'en est pas question, l'année de fin ("+ anneesFinAdhesion[index] +") de "+ nom + " est déjà une année en cours!");
                } else {
                    // Renouvellement
                    anneeFinAdhesion = demanderAnneeFinAdhesion(true);
                    anneesFinAdhesion[index] = anneeFinAdhesion;
                    System.out.println("Renouvellement enregistre avec succes !"); }

            }
        } else {
            // Nouvelle adhesion
            anneeFinAdhesion = demanderAnneeFinAdhesion(false);
            ajouterAdherent(nom, prenom, anneeFinAdhesion);
            System.out.println("Nouvelle adhesion enregistree avec succes !");
        }
    }

    private static int demanderAnneeCourante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez l'annee courante : ");
        return sc.nextInt();
    }

    private static int demanderAnneeFinAdhesion(boolean renouvellement) {

        int anneeCourante = demanderAnneeCourante();

        if (renouvellement && LocalDate.now().getMonthValue() == 12) {
            // Adhesion en decembre, prolongee jusqu'a la fin de l'annee suivante
            return anneeCourante + 1;
        } else {
            return anneeCourante;
        }
    }

    private static void ajouterAdherent(String nom, String prenom, int anneeFinAdhesion) {
        // Ajout de l'adherent dans la liste (tri alphabetique)
        int index = 0;
        while (index < nombreAdherents && noms[index].compareToIgnoreCase(nom) < 0) {
            index++;
        }

        // Decaler les elements pour faire de la place pour le nouvel adherent
        for (int i = nombreAdherents; i > index; i--) {
            noms[i] = noms[i - 1];
            prenoms[i] = prenoms[i - 1];
            anneesFinAdhesion[i] = anneesFinAdhesion[i - 1];
        }

        // Ajouter le nouvel adherent a la bonne place
        noms[index] = nom;
        prenoms[index] = prenom;
        anneesFinAdhesion[index] = anneeFinAdhesion;
        nombreAdherents++;
    }

    private static boolean nomExist(String nom) {
        for (int i = 0; i < nombreAdherents; i++) {
            if (noms[i].equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    private static int getIndexByNom(String nom) {
        for (int i = 0; i < nombreAdherents; i++) {
            if (noms[i].equalsIgnoreCase(nom)) {
                return i;
            }
        }
        return -1;
    }
}

