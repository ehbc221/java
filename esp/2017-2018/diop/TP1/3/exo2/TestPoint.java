public class TestPoint {

    public static void main(String[] args) {
        double var_x, var_y, distance;
        Point origine = new Point();
        System.out.println("Création du point origine : " + origine.toString());
        Point p1 = new Point(2, 3);
        System.out.println("Création du point p1 : " + p1.toString());
        Point p2 = new Point(7, -4);
        System.out.println("Création du point p2 : " + p2.toString());
        Point p3 = new Point(p1);
        System.out.println("Création du point p3 : " + p3.toString());
        p3.setX(-3);
        p3.setY(5);
        System.out.println("Changement du point p3 : " + p3.toString());
        var_x = p3.x();
        var_y = p3.y();
        System.out.println(p3.toString() + " a pour abscisse " + var_x + " et pour ordonnée " + var_y + ".");
        distance = origine.distance(3, 3);
        System.out.println("La distance qui sépare l'origine du point de coordonnées (3, 3) est : " + distance + ".");
        distance = origine.distance(p3);
        System.out.println("La distance qui sépare p3 de l'origine est : " + distance + ".");
        distance = Point.distance(p1.x(), p1.y(), p2.x(), p2.y());
        System.out.println("La distance qui sépare p2 de p1 est : " + distance + ".");
        var_x = 5;
        var_y = 6;
        p1.translater(var_x, var_y);
        System.out.println("Après avoir translaté p1 de " + var_x + " (en abscisse) et " + var_y + " (en ordonnées), on obtient : " + p1.toString());
    }

}
