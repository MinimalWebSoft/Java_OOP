package treemappes_1zh_masodikfeladat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Tantargy> tantargyak = new ArrayList<>();

        Szak matekszak = new Szak("Matek Szak", "Matek1", 6);
        Szak infoszak = new Szak("Info Szak", "Info1", 6);

        tantargyak.add(new Tantargy("Matematikai analízis I.", "MANAL-1", 1, 5, matekszak));
        tantargyak.add(new Tantargy("Matematikai analízis II.", "MANAL-2", 2, 5, matekszak));
        tantargyak.add(new Tantargy("Diszkrét matematika I.", "MDISZK-1", 1, 5, matekszak));
        tantargyak.add(new Tantargy("Diszkrét matematika II.", "MDISZK-2", 2, 5, matekszak));
        tantargyak.add(new Tantargy("Lineáris Algebra B", "MALGB-1", 1, 5, matekszak));
        tantargyak.add(new Tantargy("Numerikus analízis", "MN-1", 1, 5, matekszak));

        tantargyak.add(new Tantargy("Programozás alapjai I.", "IPROG-1", 1, 5, infoszak));
        tantargyak.add(new Tantargy("Programozás alapjai II.", "IPROG-2", 2, 5, infoszak));
        tantargyak.add(new Tantargy("Számítógép hálózatok", "IHALO", 2, 5, infoszak));
        tantargyak.add(new Tantargy("Számítógép architektúrák", "IARCH", 2, 5, infoszak));

        TreeMap<Szak, ArrayList<Tantargy>> tantargyakmap = new TreeMap<>(new Comparator<Szak>() {
            @Override
            public int compare(Szak sz1, Szak sz2) {
                return sz1.getKod().compareTo(sz2.getKod());
            }
        });

        for (Tantargy tantargy : tantargyak) {
            Szak tantargySzak = tantargy.getSzak();

            if (!tantargyakmap.containsKey(tantargySzak)) {
                tantargyakmap.put(tantargySzak, new ArrayList<Tantargy>());
            }

            ArrayList<Tantargy> targyak = tantargyakmap.get(tantargySzak);
            targyak.add(tantargy);
        }

        for (Map.Entry<Szak, ArrayList<Tantargy>> ertek : tantargyakmap.entrySet()) {
            Szak szak = ertek.getKey();

            System.out.println(szak.getNev() + " szakhoz tartozó tantárgyak:");

            for (Tantargy tantargy : ertek.getValue()) {
                System.out.println(tantargy.toString());
            }
        }
    }
}
