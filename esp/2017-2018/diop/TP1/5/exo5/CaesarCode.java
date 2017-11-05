public class CaesarCode
{
	public static void help()
	{
		System.out.print("Vous etes dans l'outil d'aide!\n");
		System.out.print("Ce programme peut crypter ou decrypter votre message avec le code de Cesar.\n");
		System.out.print("Syntaxe : CaesarCode [-option1] [message] [-option2] [cle]\n\t\t\t");
					System.out.print("(pour l'execution d'une syntaxe)\n\t");
			System.out.print("oubien l'une des syntaxe CaesarCode / CaesarCode -h / CaesarCode --help\n\t\t\t");
					System.out.print("(pour l'afficahge de l'aide)\n");
		System.out.print("Options :\t\t");
				System.out.print("[-option1]: < -c > pour cryptage ou < -d > pour decryptage. (NB: obligatoire)\n\t\t");
				System.out.print("[message]: saisie du message a crypter ou decrypter\n\t\t");
				System.out.print("[-option2]: < -k > pour indiquer si on utilise une cle. Dans le cas echeant laquelle. (NB: Optionnelle. Prend la valeur 13 si non specifiee)\n\t\t");
				System.out.print("[cle]: un entier qui represente la cle de chiffrement. (NB: Prend la valeur 13 si l'option < -k > n'est pas specifiee)\n");
	}
	public static boolean testAlphabet(char lettre)
	{
		int i;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for (i=0; i<25; i++)
		{
			if (lettre==alphabet.charAt(i))
				return true;
		}
		return false;
	}
	public static int position (char lettre)
	{
		int i;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for (i=0; i<25; i++)
		{
			if (lettre==alphabet.charAt(i))
				break;
		}
		return i;
	}
	public static char lettre (int position)
	{
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		return alphabet.charAt(position);
	}
	public static boolean testMessage(String message)
	{
		message=message.toLowerCase();
		int i;
		for (i=0; i<message.length(); i++)
		{
			if (testAlphabet(message.charAt(i))==false)
				return false;
		}
		return true;
	}
	public static String crypter(String message, int cle)
	{
		message=message.toLowerCase();
		int i,position,taille=message.length();
		String nouveauMessage=new String();
		for (i=0; i<taille; i++)
		{
			position=position(message.charAt(i));
			if (position>12)
				position-=12;
			nouveauMessage+=lettre(position+cle);
		}
		return nouveauMessage;
	}
	public static String decrypter(String message, int cle)
	{
		message=message.toLowerCase();
		int i,position,taille=message.length();
		String nouveauMessage=new String();
		for (i=0; i<taille; i++)
		{
			position=position(message.charAt(i));
			if (position<=12)
				position+=12;
			nouveauMessage+=lettre(position-cle);
		}
		return nouveauMessage;
	}
	public static boolean estUnEntier(String chaine)
	{
		try
		{
			Integer.parseInt(chaine);
		}
			catch (NumberFormatException e)
			{
				return false;
			}
		return true;
	}
	public static void erreurSyntaxe()
	{
		System.out.println("La syntaxe n'est pas respectee. Taper <CaesarCode>, <CaesarCode -h> ou <CaesarCode --help> pour voir l'Aide.");
	}
	public static void main(String[] args)
	{
		if ( (args.length==0) || (args.length==1 && args[0].equals("-h")) || (args.length==1 && args[0].equals("--help")) )
		{
			help();
		}
		else
		{
			if ( (args.length==2) || (args.length==4) )
			{
				if (args.length==2)
					{
						boolean test;
						test=testMessage(args[1]);
						if (test==true)
						{
							String nouveauMessage=new String();
							if (args[0].equals("-c"))
								nouveauMessage=crypter(args[1],13);
							if (args[0].equals("-d"))
								nouveauMessage=decrypter(args[1],13);
							System.out.println("Message initial: " + args[0]);
							System.out.println("Message   final: " + nouveauMessage);
						}
					}
				else
				{
					if ( (args[0].equals("-c") || args[0].equals("-d")) && args[2].equals("-k") && estUnEntier(args[3])==true )
					{
						boolean test;
						int cle=Integer.parseInt(args[3]);
						test=testMessage(args[1]);
						if (test==true)
						{
							String nouveauMessage=new String();
							if (args[0].equals("-c"))
								nouveauMessage=crypter(args[1],cle);
							if (args[0].equals("-d"))
								nouveauMessage=decrypter(args[1],cle);
							System.out.println("Message initial: " + args[1]);
							System.out.println("Message   final: " + nouveauMessage);
						}
					}
					else
						erreurSyntaxe();
				}
			}
			else
				erreurSyntaxe();
		}
	}
}
