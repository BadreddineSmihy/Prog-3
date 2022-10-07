package Semaine02ASemaine03;

public class Exercice_ÉclateTaString
{
    public static void main(String[] args) {

        String mot = args[0].toString();
        char[] parts = mot.toCharArray();
        System.out.println("mot : " + mot + "      Lettres : ");
        for (int i = 0; i < parts.length; i++)
        {
            System.out.println(parts[i]);

        }
    }
}
