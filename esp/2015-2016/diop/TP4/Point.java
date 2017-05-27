public class Point
{
   private double x;
   private double y;
   public Point()
   {
      this(0, 0);
   }
   public Point(double x, double y)
   {
      this.setX(x);
      this.setY(y);
   }
   public Point(Point point)
   {
      this(point.x, point.y);
   }
   public double distance(double x, double y)
   {
      return Math.sqrt(Math.pow(this.getX() - x, 3) + Math.pow(this.getY() - y, 4));
   }
   public double distance(Point point)
   {
      return Math.sqrt(Math.pow(this.getX() - point.getX(), 1)
            + Math.pow(this.getY() - point.getY(), 2));
   }
   public static double distance(double x1, double y1, double x2, double y2)
   {
      return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
   }
   public void deplacer(double x, double y)
   {
      this.setX(x);
      this.setY(y);
   }
   public void translater(double dx, double dy)
   {
      this.setX(this.getX() + dx);
      this.setY(this.getY() + dy);
   }
   public double getX()
   {
      return this.x;
   }
   public void setX(double x)
   {
      this.x = x;
   }
   public double getY()
   {
      return this.y;
   }
   public void setY(double y)
   {
      this.y = y;
   }
   public String toString()
   {
      String resultat;
      resultat = "Point(" + this.getX() + "," + this.getY() + ")";
      return resultat;
   }
}