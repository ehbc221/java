package fraction;

public class Fraction {

    // Attributs
    private int numerateur;
    private int denominateur;

    /* 
    * Getters
    */
    public int getNumerateur() {
        return this.numerateur;
    }

    public int getDenominateur() {
        return this.denominateur;
    }

    /* 
    * Setters
    */
    public void setNumerateur(int numerateur) {
        this.numerateur = numerateur;
    }

    public void setDenominateur(int denominateur) {
        if (denominateur == 0)
            throw new ArithmeticException("Dénominateur nul non permis.");
        else
            this.denominateur = denominateur;
    }

    // Constructeur
    public Fraction(int numerateur, int denominateur) throws ArithmeticException {
        this.setNumerateur(numerateur);
        this.setDenominateur(denominateur);
        this.simplifier();
    }

    // Ajout de 2 fractions
    public Fraction ajouter(Fraction f2) {
        int numerateur, denominateur;
        numerateur = (this.numerateur * f2.getDenominateur()) + (this.denominateur * f2.getNumerateur());
        denominateur = this.denominateur * f2.getDenominateur();
        Fraction f = new Fraction(numerateur, denominateur);
        f.simplifier();
        return f;
    }

    // Soustraction de 2 fractions
    public Fraction soustraire(Fraction f2) {
        int numerateur, denominateur;
        numerateur = (this.numerateur * f2.getDenominateur()) - (this.denominateur * f2.getNumerateur());
        denominateur = this.denominateur * f2.getDenominateur();
        Fraction f = new Fraction(numerateur, denominateur);
        f.simplifier();
        return f;
    }

    // Simplification
    public void simplifier() {
        if (this.numerateur % this.denominateur == 0) {
            this.setNumerateur(this.numerateur/this.denominateur);
            this.setDenominateur(1);
        }
    }

    // toString
    public String toString() {
        if (this.denominateur == 1) {
            return Integer.toString(this.numerateur);
        }
        else {
            return (this.getNumerateur() + "/" + this.getDenominateur());
        }
    }

}
