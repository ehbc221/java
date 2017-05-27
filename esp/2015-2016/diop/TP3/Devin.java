import java.util.*;
public class Devin
{
	public static void main(String args[])
	{
		Scanner clavier=new Scanner(System.in);
		int inf=0,sup=100,nombre,choix=82;
		boolean trouve=false;
		while(trouve==false)
		{
			do
			{
				System.out.print("Est-ce ");
				nombre=clavier.nextInt();
			}while(nombre<inf || nombre>sup);
			if (nombre>choix)
				System.out.println(" ? moins");
			if (nombre<choix)
				System.out.println(" ? plus");
			if (nombre==choix)
			{
				trouve=true;
				System.out.println(" ? oui");
			}
		}
	}
}