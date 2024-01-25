package masodik_zh_masodik_feladat;

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
        sc.nextLine(); //csak, hogy ugorjon tovább az elsősoron

        while (sc.hasNext()) {
            String[] adatok = sc.nextLine().split("/");
            cipok.add(new Cipo(adatok[0], Integer.parseInt(adatok[1]),
                    adatok[2], adatok[3], LocalDate.parse(adatok[4], DateTimeFormatter.ofPattern("yyyy.MM.dd"))));
        }

        for (Cipo cipo : cipok) {
            System.out.println(cipo);
        }

        System.out.println();

        cipok.stream().
                filter(cipo -> cipo.getSzin().equals("fekete") && cipo.getMeret() <= 30)
                .forEach(System.out::println);
        System.out.println();

        Cipo legkisebb = Collections.min(cipok, Comparator.comparing(cipo -> cipo.getMeret()));
        System.out.println(legkisebb);

        Map<String, List<Cipo>> evszakCsop = cipok.stream()
                .collect(Collectors.groupingBy(Cipo::getEvszak));

        System.out.println("Csoportosítás évszak szerint");

        evszakCsop.forEach((evszak, evszakCsopik) -> {
            System.out.println(evszak + evszakCsopik);
        });
    }
}
