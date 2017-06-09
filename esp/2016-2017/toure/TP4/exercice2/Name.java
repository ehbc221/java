class Name {

    private String prenom;
    private String nom;

    public Name() {
        this.prenom = "Nat";
        this.nom = "Withers";
    }

    public Name(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Name(Name name) {
        this.prenom = name.getPrenom();
        this.nom = name.getNom();
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}