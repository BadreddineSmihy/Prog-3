package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try
        {
            Document doc = Jsoup.connect("http://perdu.com/").get();
            Elements img = doc.select("img"); // a with href
            System.out.println("Mes images" + img.toString());
        }
        catch (IOException e)
        {
            System.err.println("Incapable de se connecter au site. Veuillez vérifiez l'URL du site.");
            e.printStackTrace();
        }

    }

}

