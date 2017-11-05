import java.util.Scanner;
public class ConjugaisonIndicatif
{
	private String verbe;
	private String[] pronoms={"Je","Tu","Il/Elle","Nous","Vous","Ils/Elles"};
	private String[] terminaisonPresent = {"e","es","e","ons","ez","ent"};
	private String[] terminaisonPasse = {"ai","as","a","ames","ates","erent"};
	private String[] terminaisonFutur = {"erai","eras","era","erons","erez","eront"};
	private String[] terminaisonImparfait = {"ais","ais","ait","ions","iez","aient"};
	public static boolean ConjugaisonIndicatif (String verbe)
	{
		if (verbe.endsWith("er"))
			return true;
		else
			return false;
	}
	public void present()
	{
		
	}
	public void passe()
	{
		
	}
	public void futur()
	{
		
	}
	public void imparfait() 
	{
		
	}
	public static void main(String[] args)
	{
		Scanner clavier = new Scanner(System.in);
		boolean test;
		String verbe = new String();
		System.out.print("Saisissez le verbe que vous voulez conjuguer: ");
		verbe = clavier.nextLine();
		test=ConjugaisonIndicatif(verbe);
		if (test==true)
			System.out.println("Vrai");
		else
			System.out.println("Faux");
	}
}
