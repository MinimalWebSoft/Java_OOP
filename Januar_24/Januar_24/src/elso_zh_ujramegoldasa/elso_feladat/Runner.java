package elso_zh_ujramegoldasa.elso_feladat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Rendeles> rendelesek = new ArrayList<>();
        rendelesek.add(new Rendeles("123", 123, LocalDate.now(), "Elso_Megrendeles", "Elso_Utca_2"));
        rendelesek.add(new Rendeles("123", 123, LocalDate.now(), "Elso_Megrendeles", "Elso_Utca_2"));
        rendelesek.add(new Rendeles("1233", 1233, LocalDate.now(), "Masodik_Megrendeles", "Elso_Utca_3"));
        rendelesek.add(new Rendeles("123", 123, LocalDate.now(), "Elso_Megrendeles", "Elso_Utca_2"));
        rendelesek.add(new Rendeles("1233", 1233, LocalDate.now(), "Masodik_Megrendeles", "Elso_Utca_3"));

        for ( Rendeles rend : rendelesek) {
            System.out.println(rend);
        }
        System.out.println();

        Collections.sort(rendelesek, new Comparator<Rendeles>() {
            @Override
            public int compare(Rendeles o1, Rendeles o2) {
                int rendelesszama = o1.getRendelesSzama().compareTo(o2.getRendelesSzama());
                if ( rendelesszama != 0) {
                    return rendelesszama;
                }
                return o1.getRendelesDatuma().compareTo(o2.getRendelesDatuma());
            }


        });

        System.out.println();

        for ( Rendeles rend : rendelesek) {
            System.out.println(rend);
        }

        // Fájlba írás
        Path outputPath = Path.of("rendelesek_output.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(outputPath, StandardOpenOption.CREATE)) {
            for (Rendeles rend : rendelesek) {
                writer.write(rend.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
