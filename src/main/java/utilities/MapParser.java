package utilities;

import models.Pokemon;

import java.util.HashMap;

public class MapParser {

    private final Logs logs = new Logs();
    private final ExcelReader excelReader = new ExcelReader();

    public HashMap<String, Pokemon> getPokemonMap() {
        logs.debug("Cogiendo el mapa de pokemon");
        var map = new HashMap<String, Pokemon>();
        var pokemonList = excelReader.getPokemonList();
        for (var pokemon : pokemonList) {
            map.put(pokemon.getId(), pokemon);
        }
        return map;
    }

  
}
