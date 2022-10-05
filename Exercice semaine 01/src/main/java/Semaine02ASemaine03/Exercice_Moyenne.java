package Semaine02ASemaine03;
import java.util.Random;

public class Exercice_Moyenne
{
    public static void main(String[] args)
    {

        Random rd = new Random(); // créer l'objet random
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rd.nextInt(100); //Créer les numéro random de 1-100
            System.out.println(arr[i]); // print les nombres dans la console
        }


        Integer i = 0;
        float Sum = 0;
        while (i < arr.length)// tant que le i est plus petit que la longuer du tableau on additionne les nombres a l'intérieur
        {
            Sum += arr[i];
            i++;
        }
        float average = (Sum / arr.length); //Calcul de la moyenne
        System.out.println("La moyenne des nombres est de  : " + average); //Print final
    }
}
