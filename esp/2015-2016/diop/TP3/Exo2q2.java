import java.util.Scanner;
public class Exo2q2
{
	static boolean booleen(int[] t)
	{
		int l=t.length, i=0;
		boolean test=true;
		while ( (i<l) && (test==true) )
		{
			if ( t[i]!=t[l-i-1] )
			{
				test=false;
			}
			i++;
		}
		return test;
	}
	public static void main(String[] args)
	{
		Scanner clavier = new Scanner (System.in);
		int t[]=null;
		int l, i=0;
		boolean test;
		do
		{
			System.out.print("Donner la taille du tableau: ");
			l=clavier.nextInt();
			t=new int[l];
		}
		while(l<=1);
		for (i=0; i<l; i++)
		{
			System.out.print("Donner un entier: ");
			t[i]=clavier.nextInt();
		}
		test=booleen(t);
		if (test==true)
			System.out.println("C'est un palindrome");
		else
			System.out.println("Ce n'est pas un palindrome");
	}
}