package masodik_zhlap_masodik_cipos_feladatanak_a_megoldsasa;

import masodik_zh_megoldasanak_masodik_feladatanak_megoldasa.Telepules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Cipo> cipok = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("cipo.txt"));
        sc.nextLine();


        while (sc.hasNext()) {
            String[] adatok = sc.nextLine().split("/");
            cipok.add(new Cipo(adatok[0], Integer.parseInt(adatok[1]),
                    adatok[2], adatok[3],
                    LocalDate.parse(adatok[4], DateTimeFormatter.ofPattern("yyyy.MM.dd"))));
        }

        for ( Cipo cipo : cipok) {
            System.out.println(cipo);
        }
        System.out.println();

        cipok.stream()
                .filter(cipo -> cipo.getSzin().contains("fekete") && cipo.getMeret() < 30)
                .forEach(System.out::println);

        System.out.println();

        Cipo legkisebb = Collections.min(cipok, Comparator.comparing(cipo -> cipo.getModellszam()));
        System.out.println(legkisebb);

        //Csoportosítás évszakonként
        Map<String, List<Cipo>> csoportosoitottCipok = cipok.stream()
                .collect(Collectors.groupingBy(Cipo::getEvszak));

        //Kiiratás
        for (
                Map.Entry<String, List<Cipo>> entry : csoportosoitottCipok.entrySet()
        ) {
            System.out.println("Cipo" + entry.getKey());
            for (Cipo cipo : entry.getValue()) {
                System.out.println(" " + cipo);
            }
        }

    }
}