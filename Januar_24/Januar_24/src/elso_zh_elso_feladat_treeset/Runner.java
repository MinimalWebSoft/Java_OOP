package elso_zh_elso_feladat_treeset;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {

        Integer darab = Integer.parseInt(args[0]);

        ArrayList<Cipo> cipok = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for ( int i=0 ; i< darab; i++) {

            String sor = sc.nextLine();
            String[] darabok = sor.split(";");
            double meret = Double.parseDouble(darabok[1]);
            cipok.add(new Cipo(darabok[0], meret, darabok[2], darabok[3]));

        }

        sc.close();

        TreeSet<Cipo> cipoSzet = new TreeSet<Cipo>(Comparator
                .comparing(Cipo::getEvszek)
                .thenComparing(Cipo::getModellszam)
                .thenComparing(Comparator.comparingDouble(Cipo::getMeret).reversed()));

        cipoSzet.addAll(cipok);

        for (Cipo cipo : cipoSzet){
            System.out.println(cipo.toString());
        }

    }

}
