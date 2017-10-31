package fr.pr.master;
import sn.ucad.esp.dic.Fraction;

public class TestFraction {

    public static void main(String[] args) {
        // public Fraction (int, int)
        Fraction f = new Fraction(7, 3);
        // public void toString ()
        f.afficher();
        // public void setNumerator(int num)
        f.setNumerator(2);
        // public void setDenominator(int denom)
        f.setDenominator(5);
        // public void toString ()
        System.out.println("La nouvelle fonction est ");
        // public void toString ()
        f.afficher();
    }

}
