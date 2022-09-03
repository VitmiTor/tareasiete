package models;

import com.github.javafaker.Faker;

public class MaestroPokemonModel {
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private String pais;
    private String email;
    private boolean esHombre;
    private String especialidad = "Maestro Pokemon";
    private String codigoEspecialidad = "PO-01";

    public MaestroPokemonModel() {
        var faker = new Faker();
        nombre = faker.name().firstName();
        apellido = faker.name().lastName();
        edad = faker.number().numberBetween(10, 20);
        peso = faker.number().randomDouble(2, 54, 60);
        pais = faker.country().name();
        email = faker.internet().emailAddress();
        esHombre = faker.bool().bool();
    }

    public String mostrarInformacion() {
        var mensaje = String.format("Hola mi nombre es %S %S tengo %d años y peso %.2f" +
                        " Vivo en el país %S cuento con el email %S y si me preguntan si soy hombre pues es %B",
                nombre, apellido, edad, peso, pais, email, esHombre);

        return mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getPais() {
        return pais;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEsHombre() {
        return esHombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getCodigoEspecialidad() {
        return codigoEspecialidad;
    }
}
