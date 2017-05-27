class Palindrome
{
    static String inverse(String s)
    {
    int longueur = s.length();
    char [] envers = new char[longueur];
    int i;
 
    for (i = 0; i < longueur; i++)
        envers[i] = s.charAt(longueur - i - 1);
    return new String(envers);
    }
}

public class EssaiPalindrome
{
    static String inverse(String s)
    {
        int longueur = s.length();
        char [] envers = new char[longueur];
        int i;
 
        for (i = 0; i < longueur; i++)
        envers[i] = s.charAt(longueur - i - 1);
        return new String(envers);
    }
    public static void main(String[] arg)
    {
        String chaine = arg[0];
        String autre = Palindrome.inverse(chaine);
        if (autre.equals(chaine))
            System.out.println(chaine + " est un palindrome");
        else
            System.out.println(chaine + " n'est pas un palindrome");
    }
}