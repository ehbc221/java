package point;

class Cercle {

	Point centre;
	int rayon;

	public Cercle(Point centre, int rayon) {
		this.setCentre(centre);
		this.setRayon(rayon);
	}

	public int getCentre() {
		return this.centre;
	}

	public int getRayon() {
		return this.rayon;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public void deplace(Point nouveauCentre) {
		this.centre.deplace(nouveauCentre.getX(), nouveauCentre.getY());
	}

	public void affiche() {
		System.out.println("Cercle de centre c: x=" + super.getX() + ", y=" + super.getY() + " et de rayon " + this.rayon);
	}
	
}