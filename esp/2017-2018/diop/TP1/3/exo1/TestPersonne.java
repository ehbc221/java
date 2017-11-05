public class TestPersonne {

    public static void main(String[] args) {
        Personne p1 = new Personne();
        System.out.println("p1 => " + p1.toString());
        Personne p2 = new Personne("Lanez", "Tory");
        System.out.println("p2 => " + p2.toString());
        Personne p3 = new Personne("Tiller", "Bryson", 23);
        System.out.println("p3 => " + p3.toString());
        Personne p4 = new Personne("Aiko", "Jhene", 26, "Féminin");
        System.out.println("p4 => " + p4.toString());
        Personne p5 = new Personne(p1);
        System.out.println("p5 => " + p5.toString());
    }
    
}
