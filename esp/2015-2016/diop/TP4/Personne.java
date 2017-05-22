public class Personne
{
   public enum TypeDuSexe
   {
      Masculin,Feminin
   }
   private String nom;
   private String prenom;
   private int age;
   private TypeDuSexe sexe;
   public Personne()
   {
      this("", "", 0, TypeDuSexe.Masculin);
   }
   public Personne(String nom, String prenom)
   {
      this(nom, prenom, 0, TypeDuSexe.Masculin);
   }
   public Personne(String nom, String prenom, int age)
   {
      this(nom, prenom, age, TypeDuSexe.Masculin);
   }
   public Personne(String nom, String prenom, int age, TypeDuSexe sexe)
   {
      this.setNom(nom);
      this.setPrenom(prenom);
      this.setAge(age);
      this.setSexe(sexe);
   }
   public Personne(Personne personne)
   {
      this(personne.getNom(), personne.getPrenom(), personne.getAge(), personne.getSexe());
   }
   public final int getAge()
   {
      return this.age;
   }
   public void setAge(int age)
   {
      if(age < 0 || age > 130)
         this.age = 0;
      else
         this.age = age;
   }
   public final String getNom()
   {
      return this.nom;
   }
   public void setNom(String nom)
   {
      this.nom = nom;
   }
   public final String getPrenom()
   {
      return this.prenom;
   }
   public void setPrenom(String prenom)
   {
      this.prenom = prenom;
   }
   public final TypeDuSexe getSexe()
   {
      return this.sexe;
   }
   public void setSexe(TypeDuSexe sexe)
   {
      this.sexe = sexe;
   }
   public String toString()
   {
      String resultat;
      resultat = "Personne: {nom:" + this.getNom() + "; prénom:" + this.getPrenom() + "; age:"
            + this.getAge() + " an(s); sexe:";
      if(this.getSexe() == TypeDuSexe.Masculin)
         resultat += "Masculin}";
      else
         resultat += "Féminin}";
      return resultat;
   }
}