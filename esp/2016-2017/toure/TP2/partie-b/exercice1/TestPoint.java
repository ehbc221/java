import point.*;

public class TestPoint {

    public static void main(String[] args) {
        double var_x, var_y, distance, angle;
        // Test de : Point()
        Point origine = new Point();
        // Test de : public String toString()
        System.out.println("Création du point origine : " + origine.toString());
        // Test de : Point(double, double)
        Point p1 = new Point(2, 3);
        // Test de : public String toString()
        System.out.println("Création du point p1 : " + p1.toString());
        Point p2 = new Point(7, -4);
        // Test de : public String toString()
        System.out.println("Création du point p2 : " + p2.toString());
        // Test de : Point(Point)
        Point p3 = new Point(p1);
        // Test de : public String toString()
        System.out.println("Création du point p3 : " + p3.toString());
        // Test de : public void setX (double)
        p3.setX(-3);
        // Test de : public void setY (double)
        p3.setY(5);
        // Test de : public String toString()
        System.out.println("Changement du point p3 : " + p3.toString());
        // Test de : public double x ()
        var_x = p3.x();
        // Test de : public double y ()
        var_y = p3.y();
        System.out.println(p3.toString() + " a pour abscisse " + var_x + " et pour ordonnée " + var_y + ".");
        // Test de : public double distanceFromPoint(Point)
        distance = origine.distanceFromPoint(p3);
        System.out.println("La distance qui sépare p3 de l'origine est : " + distance + ".");
        // Test de : public static double distanceTwoPoint(double, double, double, double)
        distance = Point.distanceTwoPoint(p1.x(), p1.y(), p2.x(), p2.y());
        System.out.println("La distance qui sépare p2 de p1 est : " + distance + ".");
        // Test de : public void translater(double, double)
        var_x = 5;
        var_y = 6;
        p1.translater(var_x, var_y);
        System.out.println("Après avoir translaté p1 de " + var_x + " (en abscisse) et " + var_y + " (en ordonnées), on obtient : " + p1.toString());
        // Test de : public void rotate(double ⊝ )
        angle = 0.3;
        p2.rotate(angle);
        System.out.println("p2 après rotation de " + angle + " : " + p2.toString());
    }

}
