package Elso_Zh_Elso_Feladatanak_Megoldasa_Parancssori_Argumentumos_Feladat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        Integer darab = Integer.parseInt(args[0]);
        ArrayList<Cipo> cipokListaja = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        for ( int i = 0; i < darab; i++ ) {
            String sor = sc.nextLine();
            String[] adatok = sor.split(";");
            cipokListaja.add(new Cipo(adatok[0], Double.parseDouble(adatok[1]), adatok[2], adatok[3]));
        }
        sc.close();

        //TreeSzettezés
        TreeSet<Cipo> cipoSzett = new TreeSet<Cipo>(
                Comparator.comparing(Cipo::getEvszak).thenComparing(Cipo::getModellszam)
                        .thenComparing(Comparator.comparingDouble(Cipo::getMeret).reversed())
        );

        cipoSzett.addAll(cipokListaja);

        for ( Cipo cipo : cipokListaja) {
            System.out.println(cipo);
        }


    }
}
