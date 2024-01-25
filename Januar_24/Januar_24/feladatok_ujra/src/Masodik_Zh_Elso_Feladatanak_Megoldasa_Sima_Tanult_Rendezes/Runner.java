package Masodik_Zh_Elso_Feladatanak_Megoldasa_Sima_Tanult_Rendezes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Rendeles> rendelesek = new ArrayList<>();
        rendelesek.add(new Rendeles("12", 1511, LocalDate.now(), "Sebi1", "Debrecen Halász"));
        rendelesek.add(new Rendeles("123", 1523, LocalDate.now(), "Sebi2", "Debrecen"));
        rendelesek.add(new Rendeles("142", 1522, LocalDate.now(), "Sebi22", "Debrecen"));
        rendelesek.add(new Rendeles("12", 1511, LocalDate.now(), "Sebi3", "Debrecen"));
        rendelesek.add(new Rendeles("121", 151111, LocalDate.now(), "Sebi2", "Debrecen"));

        for ( Rendeles rend : rendelesek) {
            System.out.println(rend);
        }
        System.out.println();

        Collections.sort(rendelesek, new Comparator<Rendeles>() {
            @Override
            public int compare(Rendeles o1, Rendeles o2) {
                int nev = o1.getMegrendeloNeve().compareTo(o2.getMegrendeloNeve());
                if (nev != 0) {
                    return nev;
                }
                return Double.compare(o2.getOsszeg(), o1.getOsszeg()); // Itt javítás: o2.getOsszeg() helyett o1.getOsszeg()
            }
        });

        for ( Rendeles rend : rendelesek) {
            System.out.println(rend);
        }

    }
}
