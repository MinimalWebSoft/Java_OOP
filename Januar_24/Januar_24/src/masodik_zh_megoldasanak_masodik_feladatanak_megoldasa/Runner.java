package masodik_zh_megoldasanak_masodik_feladatanak_megoldasa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Telepules> telepulesek = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("telepules.txt"));
        sc.nextLine();//csak, hogy tovább menjen

        while (sc.hasNext()) {
            String[] adatok = sc.nextLine().split(":");
            telepulesek.add(new Telepules(adatok[0], Integer.parseInt(adatok[1]),
                    Integer.parseInt(adatok[2]), LocalDate.parse(adatok[3], DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    adatok[4]));
        }

        for ( Telepules telp : telepulesek) {
            System.out.println(telp);
        }

        System.out.println();

        //elso stream
        telepulesek.stream()
                .filter(telepules -> telepules.getLakkossak()<12000 && telepules.getNev().contains("Kis"))
                .forEach(System.out::println);

        System.out.println();

        //masodik stream
        Telepules legnagyobb = Collections.max(telepulesek, Comparator.comparing(telepules -> telepules.getLakkossak()));
        System.out.println(legnagyobb.getNev());

        // Települések csoportosítása megyénként
        Map<String, List<Telepules>> csoportositottTelepulesek = telepulesek.stream()
                .collect(Collectors.groupingBy(Telepules::getMegye));

        // Kiíratás
        for (Map.Entry<String, List<Telepules>> entry : csoportositottTelepulesek.entrySet()) {
            System.out.println("Megye: " + entry.getKey());
            for (Telepules telepules : entry.getValue()) {
                System.out.println("  " + telepules);
            }
        }
    }
}
