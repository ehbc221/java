public class Hello {
    public static void main(String[] args) {
        if (args.length == 0)
            System.out.println("Hello World !");
        else if (args.length == 1)
            System.out.println("Hello " + args[0] + " !");
        else {
            for (int i = 0, taille = args.length;  i < taille; i++) {
                System.out.println("Hello " + args[i] + " !");
            }
        }
            
    }
}
