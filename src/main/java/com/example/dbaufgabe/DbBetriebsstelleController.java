package com.example.dbaufgabe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DbBetriebsstelleController {

    @GetMapping("/betriebsstelle/{abkuerzung}")
    public DbBetriebsstelle send(@PathVariable("abkuerzung") String abkuerzung) {

        CsvReader obj = new CsvReader();

        List<DbBetriebsstelle> db_liste = obj.read_csv();

        // Schleife zum Finden der jeweiligen Abkürzung in der Liste
        for(DbBetriebsstelle element : db_liste) {
            //Bei True das Objekt zurückgeben
            if(element.getAbkuerzung().equalsIgnoreCase(abkuerzung)) {
                return element;
            }
            System.out.println(element.getKurz_name());
        }
        //Bei False null zurückgeben
        return null;
    }
}
