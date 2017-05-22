public class TestPersonne
{
   public static void main(String[] args)
   {
      Personne personne1 = new Personne();
      personne1.setNom("CISSE");
      personne1.setPrenom("BABACAR");
      personne1.setAge(19);
      personne1.setSexe(TypeSexe.Masculin);
      System.out.println(personne1);
      Personne personne2 = new Personne(personne1);
      personne2.setNom("BA");
      personne2.setAge(23);
      System.out.println(personne2);
      Personne personne3 = new Personne("DIAGNE", "FALLOU", 20);
      personne3.setSexe(TypeSexe.Masculin);
      System.out.println(personne3);
   }
}