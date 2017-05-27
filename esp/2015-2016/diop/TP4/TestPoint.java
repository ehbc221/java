public class TestPoint
{
   public static void main(String[] args)
   {
      Point point1 = new Point();
      point1.setX(3.6);
      point1.setY(4.7);
      System.out.println("P1: " + point1);
      Point point2 = new Point(0.5, 5.2);
      System.out.println("P2: " + point2);
      Point point3 = new Point(point2);
      point3.setX(3.0);
      System.out.println("P3: " + point3);
      double d1 = point3.distance(point1);
      System.out.println("Dist(P1-P3): " + d1);
      double d2 = point3.distance(point2.getX(), point2.getY());
      System.out.println("Dist(P2-P3): " + d2);
      double d3 = Point.distance(1.2, 3.1, -8.0, 4.8);
      System.out.println("Dist: " + d3);
      point3.deplacer(-4.0, 3.6);
      System.out.println("Depl(P3): " + point3);
      point3.translater(0.1, -1.8);
      System.out.println("Transl(P3): " + point3);
   }
}