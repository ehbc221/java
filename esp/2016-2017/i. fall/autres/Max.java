import java.util.Scanner;
public class Max {
	static int max(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, x3;
		System.out.print("Donnez le premier nombre : ");
		x1 = sc.nextInt();
		System.out.print("Donnez le second nombre : ");
		x2 = sc.nextInt();
		x3 = max(x1, x2);
		System.out.println("Le maximum entre " + x1 + " et " + x2 + " est : " + x3);
	}
}
