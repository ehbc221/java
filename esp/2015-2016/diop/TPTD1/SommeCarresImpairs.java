public class Devin
{
	public static void main(String args[])
	{
		int n=parseInt(args[0]),somme=0,carre=1,i;
		if (n<=0)
			System.out.println("Impossible avec ce nombre.");
		else
		{
			for (i=0; i<n; i++)
			{
				carre*=carre;
				somme+=carre;
				carre+=2;
			}
			System.out.print("Resultat = " + somme);
		}
	}
}