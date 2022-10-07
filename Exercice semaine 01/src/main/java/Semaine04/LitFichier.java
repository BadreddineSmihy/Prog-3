package Semaine04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LitFichier {
    public static void main(String[] args) {
        try {
            File myObj = new File("Nome");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
