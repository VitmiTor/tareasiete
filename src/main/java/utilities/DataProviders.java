package utilities;

import models.Persona.Persona;
import models.Pokemon;
import org.testng.annotations.DataProvider;

public class DataProviders {
    private final ExcelReader excelReader = new ExcelReader();
    private final MapParser mapParser = new MapParser();
    private final JsonReader jsonReader = new JsonReader();
    public static final String pokemon1DataProvider = "pokemon data provider";
    public static final String pokemon2DataProvider = "pokemon data provider 2";

    private final Logs log = new Logs();

    public Pokemon quienEsEsePokemon(String id) {
        return mapParser.getPokemonMap().get(id);
    }

    public Persona getPersona() {
        return jsonReader.getPersona();
    }

    @DataProvider(name = pokemon1DataProvider)
    public Object[][] pokemonProvider() {
        log.debug("Creando la lista pokemon");
        var pokemonList = excelReader.getPokemonList();
        var listSize = pokemonList.size();

        var object = new Object[listSize][];
        for (var i = 0; i < listSize; i++) {
            object[i] = new Object[]{
                    pokemonList.get(i)
            };
        }
        return object;
    }

    @DataProvider(name = pokemon2DataProvider)
    public Object[][] pokemonProvider2() {
        log.debug("Verificando que el nombre en Japones sea dif del nombre americano");
        var pokemonList = excelReader.getPokemonList();
        var listSize = pokemonList.size();

        var object = new Object[listSize][];
        for (var i = 0; i < listSize; i++) {
            object[i] = new Object[]{
                    pokemonList.get(i)
            };
        }
        return object;
    }
}
