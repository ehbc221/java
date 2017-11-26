import point.*;

public class TestPoint {

	static void affichePointIdentique(Point p1, Point p2) {
		if (p1.identique(p2)) {
			System.out.println("Les 2 Point sont identiques");
		}
		else {
			System.out.println("Les 2 Point ne sont pas identiques");
		}
	}

	static void affichePointColoreIdentique(PointColore pc1, PointColore pc2) {
		if (pc1.identique(pc2)) {
			System.out.println("Les 2 PointColore sont identiques");
		}
		else {
			System.out.println("Les 2 PointColore ne sont pas identiques");
		}
	}

	public static void main(String[] args) {
		Point p1 = new Point(3, 4), p2 = new Point(3, 4), p3 = new Point(5, 5);
		PointColore pc1 = new PointColore(4, 3, (byte) 0), pc2 = new PointColore(4, 3, (byte) 0), pc3 = new PointColore(5, 5, (byte) 0);
		p1.affiche("p1");
		p2.affiche("p2");
		p3.affiche("p3");
		System.out.print("p1 et p2 : ");
		affichePointIdentique(p1, p2);
		System.out.print("p1 et p3 : ");
		affichePointIdentique(p1, p3);

		pc1.affiche("pc1");
		pc2.affiche("pc2");
		pc3.affiche("pc3");
		System.out.print("pc1 et pc2 : ");
		affichePointColoreIdentique(pc1, pc2);
		System.out.print("pc1 et pc3 : ");
		affichePointColoreIdentique(pc1, pc3);

		Point p4 = new PointColore (3, 4, (byte) 5);
		Point p5 = new PointColore (3, 4, (byte) 6);
		p4.affiche("p4");
		p5.affiche("p5");
		System.out.print("p4 et p5 : ");
		affichePointIdentique(p4, p5);
	}

}