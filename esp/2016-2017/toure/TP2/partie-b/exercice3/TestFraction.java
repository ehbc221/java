import fraction.*;

public class TestFraction {

    public static void main(String[] args) {
        // public Fraction ()
        Fraction f0 = new Fraction();
        // public String toString ()
        System.out.println("Création de la fraction 0 : " + f0.toString());
        // public Fraction (long, long)
        Fraction f1 = new Fraction(6, 3);
        // public String toString ()
        System.out.println("Création de la fraction 1 : " + f1.toString());
        // public Fraction (long)
        Fraction f2 = new Fraction(17);
        // public String toString ()
        System.out.println("Création de la fraction 2 : " + f2.toString());
        // public Fraction (String)
        Fraction f3 = new Fraction("14/5");
        // public String toString ()
        System.out.println("Création de la fraction 3 : " + f3.toString());
        // public void setNumerator (long num)
        f0.setNumerator(9);
        // public void setDenominator (long denom)
        f0.setDenominator(2);
        // public long numerator ()
        System.out.println("Le numérateur de f3 est " + f3.numerator() + " et son dénominateur " + f3.denominator());
        // public Fraction add (Fraction f)
        f0 = f2.add(f3);
        System.out.println("f0 après ajout de f2 à f3 : " + f0.toString());
        // public Fraction substract (Fraction f)
        f0 = f2.substract(f3);
        System.out.println("f0 après soustraction de f3 à f2 : " + f0.toString());
        // public Fraction multiply (Fraction f)
        f0 = f2.multiply(f1);
        System.out.println("f0 après multiplication de f2 à f1 : " + f0.toString());
        // public Fraction divide (Fraction f)
        f0 = f3.divide(f1);
        System.out.println("f0 après division de f3 par f1 : " + f0.toString());
        // public boolean equals
        if (f0.equals(f3)) {
            System.out.println("f3 : " + f3.toString() + " et f2 : " + f2.toString() + " sont égales.");
        }
        else {
            System.out.println("f3 : " + f3.toString() + " et f2 : " + f2.toString() + " ne sont pas égales.");
        }
        Fraction f = new Fraction(28, 10);
        // public boolean equals (Fraction f)
        if (f.equals(f3)) {
            System.out.println("f3 : " + f3.toString() + " et f : " + f.toString() + " sont égales.");
        }
        else {
            System.out.println("f3 : " + f3.toString() + " et f : " + f.toString() + " ne sont pas égales.");
        }
        System.out.println("f3 : " + f3.toString());
        // public int intValue()
        System.out.println("\tSa valeur(en entier) est : " + f3.intValue());
        // public long longValue()
        System.out.println("\tSa valeur(en long) est : " + f3.longValue());
        // public float floatValue()
        System.out.println("\tSa valeur(en float) est : " + f3.floatValue());
        // public double doubleValue()
        System.out.println("\tSa valeur(en double) est : " + f3.doubleValue());
        // public int hashCode()
        System.out.println("Le hachcode de f3 : " + f.toString() + " est " + f3.hashCode());
    }

}
