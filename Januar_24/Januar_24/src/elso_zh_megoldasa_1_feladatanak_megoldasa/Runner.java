package elso_zh_megoldasa_1_feladatanak_megoldasa;

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
        ArrayList<Auto> autok = new ArrayList<>();
        autok.add(new Auto("ABC_111", "AudiTT", "Audi", LocalDate.now(), 123));
        autok.add(new Auto("ABC_111", "AudiTT", "Audi", LocalDate.now(), 123));
        autok.add(new Auto("ABC_111", "AudiTT", "Audi", LocalDate.now(), 123));
        autok.add(new Auto("ABC_111", "AudiTT", "Audi", LocalDate.now(), 123));
        autok.add(new Auto("ABC_111", "AudiTT", "Audi", LocalDate.now(), 123));

        for ( Auto auto : autok) {
            System.out.println(auto);
        }

        Collections.sort(autok, new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                int marka = o1.getMarka().compareTo(o2.getMarka());
                if ( marka != 0) {
                    return marka;
                }
                return o1.getTipus().compareTo(o2.getTipus());
            }
        });

        System.out.println();

        for ( Auto auto : autok) {
            System.out.println(auto);
        }

        //FilbaKiiras
        Path outhputPath = Path.of("AutoVege.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(outhputPath, StandardOpenOption.CREATE)) {
            for ( Auto auto: autok) {
                writer.write(auto.toString());
                writer.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

}
