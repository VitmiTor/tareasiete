package models.Persona;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Trabajos {
    private String description;
    @JsonProperty("hours_per_day")
    private int hours;
    private boolean active;

    public String getDescription() {
        return description;
    }

    public int getHours() {
        return hours;
    }

    public boolean isActive() {
        return active;
    }
}
