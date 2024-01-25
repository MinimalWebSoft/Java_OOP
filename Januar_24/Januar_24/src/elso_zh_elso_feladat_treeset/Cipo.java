package elso_zh_elso_feladat_treeset;

import java.util.Objects;

public class Cipo {

    private String modellszam;
    private double meret;
    private String szin;
    private String evszek;

    public Cipo(String modellszam, double meret, String szin, String evszek) {
        this.modellszam = modellszam;
        this.meret = meret;
        this.szin = szin;
        this.evszek = evszek;
    }

    public String getModellszam() {
        return modellszam;
    }

    public void setModellszam(String modellszam) {
        this.modellszam = modellszam;
    }

    public double getMeret() {
        return meret;
    }

    public void setMeret(double meret) {
        this.meret = meret;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public String getEvszek() {
        return evszek;
    }

    public void setEvszek(String evszek) {
        this.evszek = evszek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cipo cipo = (Cipo) o;
        return Double.compare(meret, cipo.meret) == 0 && Objects.equals(modellszam, cipo.modellszam) && Objects.equals(szin, cipo.szin) && Objects.equals(evszek, cipo.evszek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modellszam, meret, szin, evszek);
    }

    @Override
    public String toString() {
        return "Cipo{" +
                "modellszam='" + modellszam + '\'' +
                ", meret=" + meret +
                ", szin='" + szin + '\'' +
                ", evszek='" + evszek + '\'' +
                '}';
    }
}
