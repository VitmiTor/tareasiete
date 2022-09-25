package jsonReader;

import base.BaseTest;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class PersonaTests extends BaseTest {

    @Test(groups = {smoke})
    @Description("Verificando Json Persona")
    public void edadTest() {
        var persona = dataProviders.getPersona();
        softAssert.assertEquals(persona.getName(), "Anahi");
        softAssert.assertEquals(persona.getLastname(), "Rodriguez", "Verificando apellido");
        softAssert.assertEquals(persona.getWeight(), 52.11, "Verificando Peso");
        softAssert.assertEquals(persona.getNumCertificates(), 5, "Verificando numero de certificados");
        softAssert.assertEquals(persona.getCountry(), "Peru", "Verificando país");
        softAssert.assertEquals(persona.isMarried(), true, "Verificando que sea casada");
        softAssert.assertAll();
    }

    @Test(groups = {regression})
    @Description("Verificando a los amigos")
    public void amigosTest() {
        logs.info("Verificando lista de amigos");
        var amigosList = dataProviders.getPersona().getAmigos();
        var amiguito = amigosList.get(1);
        softAssert.assertEquals(amiguito.getName(), "Alejandro", "Verificando nombre del amigo");
        softAssert.assertEquals(amiguito.getProfession(), "Constructor");
        softAssert.assertEquals(amiguito.getWhereMeet(), "Tienda");
        softAssert.assertAll();
    }

    @Test(groups = {regression})
    @Description("Verificando a los trabajos")
    public void trabajosTest() {
        logs.info("Verificando el trabajo");
        var trabajosMap = dataProviders.getPersona().getTrabajos();
        var singletrabajo = trabajosMap.get("junior");
        softAssert.assertEquals(singletrabajo.getDescription(), "trabajo como practicante luego de la universdad");
        softAssert.assertEquals(singletrabajo.getHours(), 4, "Verificando horas de trabjo");
        softAssert.assertEquals(singletrabajo.isActive(), false);
        softAssert.assertAll();
    }
}
