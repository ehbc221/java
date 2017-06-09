public class Main {

    public static void main(String[] args) {
        System.out.println("\n\tAffichage de la liste :\n");
        // static void print() ;
        Contacts.print();
        // public Contacts() ;
        System.out.println("\n\tAjout de 2 nouveaux contacts :\n");
        Contacts c0 = new Contacts();
        Personne p1 = new Personne("Bill", "Ross");
        // public Contacts(Personne contact, String telephone) ;
        Contacts c1 = new Contacts(p1, "283-9104");
        System.out.println("\n\tRéaffichage de la liste des contacts :\n");
        Contacts.print();
        // static int find(Contacts) ;
        System.out.println("\n\tTest de recherche d'un contact déjà ajouté (c1) :\n");
        int existe;
        existe = Contacts.find(c1);
        if (existe == 1) {
            System.out.println("Ce contact éxiste.");
        }
        else {
            System.out.println("Ce contact n'éxiste pas.");
        }
        // static void rm(Contacts) ;
        System.out.println("\n\tTest de suppression de ce meme contact(c1) :\n");
        Contacts.rm(c1);
        System.out.println("\n\tRéaffichage de la liste des contacts :\n");
        Contacts.print();
        // static void add(Personne unePersonne, String sonTelephone) ;
        System.out.println("\n\tTest d'ajout d'un contact (mais avec un numéro de téléphone déjà éxistant) :\n");
        Personne p2 = new Personne("Martin", "Ryle");
        Contacts.add(p2, "217-5912");
        System.out.println("\n\tTest d'ajout d'un contact (mais avec un numéro de téléphone n'éxistant pas) :\n");
        Contacts.add(p2, "388-1095");
    }

}