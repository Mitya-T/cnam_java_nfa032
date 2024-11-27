package cnam;

public class Cartes_jouer2 {
    private static final String[] VALEURS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};
    private final String couleur;
    private final String valeur;



    public Cartes_jouer2(String couleur, String valeur) {
        if (couleur == null || (!couleur.equals("pique") && !couleur.equals("coeur") && !couleur.equals("carreau") && !couleur.equals("trèfle"))) {
            throw new IllegalArgumentException("Couleur invalide.");
        }

        if (valeur == null || !isValidValeur(valeur)) {
            throw new IllegalArgumentException("Valeur invalide.");
        }

        this.couleur = couleur;
        this.valeur = valeur;
    }

    private static boolean isValidValeur(String valeur) {
        for (String v : VALEURS) {
            if (v.equals(valeur)) {
                return true;
            }
        }
        return false;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getValeur() {
        return valeur;
    }

    public Cartes_jouer2 comparerCarte(Cartes_jouer2 autreCarte) {
        int thisIndex = getValeurIndex(this.valeur);
        int autreIndex = getValeurIndex(autreCarte.getValeur());

        return thisIndex >= autreIndex ? this : autreCarte;
    }

    private int getValeurIndex(String valeur) {
        for (int i = 0; i < VALEURS.length; i++) {
            if (VALEURS[i].equals(valeur)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Valeur invalide: " + valeur);
    }

    @Override
    public String toString() {
        return valeur + " de " + couleur;
    }

    public static void main(String[] args) {
        try {
            System.out.println("----- FINAL VERSION -----");
            Cartes_jouer2 carte1 = new Cartes_jouer2("pique", "10");
            Cartes_jouer2 carte2 = new Cartes_jouer2("coeur", "8");

            System.out.println("Carte 1 : " + carte1);
            System.out.println("Carte 2 : " + carte2);

            Cartes_jouer2 cartePlusForte = carte1.comparerCarte(carte2);
            System.out.println("La carte la plus forte est : " + cartePlusForte);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
