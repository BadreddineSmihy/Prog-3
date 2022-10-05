package Tp01;

import org.apache.commons.validator.routines.UrlValidator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class ExploraSmihy200 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Merci de nous fournir 2 arguments :\n" +
                    "l'URL de la page de départ, la liste de mots clés à ignorer séparés par des espaces entre guillemets.\n" +
                    "Par exemple : https://info.cegepmontpetit.ca/3N5-Prog3/z/index.html \"pipo popi\"");
        } else {
            VerifierDoublons(args[1]);

            String url = args[0];
            if (Valider(url)) {
                try {
                    String orl = url;
                    boolean Exploration = true;
                    while (Exploration && VerifierLien(orl)) {
                        Document document;
                        document = Jsoup.connect(orl).get();
                        Elements links = document.select("a[href]");
                        String title = document.title();
                        System.out.println("Les arguments sont corrects, nous commençons l'exploration de " +
                                "https://info.cegepmontpetit.ca/3N5-Prog3/z/index.html\n" + "Titre: " + title + "   "
                                + "Url : " + orl + "      Liens : " + links.size());
                        ListeDeEmails(orl);
                        CréerFile(orl);
                        if (links.size() <= 0) {
                            System.out.println( "\n" + "L'exploration s'est arrêtée, la page " +  orl + " ne contient aucun lien valide.");
                            Exploration = false;
                        }
                        for (int i = 0; i < links.size(); i++) {
                            if (links.get(i).absUrl("href").contains(args[1]) || ContiensArguments(orl, links)) {
                                orl = links.get(i + 1).absUrl("href");
                            } else {
                                orl = links.get(i).absUrl("href");
                            }
                            break;
                        }
                    }
                } catch (IOException ex) {
                    System.out.println("Il n'y a pas de page correspondante à l'URL :" + url + "\n" +"Merci de fournir une URL correspondant à une page.");

                }
            }else {System.out.print("Nous avons rencontré un problème avec l'URL fournie :" + url + "\n" +"Merci de fournir une URL bien formée \n");}
        }
    }


    public static boolean Valider(String lien) {
        org.apache.commons.validator.routines.UrlValidator defaultValidator = new UrlValidator();
        return defaultValidator.isValid(lien);
    }

    public static void VerifierDoublons(String args) {
        String[] wow = args.split(" ");
        Boolean dupes = false;
        for (int i = 0; i < wow.length; i++) {
            for (int j = i + 1; j < wow.length; j++) {
                if (wow[i] != null && wow[i].equals(wow[j])) {
                    dupes = true;
                    System.out.println("Merci de ne pas avoir de répétitions dans les mots clés " + wow[i]);
                    System.exit(0);
                }
            }
        }
    }

    public static boolean VerifierLien(String Lien){
        try {
            new URL(Lien).toURI();
        } catch (MalformedURLException | URISyntaxException e) {
            System.out.println("Nous avons rencontré un problème avec l'URL fournie : " + Lien + "\n" +
                    "Merci de fournir une URL bien formée");
            return false;
        }

        return true;
    }

    public static boolean ContiensArguments(String orl, Elements link) {
        String[] tabdeargument = orl.split(" ");
        for (int i = 0; i < tabdeargument.length; i++) {
            if (link.get(i).absUrl("href").contains(tabdeargument[i]))
            {
                System.out.println( "\n" +  "\033[31mURL ignorée : \033[0m" + orl +"\n");
                return true;
            }
        }
        return false;
    }

    public static void CréerFile(String url) throws IOException {

        Document document;
        document = Jsoup.connect(url).get();
        URL uri = new URL(url);
        String FullPath = uri.getFile().substring(1);
        String name = FullPath.substring(FullPath.lastIndexOf('/') + 1);
        String PathFinal = FullPath.substring(0, FullPath.length()-name.length());
        File dir = new File(".\\" + PathFinal);
        dir.mkdirs();

        String HTML = document.html();
        List<String> emails = ListeDeEmails(HTML);
        for (String email : emails){
            HTML = HTML.replace(email,"Smihy.Badreddine@pipo.org");

        }

        File file = new File(dir, name);
        FileWriter newJsp = new FileWriter(file);
        newJsp.write(HTML);
        newJsp.close();


    }

    public static List<String> ListeDeEmails(String html) throws IOException {
        Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(html);
        List<String> emails =new ArrayList<>();
        while (m.find()) {
            emails.add(m.group());
        }
        return emails;
    }


    public static <String> ArrayList<String> removeDuplicates(ArrayList<String> list)
    {

        ArrayList<String> newList = new ArrayList<String>();

        for (String element : list) {

            if (!newList.contains(element)) {

                newList.add(element);
            }
        }

        return newList;
    }


}

