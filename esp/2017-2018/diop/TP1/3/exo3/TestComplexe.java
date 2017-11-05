public class TestComplexe {

    public static void main(String[] args) {
        Complexe n1 = new Complexe();
        System.out.println("n1 : " + n1.tosString());
        Complexe n2 = new Complexe(8, 9);
        System.out.println("n2 : " + n2.tosString());
        Complexe n3 = new Complexe(n1);
        System.out.println("n3 : " + n3.tosString());
        n3.ajouter(n1);
        System.out.println("n3 après ajout de n1 : " + n3.tosString());
        n2.soustraire(n3);
        System.out.println("n2 après soustraction de n3 : " + n2.tosString());
    }
    
}
