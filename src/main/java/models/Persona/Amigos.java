package models.Persona;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Amigos {
    private String name;
    private String profession;
    @JsonProperty("where_they_meet")
    private String whereMeet;

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getWhereMeet() {
        return whereMeet;
    }
}
