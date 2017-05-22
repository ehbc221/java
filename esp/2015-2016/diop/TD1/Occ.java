public class Occ
{
	public static void main(String[] args)
	{
		int i=1,cpt=0;
		if (args.length<=1)
			System.out.println("Nombre d'arguments insuffisant.");
		else
		{
			while ( (i<args.length) && (cpt==0) )
			{
				if (args[i]==args[0])
					cpt=1;
				i++;
			}
			if (cpt==1)
				System.out.println("Trouve");
			if (cpt==0)
				System.out.println("Non Trouve");
		}
	}
}