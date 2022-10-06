package Semaine04;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        List<Integer> wow = new ArrayList<Integer>();
        for (int i = 1; i <= 12; i++) {
            YearMonth yearMonthObject = YearMonth.of(2022, i);
            int daysInMonth = yearMonthObject.lengthOfMonth(); //28
            wow.add(daysInMonth);
            System.out.println(daysInMonth);
        }
        System.out.println(wow);
    }

}
