package models.Persona;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.HashMap;
import java.util.List;

@JsonRootName("person")
public class Persona {
    private String name;
    private String lastname;
    private double weight;
    private int numCertificates;
    private String country;
    private boolean married;
    private List<String> favoriteMeals;
    private List<Amigos> amigos;
    private HashMap<String, Trabajos> trabajos;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public double getWeight() {
        return weight;
    }

    public int getNumCertificates() {
        return numCertificates;
    }

    public String getCountry() {
        return country;
    }

    public boolean isMarried() {
        return married;
    }

    public List<String> getFavoriteMeals() {
        return favoriteMeals;
    }

    public List<Amigos> getAmigos() {
        return amigos;
    }

    public HashMap<String, Trabajos> getTrabajos() {
        return trabajos;
    }
}
