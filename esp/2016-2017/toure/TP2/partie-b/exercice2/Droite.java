package droite;

import point.*;

public class Droite {

    /*
        Les attributs définissants une droite
    */

    private Point p0;
    private double m;

    /*
        Constructeurs
    */

    public Droite(Point p1, Point p2) {
        this.p0 = p1;
        this.m = (p2.y - p1.y) / (p2.x - p1.x);
    }

    public Droite(Point p, double m) {
        this.p0 = p;
        this.m = m;
    }

    public Droite(double a, double b) {
        this.p0.x = a;
        this.p0.y = 0;
        this.m = b / (-a);
    }

    /*
        Autres méthodes
    */

    public double slope () {
        return this.m;
    }

    public double xIntercept() {
        double b;
        b = this.p0.y - (this.m - this.p0.x);
        return ((-b) / this.m);
    }

    public double yIntercept() {
        return (this.p0.y - (this.m - this.p0.x));
    }

    public boolean equals(Droite d) {
        double b;
        b = this.p0.y - (this.m - this.p0.x);
        if (this.m == d.m && this.b == d.b) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isHorizontal() {
        if (this.m == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isVertical() {
        if (((this.p0.y - b) / this.m) == this.m) {
            return true;
        }
        else {
            return false;
        }
    }

    private void normalize() {
        if (isHorizontal()) {
            PO = new Point(O,yIntercept());
        }
        else if (isvertical()) {
            PO = new Point(xIntercept(),O);
        }
        else.if (yIntercept0 == 0) {
            PO = new Point(1,m);
        }
        else {
            PO = new Point(O,yIntercept());
        }
    }

    public boolean isParallelTo(Droite d) {
        if (this.m == d.m) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPerpendicularTo(Droite d) {
        if ((this.m * d.m) == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void translate(double x, double y) {
        this.p0.x = x;
        this.p0.y = y;
    }

    public String tostring() {
        double b = this.p0.y - (this.m * this.p0.x);
        if (this.m == 0) {
            return "D = " + b;
        }
        else if (b == 0) {
            return "D = " + this.p0.m + "x";
        }
        else {

        }
        return "D = " + this.p0.m + "x+" + b;
    }

}
