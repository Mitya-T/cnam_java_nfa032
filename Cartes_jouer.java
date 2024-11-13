package cnam;

public class Cartes_jouer {
    private final String couleur;
    private final int valeur;

    public Cartes_jouer(String couleur, int valeur) {
        if (couleur == null || (!couleur.equals("pique") && !couleur.equals("coeur") && !couleur.equals("carreau") && !couleur.equals("trèfle"))) {
            throw new IllegalArgumentException("Couleur invalide.");
        }

        if (valeur < 2 || valeur > 14) {
            throw new IllegalArgumentException("Valeur invalide.");
        }

        this.couleur = couleur;
        this.valeur = valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getValeur() {
        return valeur;
    }

    public Cartes_jouer comparerCarte(Cartes_jouer autreCarte) {
        if (this.valeur >= autreCarte.getValeur()) {
            return this;
        } else {
            return autreCarte;
        }
    }

    public String toString() {
        String valeurCarte;
        if (valeur >= 2 && valeur <= 10) {
            valeurCarte = String.valueOf(valeur);
        } else {
            switch (valeur) {
                case 11:
                    valeurCarte = "Valet";
                    break;
                case 12:
                    valeurCarte = "Dame";
                    break;
                case 13:
                    valeurCarte = "Roi";
                    break;
                case 14:
                    valeurCarte = "As";
                    break;
                default:
                    valeurCarte = "Valeur invalide";
            }
        }
        return valeurCarte + " de " + couleur;
    }

    public static void main(String[] args) {
        try {
            Carte carte1 = new Carte("pique", 5);
            Carte carte2 = new Carte("coeur", 8);

            System.out.println("Carte 1 : " + carte1);
            System.out.println("Carte 2 : " + carte2);

            Carte cartePlusForte = carte1.comparerCarte(carte2);
            System.out.println("La carte la plus forte est : " + cartePlusForte);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}