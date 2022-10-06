package Semaine04;
import java.util.ArrayList;
import java.util.List;

public class test3 {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 12; i++) {

            if(i <= 7){
                if(i == 2){
                    list.add(28);
                }
                else if(i % 2 == 0){
                    list.add(30);
                }
                else {
                    list.add(31);
                }

            }
            else {
                if(i % 2 == 1){
                    list.add(30);
                }
                else if (i % 2 == 0)
                {
                    list.add(31);
                }
            }

        }
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

    }


}