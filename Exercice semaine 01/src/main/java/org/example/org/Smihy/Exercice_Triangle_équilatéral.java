package org.example.org.Smihy;

public class Exercice_Triangle_équilatéral
{
    public static void main(String[] args)
    {
        int taille = Integer.parseInt(args[0]);
        int rows = taille, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}
