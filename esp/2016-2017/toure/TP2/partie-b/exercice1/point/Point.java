package point;

import java.lang.Math;

public class Point {

    /*
        Attributs
    */

    private double x;
    private double y;

    /*
        Constructeurs
    */

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    /*
        Méthodes
    */

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double x() {
        return this.x;
    }

    public double y() {
        return this.y;
    }

    public double distanceFromPoint(Point p) {
        return Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
    }

    private void updateDistance() {
    }

    public static double distanceTwoPoint(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public void translater(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void rotate(double o) {
        this.x = this.x * Math.acos(o) - this.y * Math.asin(o);
        this.y = this.x * Math.acos(o) + this.y * Math.asin(o);
    }

    public String toString() {
        return ("p = (" + this.x + ", " + this.y + ")");
    }

}
