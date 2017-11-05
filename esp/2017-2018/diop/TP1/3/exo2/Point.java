import java.lang.Math;

public class Point {

    private double x;
    private double y;

    public Point() {
        this.setX(0);
        this.setY(0);
    }

    public Point(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public Point(Point p) {
        this.setX(p.x());
        this.setY(p.y());
    }

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

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((p.x() - this.x), 2) + Math.pow((p.y() - this.y), 2));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public void deplacer(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public void translater(double x, double y) {
        this.setX(this.x() + x);
        this.setY(this.y() + y);
    }

    public String toString() {
        return ("p = (" + this.x + ", " + this.y + ")");
    }

}
