class Personne {

    private Name name;

    public Personne() {
        this.name = new Name();
    }

    public Personne(String prenom, String nom) {
        this.name = new Name();
        this.name.setPrenom(prenom);
        this.name.setNom(nom);
    }

    public Personne(Name name) {
        this.name = name;
    }

    public Personne(Personne personne) {
        this.name = personne.getName();
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

}