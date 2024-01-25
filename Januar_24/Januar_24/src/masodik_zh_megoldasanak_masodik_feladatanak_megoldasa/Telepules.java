package masodik_zh_megoldasanak_masodik_feladatanak_megoldasa;

import java.time.LocalDate;
import java.util.Objects;

public class Telepules {
    private String nev;
    private int iranyitoszam;
    private int lakkossak;
    private LocalDate alapitasDatuma;
    private String megye;

    public Telepules(String nev, int iranyitoszam, int lakkossak, LocalDate alapitasDatuma, String megye) {
        this.nev = nev;
        this.iranyitoszam = iranyitoszam;
        this.lakkossak = lakkossak;
        this.alapitasDatuma = alapitasDatuma;
        this.megye = megye;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public void setIranyitoszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
    }

    public int getLakkossak() {
        return lakkossak;
    }

    public void setLakkossak(int lakkossak) {
        this.lakkossak = lakkossak;
    }

    public LocalDate getAlapitasDatuma() {
        return alapitasDatuma;
    }

    public void setAlapitasDatuma(LocalDate alapitasDatuma) {
        this.alapitasDatuma = alapitasDatuma;
    }

    public String getMegye() {
        return megye;
    }

    public void setMegye(String megye) {
        this.megye = megye;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telepules telepules = (Telepules) o;
        return iranyitoszam == telepules.iranyitoszam && lakkossak == telepules.lakkossak && Objects.equals(nev, telepules.nev) && Objects.equals(alapitasDatuma, telepules.alapitasDatuma) && Objects.equals(megye, telepules.megye);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev, iranyitoszam, lakkossak, alapitasDatuma, megye);
    }

    @Override
    public String toString() {
        return "Telepules{" +
                "nev='" + nev + '\'' +
                ", iranyitoszam=" + iranyitoszam +
                ", lakkossak=" + lakkossak +
                ", alapitasDatuma=" + alapitasDatuma +
                ", megye='" + megye + '\'' +
                '}';
    }
}
