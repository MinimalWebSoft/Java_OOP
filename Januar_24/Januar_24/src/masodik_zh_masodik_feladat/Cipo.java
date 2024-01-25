package masodik_zh_masodik_feladat;

import java.time.LocalDate;
import java.util.Objects;

public class Cipo {
    private String modellszam;
    private int meret;
    private String szin;
    private String Evszak ;
    private LocalDate gyartasDatuma;

    public Cipo(String modellszam, int meret, String szin, String evszak, LocalDate gyartasDatuma) {
        this.modellszam = modellszam;
        this.meret = meret;
        this.szin = szin;
        Evszak = evszak;
        this.gyartasDatuma = gyartasDatuma;
    }

    public String getModellszam() {
        return modellszam;
    }

    public void setModellszam(String modellszam) {
        this.modellszam = modellszam;
    }

    public int getMeret() {
        return meret;
    }

    public void setMeret(int meret) {
        this.meret = meret;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public String getEvszak() {
        return Evszak;
    }

    public void setEvszak(String evszak) {
        Evszak = evszak;
    }

    public LocalDate getGyartasDatuma() {
        return gyartasDatuma;
    }

    public void setGyartasDatuma(LocalDate gyartasDatuma) {
        this.gyartasDatuma = gyartasDatuma;
    }

    @Override
    public String toString() {
        return "Cipo{" +
                "modellszam='" + modellszam + '\'' +
                ", meret=" + meret +
                ", szin='" + szin + '\'' +
                ", Evszak='" + Evszak + '\'' +
                ", gyartasDatuma=" + gyartasDatuma +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cipo cipo = (Cipo) o;
        return meret == cipo.meret && Objects.equals(modellszam, cipo.modellszam) && Objects.equals(szin, cipo.szin) && Objects.equals(Evszak, cipo.Evszak) && Objects.equals(gyartasDatuma, cipo.gyartasDatuma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modellszam, meret, szin, Evszak, gyartasDatuma);
    }
}
