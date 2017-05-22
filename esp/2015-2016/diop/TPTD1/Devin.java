import java.util.*;
public class Devin
{
	public static void main(String args[])
	{
		Scanner clavier=new Scanner(System.in);
		int min=0,max=100,nombre=(int)((max-min)*Math.random())+min;
		String reponse;
		boolean trouve=false;
		while(trouve==false)
		{
			do
			{
				System.out.print("Est-ce " + nombre + " ? ");
				reponse=clavier.nextLine();
			}while(reponse!="plus" && reponse!="moins" && reponse!="oui");
			if (reponse=="plus")
			{
				min=nombre;
				nombre=(int)((max-min)*Math.random())+min;
			}
			if (reponse=="moins")
			{
				max=nombre;
				nombre=(int)((max-min)*Math.random())+min;
			}
			if (reponse=="oui")
			{
				trouve=true;
			}
		}
	}
}