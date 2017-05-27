import java.text.DecimalFormat;
public class Complexe
{
   double partieReelle;
   double partieImaginaire;
   public Complexe()
   {
      this(0.0, 0.0);
   }
   public Complexe(double partieReelle, double partieImaginaire)
   {
      this.setPartieReelle(partieReelle);
      this.setPartieImaginaire(partieImaginaire);
   }
   public Complexe(Complexe complexe)
   {
      this(complexe.getPartieReelle(), complexe.getPartieImaginaire());
   }
   public double getPartieImaginaire()
   {
      return this.partieImaginaire;
   }
   public void setPartieImaginaire(double partieImaginaire)
   {
      this.partieImaginaire = partieImaginaire;
   }
   public double getPartieReelle()
   {
      return this.partieReelle;
   }
   public void setPartieReelle(double partieReelle)
   {
      this.partieReelle = partieReelle;
   }
   public void ajouter(Complexe complexe)
   {
      this.setPartieReelle(this.getPartieReelle() + complexe.getPartieReelle());
      this.setPartieImaginaire(this.getPartieImaginaire() + complexe.getPartieImaginaire());
   }
   public void soustraire(Complexe complexe)
   {
      this.setPartieReelle(this.getPartieReelle() - complexe.getPartieReelle());
      this.setPartieImaginaire(this.getPartieImaginaire() - complexe.getPartieImaginaire());
   }
   public String toString()
   {
      String resultat;
      DecimalFormat dFormat = new DecimalFormat("0.000");
      resultat = "" + dFormat.format(this.getPartieReelle());
      if(this.getPartieImaginaire() >= 0)
         resultat += " +";
      else
         resultat += " ";
      resultat += dFormat.format(this.getPartieImaginaire()) + " * i";
      return resultat;
   }
}