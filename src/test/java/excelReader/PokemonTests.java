package excelReader;

import base.BaseTest;
import jdk.jfr.Description;
import models.Pokedex;
import models.Pokemon;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DataProviders;

import java.util.List;

import static utilities.DataProviders.pokemonDataProvider1;
import static utilities.DataProviders.pokemonDataProvider2;


public class PokemonTests extends BaseTest {
    private List<Pokemon> pokemonList;
    private Pokedex pokedex = new Pokedex();

    @BeforeMethod
    public void setup() {
        pokemonList = excelReader.getPokemonList();
    }

    @Test(groups = {smoke})
    public void leerPokemonTest() {
        var pokemon = dataProviders.quienEsEsePokemon("51");
        logs.info(pokemon.getNombre() + "Ese es el nombre del pokemon");
        Assert.assertEquals(pokemon.getNombre(), "Dugtrio");
    }


    @Test(groups = {smoke}, dataProvider = pokemonDataProvider1, dataProviderClass = DataProviders.class)
    @Description("Comparando todo los atributos pokemons")
    public void pokemonProviderTest(Pokemon pokemon) {
        logs.info("Comparando estadisticas pokemon");
        softAssert.assertTrue(pokemon.getAtk() > 0, "El ataque es mayor a 0");
        softAssert.assertTrue(pokemon.getDef() > 0, "La defensa es mayor a 0");
        softAssert.assertTrue(pokemon.getSp() > 0, "El atk especial es mayor a 0");
        softAssert.assertTrue(pokemon.getSpDef() > 0, "La defensa especial mayor a 0");
        softAssert.assertTrue(pokemon.getCrit() > 0, "EL ataque critico es mayor a 0");
        softAssert.assertTrue(pokemon.getPeso() > 0, "El peso es mayor a 0");
        softAssert.assertAll();
    }

    @Test(groups = {regression}, dataProvider = pokemonDataProvider2, dataProviderClass = DataProviders.class)
    public void pokemonTotalProviderTest(Pokemon pokemon) {
        logs.info("Test de comparancion diferente");
        Assert.assertNotEquals(pokemon.getNombre(), pokemon.getNombreJapones());
        var nombre = pokedex.imprimirPokemon(pokemon.getNombre(), pokemon.getNombreJapones());
        logs.info(nombre);
    }
}
