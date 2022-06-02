package com.example.dbaufgabe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public List<DbBetriebsstelle> read_csv() {

        String path = "C:\\Users\\BirolK\\IdeaProjects\\DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv";
        String line = "";

        List<DbBetriebsstelle> db_liste = new ArrayList<DbBetriebsstelle>();

            try {
                BufferedReader br = new BufferedReader(new FileReader(path));

                while((line = br.readLine()) != null){
                    // Zeile spalten mithilfe von split()
                    String[] values = line.split(";");
                    //Die notwendigen Infos in das Objekt speichern und in die Liste einfügen
                    db_liste.add(new DbBetriebsstelle(values[2], values[3], values[5], values[1]));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }
            //Liste zurückgeben
            return db_liste;
    }
}
