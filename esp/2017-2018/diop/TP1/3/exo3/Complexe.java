public class Complexe {

    private int partieReelle;
    private int partieImaginaire;

    public Complexe() {
        this.setPartieReelle(2);
        this.setPartieImaginaire(3);
    }

    public Complexe(int partieReelle, int partieImaginaire) {
        this.setPartieReelle(partieReelle);
        this.setPartieImaginaire(partieImaginaire);
    }

    public Complexe(Complexe complexe) {
        this.setPartieReelle(complexe.getPartieReelle());
        this.setPartieImaginaire(complexe.getPartieImaginaire());
    }

    public int getPartieReelle() {
        return this.partieReelle;
    }
    public int getPartieImaginaire() {
        return this.partieImaginaire;
    }

    public void setPartieReelle(int partieReelle) {
        this.partieReelle = partieReelle;
    }

    public void setPartieImaginaire(int partieImaginaire) {
        this.partieImaginaire = partieImaginaire;
    }

    public void ajouter(Complexe complexe) {
        this.setPartieReelle(this.getPartieReelle() + complexe.getPartieReelle());
        this.setPartieImaginaire(this.getPartieImaginaire() + complexe.getPartieImaginaire());
    }

    public void soustraire(Complexe complexe) {
        this.setPartieReelle(this.getPartieReelle() - complexe.getPartieReelle());
        this.setPartieImaginaire(this.getPartieImaginaire() - complexe.getPartieImaginaire());
    }

    public String tosString() {
        return "\t" + this.getPartieReelle() + " + " + this.getPartieImaginaire() + "i";
    }

}
