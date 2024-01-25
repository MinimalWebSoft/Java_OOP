package Masodik_Zh_Masodik_Feladatanak_Megoldasa_Mappelessel;

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

        while ( sc.hasNext()) {
            String[] adatok = sc.nextLine().split("/");
            cipok.add(new Cipo(adatok[0], Integer.parseInt(adatok[1]), adatok[2], adatok[3], LocalDate.parse(adatok[4], DateTimeFormatter.ofPattern("yyyy.MM.dd"))));
        }
        for ( Cipo cipo : cipok ) {
            System.out.println(cipok);
        }

        System.out.println();

        cipok.stream().filter(cipo -> cipo.getSzin().contains("fekete") && cipo.getMeret()<30).forEach(System.out::println);
        Cipo legkisebb = Collections.min(cipok, Comparator.comparing(cipo -> cipo.getMeret()));
        System.out.println("A bizonyos cipó legkisebb modellszáma ." + legkisebb.getModellszam());

        Map<String, List<Cipo>> evszakCsop = cipok.stream()
                .collect(Collectors.groupingBy(Cipo::getEvszak));

        System.out.println("Csoportosítás évszak szerint");

        evszakCsop.forEach((evszak, evszakCsoportooko) -> {
            System.out.println(evszak + evszakCsoportooko);
        });


    }
}
