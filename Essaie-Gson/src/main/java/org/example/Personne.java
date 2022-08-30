package org.example;

public class Personne
{
    public String nom = "Maude";
    public int Salaire = 50000;

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", Salaire=" + Salaire +
                '}';
    }
}
