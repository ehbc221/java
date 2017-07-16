package figures;

public class Pile {
    int taille_max = 3;
    private int sommet;
    private int[ ] elements;

    public Pile(int [] tab) {
        this.sommet = 0;
        this.elements = tab;
    }

    public void empiler(int x) throws ErreurPilePleine {
        if (sommet == taille_max)
            throw new ErreurPilePleine();
        else
            elements[++sommet] = x;
    }
}