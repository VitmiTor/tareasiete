package models;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;

@ExcelSheet("pokemonList")
public class Pokemon {
    @ExcelCellName("ID")
    private String id;
    @ExcelCellName("NOMBRE")
    private String nombre;
    @ExcelCellName("NOMBRE JAPONES")
    private String nombreJapones;
    @ExcelCellName("ATK")
    private int atk;
    @ExcelCellName("DEF")
    private int def;
    @ExcelCellName("SP")
    private int sp;
    @ExcelCellName("SP DEF")
    private int spDef;
    @ExcelCellName("CRIT")
    private int crit;
    @ExcelCellName("PESO")
    private double peso;
    @ExcelCellName("ATRAPADO")
    private boolean atrapado;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreJapones() {
        return nombreJapones;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSp() {
        return sp;
    }

    public int getSpDef() {
        return spDef;
    }

    public int getCrit() {
        return crit;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isAtrapado() {
        return atrapado;
    }
}
