package Elso_Zh_Elso_Feladatanak_Megoldasa_Parancssori_Argumentumos_Feladat;

import java.util.Objects;

public class Cipo {
    private String modellszam;
    private double meret;
    private String szin;
    private String evszak;

    public Cipo(String modellszam, double meret, String szin, String evszak) {
        this.modellszam = modellszam;
        this.meret = meret;
        this.szin = szin;
        this.evszak = evszak;
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

    public String getEvszak() {
        return evszak;
    }

    public void setEvszak(String evszak) {
        this.evszak = evszak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cipo cipo = (Cipo) o;
        return Double.compare(meret, cipo.meret) == 0 && Objects.equals(modellszam, cipo.modellszam) && Objects.equals(szin, cipo.szin) && Objects.equals(evszak, cipo.evszak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modellszam, meret, szin, evszak);
    }

    @Override
    public String toString() {
        return "Cipo{" +
                "modellszam='" + modellszam + '\'' +
                ", meret=" + meret +
                ", szin='" + szin + '\'' +
                ", evszak='" + evszak + '\'' +
                '}';
    }
}
