class Contacts {

    // Objets représentant mes amis
    Personne contact;
    String telephone; // e.g., " 773587910"
    Contacts next; // prochain objet(ami) de la liste
    static Contacts list; // Liste chainée d’amis

    public Contacts() {
        this.contact = new Personne();
        this.telephone = "217-5912";
        this.next = (list == null) ? null : list;
        list = this;
    }

    public Contacts(Personne contact, String telephone) {
        this.contact = new Personne(contact);
        this.telephone = telephone;
        this.next = (list == null) ? null : list;
        list = this;
    }

    public Contacts(Contacts contact) {
        this.contact = new Personne(contact.getContact());
        this.telephone = contact.getTelephone();
        this.next = contact.getNext();
        list = this;
    }

    public Personne getContact() {
        return this.contact;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public Contacts getNext() {
        return this.next;
    }

    public void setContact(Personne contact) {
        this.contact = new Personne(contact);
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNext(Contacts next) {
        this.next = new Contacts(next);
    }

    public String toString() {
        return this.contact.getName().getPrenom() + " " + this.contact.getName().getNom() + ":\t\t" + this.telephone;
    }

    static void print() {
        System.out.println("Liste des contacts :");
        if (list == null) {
            System.out.println("La liste est vide.");
        }
        else {
            Contacts contact_actuel = list;
            while (contact_actuel != null) {
                System.out.println(contact_actuel.toString());
                contact_actuel = contact_actuel.next;
            }
        }
    }

    static void add(Personne unePersonne, String sonTelephone) {
        boolean existe = false;
        Contacts contact_actuel = list;
        while (contact_actuel != null) {
            if (contact_actuel.getTelephone() == sonTelephone) {
                existe = true;
                break;
            }
            contact_actuel = contact_actuel.next;
        }
        if (!existe) {
            Contacts contact_temp = new Contacts();
            contact_temp.contact = new Personne(unePersonne);
            contact_temp.telephone = sonTelephone;
            contact_temp.next = (list == null) ? null : list;
            list = contact_temp;
            System.out.println("Contact ajouté.");
        }
        else {
            System.out.println("Ce numéro éxiste déja. Echec de l'ajout du contact.");
        }
    }

    static int find(Contacts contact) {
        int existe = 0;
        Contacts contact_actuel = list;
        while (contact_actuel != null) {
            if (contact_actuel.getContact().getName().getNom() == contact.getContact().getName().getNom() && contact_actuel.getContact().getName().getPrenom() == contact.getContact().getName().getPrenom() && contact_actuel.getTelephone() == contact.getTelephone()) {
                return existe = 1;
            }
            contact_actuel = contact_actuel.next;
        }
        return existe;
    }

    static void rm(Contacts contact) {
        boolean existe = false;
        Contacts contact_actuel = list;
        while (contact_actuel != null) {
            if (contact_actuel.getContact().getName().getNom() == contact.getContact().getName().getNom() && contact_actuel.getContact().getName().getPrenom() == contact.getContact().getName().getPrenom() && contact_actuel.getTelephone() == contact.getTelephone()) {
                existe = true;
                list = (contact_actuel.next == null) ? null : contact_actuel.next;
                System.out.println("Contact supprimé.");
                break;
            }
            contact_actuel = contact_actuel.next;
        }
        if (!existe) {
            System.out.println("Ce contact n'éxiste pas. Echec de la suppression du contact.");
        }
    }

}