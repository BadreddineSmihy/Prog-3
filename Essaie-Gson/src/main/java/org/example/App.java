package org.example;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Personne pers = new Personne();
        Gson gson = new Gson();
        String json = gson.toJson(pers);
        System.out.println(json);
        Personne obj2 = gson.fromJson(json, Personne.class);
        System.out.println(obj2.toString());
    }

}
