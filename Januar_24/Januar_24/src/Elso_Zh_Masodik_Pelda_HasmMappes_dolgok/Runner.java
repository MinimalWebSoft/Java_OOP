package Elso_Zh_Masodik_Pelda_HasmMappes_dolgok;

import treemappes_1zh_masodikfeladat.Tantargy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Hallgato> hallgatok = new ArrayList<>();

        Szak matekszak = new Szak("Matek Szak", "Matek1", 6);
        Szak infoszak = new Szak("Info Szak", "Info1", 6);

        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM1098", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM1098", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM1098", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM1098", "Balog Sebastian David", matekszak));
        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian mATE", infoszak));
        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian", infoszak));
        hallgatok.add(new Hallgato("CDM1098", "Balog Sebastian", matekszak));
        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian", infoszak));
        hallgatok.add(new Hallgato("CDM109", "Balog Sebastian Matyas", infoszak));


        HashMap<String, List<Hallgato>> szakokHashMap = new HashMap<>();

        for (Hallgato hallgato : hallgatok) {
            String szakKod = hallgato.getSzak().getKod();

            // Ha még nincs ilyen szak a HashMap-ben, létrehozunk egy új listát
            szakokHashMap.putIfAbsent(szakKod, new ArrayList<>());

            // Hozzáadjuk a Hallgato-t a szakhoz tartozó listához
            szakokHashMap.get(szakKod).add(hallgato);
        }

        // Kiíratás
        for (String szakKod : szakokHashMap.keySet()) {
            System.out.println("Szak kódja: " + szakKod);
            System.out.println("Hallgatók:");
            for (Hallgato hallgato : szakokHashMap.get(szakKod)) {
                System.out.println("  " + hallgato);
            }
            System.out.println();
        }



    }
}
