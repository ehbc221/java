public class TestComplexe
{
   public static void main(String[] args)
   {
      Complexe complexe1 = new Complexe();
      complexe1.setPartieReelle(2.4);
      complexe1.setPartieImaginaire(5.7);
      System.out.println("Complexe1: " + complexe1);
      Complexe complexe2 = new Complexe(3.1, 6.4);
      System.out.println("Complexe2: " + complexe2);
      Complexe complexe3 = new Complexe(complexe2);
      complexe3.setPartieImaginaire(4.8);
      System.out.println("Complexe3: " + complexe3);
      complexe3.ajouter(complexe2);
      System.out.println("+Complexe2 -> " + complexe3);
      complexe3.soustraire(complexe1);
      System.out.println("-Complexe1 -> " + complexe3);
   }
}