package figures;

public class Test {
    
    public static void main(String[] args) {
        int [] t = new int[4];
        Pile p = new Pile(t);
        try {
            int x = 1, y = 2, z = 3, q = 4;
            p.empiler(x);
            System.out.println(x);
            p.empiler(y);
            System.out.println(y);
            p.empiler(z);
            System.out.println(z);
            p.empiler(q);
            System.out.println(q);
        } catch (ErreurPilePleine e) {
            
        }
    }
}