import java.util.*;
public class Devin
{
	public static void main(String args[])
	{
		Scanner clavier=new Scanner(System.in);
		int note,nombre,meilleur=0,mauvaise=20,somme=0,moyenne=0;
		System.out.print("Donner n: ");
		note=clavier.nextInt();
		for (i=0; i<n; i++)
		{
			do
			{
				System.out.print("Donner un nombre: ");
				nombre=clavier.nextInt();
			}while(nombre<0 || nombre>20);
			if (nombre>meilleur)
				meilleur=nombre;
			if (nombre<mauvaise)
				mauvaise=nombre;
			somme+=nombre;
		}
		moyenne=somme/n;
		System.out.print("La meilleure note est: " + meilleur);
		System.out.print("La mauvaise note est: " + mauvaise);
		System.out.print("La moyenne est: " + moyenne);
	}
}