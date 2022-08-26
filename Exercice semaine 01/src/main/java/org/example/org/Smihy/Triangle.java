package org.example.org.Smihy;

public class Triangle

{
    public static void main(String[] args)
    {
        int taille = Integer.parseInt(args[0]);
        for (int i=0; i<taille; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
