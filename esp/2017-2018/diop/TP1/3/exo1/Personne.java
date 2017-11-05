public class Personne {

    private String nom;
    private String prenom;
    private int age;
    private String sexe;

    public Personne() {
        this.setNom("Doe");
        this.setPrenom("John");
        this.setAge(25);
        this.setSexe("Masculin");
    }

    public Personne(String nom, String prenom) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(24);
        this.setSexe("Masculin");
    }

    public Personne(String nom, String prenom, int age) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(age);
        this.setSexe("Masculin");
    }

    public Personne(String nom, String prenom, int age, String sexe) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(age);
        this.setSexe(sexe);
    }

    public Personne(Personne personne) {
        this.setNom(personne.getNom());
        this.setPrenom(personne.getPrenom());
        this.setAge(personne.getAge());
        this.setSexe(personne.getSexe());
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getAge() {
        return this.age;
    }

    public String getSexe() {
        return this.sexe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 130)
            throw new IllegalArgumentException("L'age doit etre compris entre 0 et 130.");
        this.age = age;
    }

    public void setSexe(String sexe) throws IllegalArgumentException {
        if (!sexe.equals("Masculin") && !sexe.equals("Féminin")) {
            throw new IllegalArgumentException("Le sexe doit etre soit 'Masculin', soit 'Féminin'.");
        }
        this.sexe = sexe;
    }

    public String toString() {
        String chaine = new String();
        chaine += "\n\tNom : " + this.nom;
        chaine += "\n\tPrénom : " + this.prenom;
        chaine += "\n\tAge : " + this.age;
        chaine += "\n\tSexe : " + this.sexe;
        chaine += "\n";
        return chaine;
    }

}
