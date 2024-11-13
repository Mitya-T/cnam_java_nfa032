package cnam;

public class Carte {
    private String couleur;
    private int valeur;

    public Carte(String couleur, int valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Carte comparerCarte(Carte autreCarte) {
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
        Carte carte1 = new Carte("pique", 10);
        Carte carte2 = new Carte("coeur", 8);

        System.out.println("Carte 1 : " + carte1);
        System.out.println("Carte 2 : " + carte2);

        Carte cartePlusForte = carte1.comparerCarte(carte2);
        System.out.println("La carte la plus forte est : " + cartePlusForte);
    }
}
