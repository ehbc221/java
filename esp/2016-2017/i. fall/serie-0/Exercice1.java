import java.util.Scanner;

public class Exercice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int size=0;
		System.out.print("Taille de la pyramide : ");
		size = sc.nextInt();
		drawPyramid(size);
	}
	static void afficheCar(int n, char ch) {
	
		for (int i = 1; i <= n ;i++ ) {
			System.out.print(ch);
		}
	}
	static void drawPyramid(int size) {

		for (int i = 1; i <= size; i++)
        {  
            afficheCar(size - i,' ');
            afficheCar(i * 2 - 1,'*');
          	afficheCar(1,'\n');
        }
	}
}