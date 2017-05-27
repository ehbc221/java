import java.util.Scanner;
public class Exo1
{
	// 1) Cette fonction permet de remplir les éléments d’un tableau t
	static void saisir(int[] t)
	{
		int n=t.length,i,j;
		Scanner clavier=new Scanner(System.in);
		for (i=0; i<n; i++)
		{
			j=i+1;System.out.print("Donner l'element " + j + ": ");
			t[i]=clavier.nextInt();
		}
	}
	// 2) Cette fonction renvoie la sommer les éléments du tableau t
	static int somme(int[] t)
	{
		int n=t.length,i,som=0;
		for (i=0; i<n; i++)
		{
			som+=t[i];
		}
		return som;
	}
	// 3) Cette fonction renvoie le maximum des éléments du tableau t
	static int maximum(int[] t)
	{
		int i,n=t.length;
		if (n==1)
		{
			return t[0];
		}
		int max=t[0];
		for (i=1; i<n; i++)
		{
			if (t[i]>max)
			{
				max=t[i];
			}
		}
		return max;
	}
	// Cette fonction renvoie le minimum des éléments du tableau t (elle n'a pas ete demandee mais nous sera utile lors de la definition de la fonction <delta>)
	static int minimum(int[] t)
	{
		int i,n=t.length;
		if (n==1)
		{
			return t[0];
		}
		int min=t[0];
		for (i=1; i<n; i++)
		{
			if (t[i]<min)
			{
				min=t[i];
			}
		}
		return min;
	}
	// 4) Cette fonction renvoie la différence entre le maximum et le minimum des éléments du tableau t
	static int delta(int[] t)
	{
		int max=maximum(t),min=minimum(t),difference;
		difference=max-min;
		return difference;
	}
	// 5) Cette fonction fait le tri des éléments du tableau t
	static void bubble(int[] t)
	{
		int i,j,n=t.length,temp;
		if (n!=1)
		{
			for (i=0; i<n-1; i++)
			{
				for (j=i+1; j<n; j++)
				{
					if (t[i]>t[j])
					{
						temp=t[i];
						t[i]=t[j];
						t[j]=temp;
					}
				}
			}
		}
	}
	// 6) Cette fonction renvoie vrai si les deux tableaux contiennent exactement les mêmes éléments aux mêmes indices
	static boolean egalite(int[] t1, int[] t2)
	{
		boolean egal=true;
		if (t1.length!=t2.length)
		{
			egal=false;
		}
		else
		{
			int i=0,taille=t1.length;
			for (i=0; i<taille; i++)
			{
				if (t1[i]!=t2[i])
				{
					egal=false;
				}
				i++;
			}
		}
		return egal;
	}
	// 7) Cette fonction renvoie vrai si les deux tableaux contiennent les mêmes éléments ; les deux tableaux ne sont pas forcément de même taille
	static boolean equivalence(int[] t1, int[] t2)
	{
		int i=0,j=0,taille=t1.length;
		boolean egal=true,trouve=false;
		for (i=0; i<taille; i++)
		{
			for (j=0; j<taille; j++)
			{
				trouve=false;
				if (t1[i]==t2[j])
				{
					trouve=true;
					break;
				}
			}
			if (trouve==false)
			{
				egal=false;
				break;
			}
		}
		return egal;
	}
	// Cette fonction permet d'afficher les elements d'un tableau (elle n'a pas ete demandee mais nous sera utile a l'interieur de la fonction <main>)
	static void affichage(int[] t)
	{
		int i,n=t.length;
		for (i=0; i<n; i++)
		{
			System.out.println(t[i]);
		}
	}
	// 8) Fonction principale <main>
	public static void main(String[] args)
	{
		Scanner clavier=new Scanner(System.in);
		int[] t1, t2, tab;
		int choix,n,som=0,max=0,diff=0;
		boolean test;
		System.out.println("Saisissez le premier tableau:");
		System.out.print("Donner le nombre d'elements du tableau: ");
		n=clavier.nextInt();
		t1=new int[n];
		saisir(t1);
		System.out.println("\nSaisissez le second tableau:");
		System.out.print("Donner le nombre d'elements du tableau: ");
		n=clavier.nextInt();
		t2=new int[n];
		saisir(t2);
		System.out.println("Voici les deux tableaux:");
		System.out.println("Tableau 1\t");affichage(t1);
		System.out.println("Tableau 2\t");affichage(t2);
		test=egalite(t1,t2);
		if (test==true)
			System.out.println("Ces deux tableaux sont egaux:");
		else
			System.out.println("Ces deux tableaux ne sont pas egaux:");
		test=equivalence(t1,t2);
		if (test==true)
			System.out.println("Ces deux tableaux sont equivalents:");
		else
			System.out.println("Ces deux tableaux ne sont pas equivalents:");
		do
		{
			System.out.print("Taper 1 pour continuer avec le tableau 1, ou 2 pour le tableau 2: ");
			choix=clavier.nextInt();
		}while(choix!=1 && choix!=2);
		if (choix==1)
			tab=t1;
		else
			tab=t2;
		som=somme(tab);
		max=maximum(tab);
		diff=delta(tab);
		System.out.println("La somme des elements du tableau est: " + som);
		System.out.println("Le maximum des elements du tableau est: " + max);
		System.out.println("La difference entre le maximum et le minimum du tableau est: " + diff);
		bubble(tab);
		System.out.println("Apres avoir fait le tri en bulle, voici le nouveau tableau:");
		affichage(tab);
	}
}