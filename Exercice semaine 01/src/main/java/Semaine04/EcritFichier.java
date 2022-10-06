package Semaine04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EcritFichier {
    public static void main(String[] args) throws IOException {
        File file1 = new File("./", "vide.txt");
        FileWriter newJsp = new FileWriter(file1);
        newJsp.write(" ");
        newJsp.close();
        File file2 = new File("../", "Nom");
        FileWriter newJsp1 = new FileWriter(file2);
        newJsp1.write("Smihy Badreddine");
        newJsp1.close();
    }
}
