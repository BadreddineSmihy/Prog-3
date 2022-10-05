package Semaine05;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.File;

import java.io.FileWriter;
import java.net.*;
import java.io.IOException;

public class ExerciceJsoup {

    public static void main(String[] args) throws IOException {

        String orl = args[0].toString();

        Document document;
        document = Jsoup.connect(orl).get();
        Elements links = document.select("a[href]");
        String title = document.title();


        File Fichier = new File("../" + title + ".html");
        FileWriter myWriter = new FileWriter(title + ".html");
        myWriter.write(links.toString());
        myWriter.close();


        System.out.println(links);
    }
}
