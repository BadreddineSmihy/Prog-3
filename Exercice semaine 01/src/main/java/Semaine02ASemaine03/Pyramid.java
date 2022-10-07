package Semaine02ASemaine03;
import java.util.Collections;

public class Pyramid {
    public static void main(String[] args) {
        int rows = 6;
        System.out.println("\n4. Pyramide inversée\n");
        for (int i = rows; i > 0; i--) {
            System.out.println(String.join("", Collections.nCopies(6 - i, " "))
                    + String.join("", Collections.nCopies(2 * i - 1, "*")));
        }

    }
}
