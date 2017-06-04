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
        this.numerator = 0;
        this.denominator = 0;
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
        this.numerator = (this.numerato * f.denominator) + (f.numerator * this.denominator);
        this.denominator *= f.denominator;
    }

    public Fraction subtract(Fraction f) {
        this.numerator = (this.numerato * f.denominator) - (f.numerator * this.denominator);
        this.denominator *= f.denominator;
    }

    public Fraction multiply(Fraction f) {
        this.numerator *= f.numerator;
        this.denominator *= f.denominator;
    }

    public Fraction divide(Fraction f) {
        this.numerator *= f.denominator;
        this.denominator *= f.numerator;
    }

    public boolean equals(Fraction f) {
        if ((this.numerator * f.denominator) == (this.denominator *= f.numerator)) {
            return true;
        }
        else {
            return false;
        }
    }

    private void stringToFraction(String fString) {

    }

    public static long pgcd(long a, long b) {
        return (b == 0) ? a : pgcd(b, a % b);
    }

    private Fraction simplify() {
        Fraction f = new Fraction(this.numerator, this.denominator);
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
        return (float) (this.numerator / this.denominator);
    }

    public double doubleValue () {
        return (double) (this.numerator / this.denominator);
    }

    public String toString () {
        return "f = " + this.numertor + " / " + this.denominator;
    }

    public int hashCode () {

    }

}
