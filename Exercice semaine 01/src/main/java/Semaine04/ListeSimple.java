package Semaine04;

import java.util.ArrayList;
import java.util.List;

public class ListeSimple {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int[] wow = repete(n1,n2);

        for (int i = 0; i < wow.length ; i++) {
            System.out.println(wow[i]);
        }


    }



    public static int[] repete(int n, int nombreFois) {
        List<Integer> wow = new ArrayList<Integer>();
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < nombreFois ; j++) {
                wow.add(i);
            }
        }
        int[] tab = new int [wow.size()];
        for (int i = 0; i < wow.size() ; i++) {
            tab[i] = wow.get(i);
        }
            return tab;
    }
}

