package masodik_zh_elso_feladat;

import java.time.LocalDate;
import java.util.Objects;

public class Etel {
    private String nev;
    private String vonalkod;
    private double ar;
    private LocalDate lejarasDatuma;
    private String etelTipus;

    public Etel(String nev, String vonalkod, double ar, LocalDate lejarasDatuma, String etelTipus) {
        this.nev = nev;
        this.vonalkod = vonalkod;
        this.ar = ar;
        this.lejarasDatuma = lejarasDatuma;
        this.etelTipus = etelTipus;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getVonalkod() {
        return vonalkod;
    }

    public void setVonalkod(String vonalkod) {
        this.vonalkod = vonalkod;
    }

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public LocalDate getLejarasDatuma() {
        return lejarasDatuma;
    }

    public void setLejarasDatuma(LocalDate lejarasDatuma) {
        this.lejarasDatuma = lejarasDatuma;
    }

    public String getEtelTipus() {
        return etelTipus;
    }

    public void setEtelTipus(String etelTipus) {
        this.etelTipus = etelTipus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etel etel = (Etel) o;
        return this.vonalkod == ((Etel) o).vonalkod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev, vonalkod, ar, lejarasDatuma, etelTipus);
    }

    @Override
    public String toString() {
        return "Etel{" +
                "nev='" + nev + '\'' +
                ", vonalkod='" + vonalkod + '\'' +
                ", ar=" + ar +
                ", lejarasDatuma=" + lejarasDatuma +
                ", etelTipus='" + etelTipus + '\'' +
                '}';
    }
}
