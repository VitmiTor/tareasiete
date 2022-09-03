package MaestroPokemonTests;

import base.BaseTest;
import models.MaestroPokemonModel;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MaestroPokemonTests extends BaseTest {
    private MaestroPokemonModel maestro1;
    private MaestroPokemonModel maestro2;
    private String codigo = "PO-01";

    @BeforeMethod
    public void agregarValores() {
        maestro1 = new MaestroPokemonModel();
        maestro2 = new MaestroPokemonModel();

        logs.info("Nombre Pokemon Master 1 " + maestro1.getNombre());
        logs.info("Nombre Pokemon Master 2 " + maestro2.getNombre());
        logs.info("Soy la precondición del test de MaestroPokemonTests");
    }

    @Test
    public void prueba1() {
        logs.info("Hola soy el primer test");
    }

    @Test
    public void compararNombresTest() {
        logs.info("Verificando que los nombres de los maestros pokemons sean iguales");
        Assert.assertEquals(maestro1.getNombre(), maestro2.getNombre());
    }

    @Test
    public void compararEspecialidadTest() {
        logs.info("Verificando que la especialidad de los maestros pokemons sean iguales");
        Assert.assertEquals(maestro1.getEspecialidad(), maestro2.getEspecialidad());
    }

    @Test
    public void compararApellidoCodigoEspecialidadTest() {
        logs.info("Verificando que las especialidades de los maestros pokemons sean iguales");
        softAssert.assertEquals(maestro1.getEspecialidad(), maestro2.getEspecialidad(), "Las especialidades no son iguales");

        logs.info("Verificar que el codigo de especialidad de los maestros pokemons sean iguales");
        softAssert.assertEquals(maestro1.getCodigoEspecialidad(), maestro2.getCodigoEspecialidad(), "Los codigos de especialidades no son iguales");

        softAssert.assertAll();
    }

    @Test
    public void validarEspecialidadPokemonTest() {
        logs.info("Verificando que el maestro pokemon 1 sea efectivamente un maestro pokemon por su especialidad");
        softAssert.assertEquals(maestro1.getEspecialidad(), "Maestro Pokemon");

        logs.info("Verificando que maestro pokemon 2 sea efectivamente un maestro pokemon por su especialidad");
        softAssert.assertEquals(maestro2.getEspecialidad(), "Maestro Pokemon");

        logs.info("OK ambos son Maestros pokemons según su especialidad");

        softAssert.assertAll();
    }

    @Test
    public void validaCodigoEspecialidadTest() {
        logs.info("Verificando que el Maestro pokemon 1 sea efectivamente un maestro pokemon por su codigo de " +
                " especialidad ");
        softAssert.assertEquals(maestro1.getCodigoEspecialidad(), codigo);

        logs.info("Verificando que el Maestro pokemon 2 sea efectivamente un maestro pokemon por su codigo de " +
                " especialidad ");
        softAssert.assertEquals(maestro2.getCodigoEspecialidad(), codigo);

        logs.info("OK ambos son Maestros pokemons según su cóodigo de especialidad");
        softAssert.assertAll();
    }

    @Test
    public void validaInformacionMaestroTest() {
        logs.info("Verificando que el maestro pokemon 1 sea efectivamente un maestro pokemon por la especiadlidad");
        Assert.assertEquals(maestro1.getEspecialidad(), "Maestro Pokemon");
        Assert.assertEquals(maestro1.getCodigoEspecialidad(), codigo);
    }

    @AfterMethod
    public void postcondition() {
        logs.info(maestro1.mostrarInformacion());
        logs.info(maestro2.mostrarInformacion());
        logs.info("Soy la postcondición del test de MaestroPokemonTests");
    }
}
