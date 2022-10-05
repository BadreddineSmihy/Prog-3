package Semaine05;

import org.magicwerk.brownies.collections.GapList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exercice_ArrayList_LinkedList_et_GapList {

    public static void main(String[] args) throws IOException {

        GapList<Integer> TestGap = new GapList<Integer>(); //Creation de la liste
        ArrayList<Integer> TestArray = new ArrayList<Integer>(); //Creation de la liste
        LinkedList<Integer> TestLinked = new LinkedList<Integer>(); //Creation de la liste

        testeCetteListe(TestLinked); //test de la liste

        System.out.println(TestLinked);

    }


    static void testeCetteListe(List<Integer> liste){

        for (int i = 0; i < 1000; i++) {
            Random random = new Random(1234);
            long a = System.currentTimeMillis();
            liste.add(random.nextInt());
            // ajouter 1000 element en dernière position liste.add(nombre);
            long b = System.currentTimeMillis();
            liste.add(0, random.nextInt());
            // ajouter 1000 element en première position liste.add(0, nombre);
            long c = System.currentTimeMillis();
            liste.add(random.nextInt(liste.size()), random.nextInt());
            // ajouter 1000 element position au hasard liste.add(random.nextInt(liste.size()), nombre);
            long d = System.currentTimeMillis();
            System.out.println( "wow" + (b - a + c - b + d - c));
            // afficher b-a, c-b, d-c qui sont les durées d'exécution en millisecondes
        }

    }
}
