package sn.ucad.esp.dic;

public class Fraction {

    private int numerator;
    private int denominator;

    /**
     * Constructeur de fonction
     * 
     * @return une instance de la fraction
     */
    public Fraction(int n, int d) {
        this.numerator = n;
        if (d != 0) {
            this.denominator = d;
        }
        else {
            this.denominator = 1;
        }
    }

    /**
     * Setter pour le numérateur
     * 
     * @param denom : le numérateur
     */
    public void setNumerator(int num) {
        this.numerator = num;
    }

    /**
     * Setter pour le dénominateur
     * 
     * @param denom : le dénominateur
     */
    public void setDenominator(int denom) {
        this.denominator = denom;
    }

    /**
     * Getter pour le numérateur
     * 
     * @return Le numérateur de la fraction
     */
    public int numerator() {
        return this.numerator;
    }

    /**
     * Getter pour le dénominateur
     * 
     * @return Le dénominateur de la fraction
     */
    public int denominator() {
        return this.denominator;
    }

    /**
     * Affiche une fraction
     * 
     */
    public void afficher () {
        if (this.numerator % this.denominator == 0) {
            System.out.println("f = " + (this.numerator/this.denominator));
        }
        else {
            System.out.println("f = " + this.numerator + " / " + this.denominator);
        }
    }

}
