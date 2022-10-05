package Semaine02;

import com.google.common.io.Resources;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Exercice_Web
{
    public static void main(String[] args)
    {
        try {
            String text = new Scanner(new URL(args[0].toString()).openStream(), "UTF-8").useDelimiter("\\A").next();
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
