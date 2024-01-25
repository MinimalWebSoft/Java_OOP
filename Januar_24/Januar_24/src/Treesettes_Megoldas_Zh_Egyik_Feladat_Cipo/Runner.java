package Treesettes_Megoldas_Zh_Egyik_Feladat_Cipo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        Integer darab = Integer.parseInt(args[0]);
        ArrayList<Cipo> cipok = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        for ( int i = 0 ; i < darab; i ++) {
            String sor = sc.nextLine();
            String[] adatok = sor.split(";");
            cipok.add(new Cipo(adatok[0], Double.parseDouble(adatok[1]), adatok[2], adatok[3]));
        }

        sc.close();

        for ( Cipo cipo : cipok) {
            System.out.println(cipo);
        }

        System.out.println();

        //TreeSzettezés
        TreeSet<Cipo> cipoSzet = new TreeSet<Cipo>(Comparator
                .comparing(Cipo::getEvszak)
                .thenComparing(Cipo::getModellszam)
                .thenComparing(Comparator.comparingDouble(Cipo::getMeret).reversed()));
        cipoSzet.addAll(cipok);

        for ( Cipo cipo : cipok ){
            System.out.println(cipo);
        }

    }
}
