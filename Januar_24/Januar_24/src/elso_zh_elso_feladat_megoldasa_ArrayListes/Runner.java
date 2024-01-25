package elso_zh_elso_feladat_megoldasa_ArrayListes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Integer darab = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);

        ArrayList<Cipo> cipok = new ArrayList<>();

        for ( int i = 0; i < darab; i++) {
            String sor = sc.nextLine();
            String[] darabok = sor.split(";");
            double meret = Double.parseDouble(darabok[1]);
            cipok.add(new Cipo(darabok[0], meret, darabok[2], darabok[3]));
        }
        sc.close();

        Collections.sort(cipok, new Comparator<Cipo>() {
            @Override
            public int compare(Cipo o1, Cipo o2) {
                int evszak = o1.getEvszak().compareTo(o2.getEvszak());
                if ( evszak != 0 ) {
                    return evszak;
                }
                int modellszam = o1.getModellszam().compareTo(o2.getModellszam());
                if ( modellszam != 0) {
                    return modellszam;
                }
                if (o1.getMeret() < o2.getMeret()) {
                    return 1;
                }
                else if ( o1.getMeret()> o2.getMeret()) {
                    return -1;
                }
                return 0;
            }
        });

        for (Cipo cipo : cipok) {
            System.out.println(cipo.toString());
        }
    }
}
