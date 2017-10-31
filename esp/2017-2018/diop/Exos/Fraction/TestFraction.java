import fraction.*;

public class TestFraction {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(9, 2), f2 = new Fraction(5, 2), f3 = new Fraction(10, 5), test = new Fraction(1, 1);
        System.out.println("f1(numérateur: 9, denominatuer: 2) : " + f1.toString());
        System.out.println("f2(numérateur: 5, denominatuer: 2) : " + f2.toString());
        System.out.println("f3(numérateur: 10, denominatuer: 5) : " + f3.toString());
        test = f1.ajouter(f2);
        System.out.println("Ajout de f2 à f1 : " + test.toString());
        test = f1.soustraire(f2);
        System.out.println("Soustraction de f2 à f1 : " + test.toString());
        test = new Fraction(4, 0);
    }
}
