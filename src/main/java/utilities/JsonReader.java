package utilities;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Persona.Persona;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    private final String jsonFolder = "src/test/resources/data";
    private final Logs logs = new Logs();
    private String jsonFile;
    private String fullPath;

    private ObjectMapper getObjectMapper() {
        var mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        return mapper;
    }
    
    public Persona getPersona() {
        logs.debug("Leyendo Persona Json");
        jsonFile = "persona.json";
        fullPath = String.format("%s/%s", jsonFolder, jsonFile);
        var mapper = getObjectMapper();
        try {
            return mapper.readValue(new File(fullPath), Persona.class);
        } catch (IOException ioException) {
            logs.error(ioException.getLocalizedMessage());
            return null;
        }
    }
}
