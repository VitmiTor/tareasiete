package excelReader;

import base.BaseTest;
import jdk.jfr.Description;
import models.Pokedex;
import models.Pokemon;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DataProviders;

import static utilities.DataProviders.pokemon1DataProvider;
import static utilities.DataProviders.pokemon2DataProvider;

public class PokemonTests extends BaseTest {

    private Pokedex pokedex = new Pokedex();
    
    @Test(groups = {smoke})
    public void leerPokemonTest() {
        var pokemon = dataProviders.quienEsEsePokemon("51");
        logs.info(pokemon.getNombre() + "Ese es el nombre del pokemon");
        Assert.assertEquals(pokemon.getNombre(), "Dugtrio");
    }

    @Test(groups = {regression}, dataProvider = pokemon1DataProvider, dataProviderClass = DataProviders.class)
    @Description("Comparando todo los atributos pokemons")
    public void pokemonProviderTest(Pokemon pokemon) {
        logs.info("Comparando estadisticas pokemon");
        softAssert.assertTrue(pokemon.getAtk() > 0, "El ataque ");
        softAssert.assertTrue(pokemon.getDef() > 0, "La defensa ");
        softAssert.assertTrue(pokemon.getSp() > 0, "El atk especial ");
        softAssert.assertTrue(pokemon.getSpDef() > 0, "La defensa especial ");
        softAssert.assertTrue(pokemon.getCrit() > 0, "EL ataque critico ");
        softAssert.assertTrue(pokemon.getPeso() > 0, "El peso ");
        softAssert.assertAll();
    }

    @Test(groups = {regression}, dataProvider = pokemon2DataProvider, dataProviderClass = DataProviders.class)
    public void pokemonTotalProviderTest(Pokemon pokemon) {
        logs.info("Test de comparancion diferente");
        Assert.assertNotEquals(pokemon.getNombre(), pokemon.getNombreJapones());
        var nombre = pokedex.imprimirPokemon(pokemon.getNombre(), pokemon.getNombreJapones());
        logs.info(nombre);
    }
}
