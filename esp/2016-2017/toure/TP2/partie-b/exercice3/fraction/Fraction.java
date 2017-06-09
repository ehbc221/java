package fraction;

public class Fraction {

    /*
        Attributs
    */

    private long numerator;
    private long denominator;

    /*
        Constructeurs
    */

    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Fraction(long n, long d) {
        this.numerator = n;
        this.denominator = d;
    }

    public Fraction(long n) {
        this.numerator = n;
        this.denominator = 1;
    }

    public Fraction(String ch) {
        stringToFraction(ch);
    }

    /*
        Méthodes
    */

    public void setNumerator(long num) {
        this.numerator = num;
    }

    public void setDenominator(long denom) {
        this.denominator = denom;
    }

    public long numerator() {
        return this.numerator;
    }

    public long denominator() {
        return this.denominator;
    }

    public Fraction add(Fraction f) {
        Fraction f2 = new Fraction();
        f2.numerator = (this.numerator * f.denominator) + (f.numerator * this.denominator);
        f2.denominator = this.denominator * f.denominator;
        f2.simplify();
        return f2;
    }

    public Fraction substract(Fraction f) {
        Fraction f2 = new Fraction();
        f2.numerator = (this.numerator * f.denominator) - (f.numerator * this.denominator);
        f2.denominator = this.denominator * f.denominator;
        f2.simplify();
        return f2;
    }

    public Fraction multiply(Fraction f) {
        Fraction f2 = new Fraction();
        f2.numerator = this.numerator * f.numerator;
        f2.denominator = this.denominator * f.denominator;
        f2.simplify();
        return f2;
    }

    public Fraction divide(Fraction f) {
        Fraction f2 = new Fraction();
        f2.numerator = this.numerator * f.denominator;
        f2.denominator = this.denominator * f.numerator;
        f2 = f2.simplify();
        return f2;
    }

    public boolean equals(Fraction f) {
        if ((this.numerator * f.denominator) == (this.denominator * f.numerator)) {
            return true;
        }
        else {
            return false;
        }
    }

    private void stringToFraction(String fString) {
        String chaine;
        chaine = fString.substring(0, fString.indexOf('/'));
        this.numerator = Long.parseLong(chaine);
        chaine = fString.substring(fString.indexOf('/') + 1, fString.length());
        this.denominator = Long.parseLong(chaine);
    }

    public static long pgcd(long a, long b) {
        return (b == 0) ? a : pgcd(b, a % b);
    }

    private Fraction simplify() {
        Fraction f = new Fraction(this.numerator, this.denominator);
        long dividende;
        dividende = pgcd(f.numerator, f.denominator);
        f.numerator /= dividende;
        f.denominator /= dividende;
        return f;
    }

    public int intValue() {
        return (int) (this.numerator / this.denominator);
    }

    public long longValue () {
        return (this.numerator / this.denominator);
    }

    public float floatValue () {
        return (float) (this.numerator) / this.denominator;
    }

    public double doubleValue () {
        return (double) (this.numerator) / this.denominator;
    }

    public String toString () {
        return "f = " + this.numerator + " / " + this.denominator;
    }

    public int hashCode () {
        return (int) (this.numerator / this.denominator);
    }

}
