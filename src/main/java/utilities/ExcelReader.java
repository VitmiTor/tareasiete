package utilities;

import com.poiji.bind.Poiji;
import models.Pokemon;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final String excelPath = "src/test/resources/data/pokemonList.xlsx";
    private final Logs logs = new Logs();

    public List<Pokemon> getPokemonList() {
        logs.debug("Leyendo la lista de pokemons");
        return Poiji.fromExcel(new File(excelPath), Pokemon.class);
    }
}
