package com.example.dbaufgabe;

public class DbBetriebsstelle {

    private final String name;
    private final String kurz_name;
    private final String typ;
    private final String abkuerzung;

    public DbBetriebsstelle(String name, String kurz_name, String typ, String abkuerzung) {
        this.name = name;
        this.kurz_name = kurz_name;
        this.typ = typ;
        this.abkuerzung = abkuerzung;
    }

    public String getName() {
        return name;
    }

    public String getKurz_name() {
        return kurz_name;
    }

    public String getTyp() {
        return typ;
    }

    public String getAbkuerzung() {
        return abkuerzung;
    }
}
