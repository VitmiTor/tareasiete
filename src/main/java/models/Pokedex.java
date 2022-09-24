package models;

public class Pokedex {
    Pokemon pokemon = new Pokemon();


    public String imprimirPokemon(String nombre1, String nombre2) {
        var mensaje = String.format("Mi nombre de pokemon es %s y mi nombre en japones es %s", nombre1, nombre2);
        return mensaje;
    }

}
