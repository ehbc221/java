import java.util.Scanner;
public class Exo7{
//la fonction du palindrome
 	static void palindrome(int[]pal, int i){
 		 Scanner clavier = new Scanner (System.in);
 		boolean rep; 
 
         rep=true;
         i=1;
          while (i<=(n/2) & rep==true)
        {
           if(pal[n+1-i] != pal[i])
           {
           	rep=false;
           }
           i++;
        }
        if (rep==true)
        
        	System.out.println ("le tableau est un palindrome\n");
          else
          	System.out.println ("le tableau n'est pas un palindrome\n");
    }

    //la fonction de main
 public static void main(String[] args)
 {     
 Scanner clavier = new Scanner (System.in);
        int pal[i]=clavier.nextInt();
 		int i,n;
 		System.out.println ("donner la taille du tableau\n");
 		n = clavier.nextInt();
 		for (i = 1;i <=n ;i++)
 		{
 			System.out.println ("donner les elements  du tableau\n");
 			pal[i]=clavier.nextInt();
        }
 }  
}
