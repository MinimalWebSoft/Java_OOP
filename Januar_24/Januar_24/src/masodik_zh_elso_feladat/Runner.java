package masodik_zh_elso_feladat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Etel> etelek = new ArrayList<>();
        etelek.add(new Etel("almap","13",12, LocalDate.now(), "Kinai"));
        etelek.add(new Etel("almak","11",12, LocalDate.now(), "Olasz"));
        etelek.add(new Etel("alma","10",10, LocalDate.now(), "Kinai"));
        etelek.add(new Etel("almap","13",12, LocalDate.now(), "Olasz"));
        etelek.add(new Etel("alma","10",10, LocalDate.now(), "Kinai"));

        for ( Etel etel : etelek){
            System.out.println(etel);
        }

        Collections.sort(etelek, new Comparator<Etel>() {
            @Override
            public int compare(Etel o1, Etel o2) {
                int eteltipus = o1.getEtelTipus().compareTo(o2.getEtelTipus());
                if ( eteltipus != 0) {
                    return eteltipus;
                }
                //csökkenő , növekvő akkor lenne, ha o2.compareto o1
                return o1.getLejarasDatuma().compareTo(o2.getLejarasDatuma());
            }
        });

        System.out.println();
        System.out.println();

        for ( Etel etel : etelek) {
            System.out.println(etel);
        }

    }
}
