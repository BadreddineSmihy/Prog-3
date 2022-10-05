package Semaine05;


import org.apache.commons.validator.routines.EmailValidator;

import java.io.IOException;

public class ValidationdeCourriel {

    public static void main(String[] args) throws IOException {

        String Email = args[0];
        EmailValidator marche = EmailValidator.getInstance();
        if (marche.isValid(Email))
        {
            System.out.println("Le email est valide");
        }
        else
        {
            System.out.println("Le email est invalid");
        }



    }


}
