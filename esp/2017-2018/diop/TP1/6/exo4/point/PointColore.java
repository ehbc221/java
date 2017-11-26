package point;

public class PointColore extends Point {
	
	private byte c;

	public PointColore(int x, int y, byte c) {
		super(x, y);
		this.setC(c);
	}

	public byte getC() {
		return this.c;
	}

	public void setC(byte c) {
		this.c = c;
	}

	public boolean identique(PointColore pc) {
		Point p1 = new Point(super.getX(), super.getY()), p2 = new Point(pc.getX(), pc.getY());
		if (p1.identique(p2) && this.getC() == pc.getC()) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean identique(Point pc) {
		Point p1 = new Point(super.getX(), super.getY()), p2 = new Point(pc.getX(), pc.getY());
		if (p1.identique(p2) && this.getC() == ((PointColore)pc).getC()) {
			return true;
		}
		else {
			return false;
		}
	}

	public void affiche(String pointColore) {
		System.out.println("PointColore " + pointColore + " : x=" + super.getX() + ", y=" + super.getY() + " et c=" + this.getC());
	}

}