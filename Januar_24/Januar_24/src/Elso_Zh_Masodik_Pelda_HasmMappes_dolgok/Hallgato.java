package Elso_Zh_Masodik_Pelda_HasmMappes_dolgok;

import java.util.Objects;

public class Hallgato {
    private String neptunKod;
    private String nev;
    private Szak szak;

    public Hallgato(String neptunKod, String nev, Szak szak) {
        this.neptunKod = neptunKod;
        this.nev = nev;
        this.szak = szak;
    }

    public String getNeptunKod() {
        return neptunKod;
    }

    public void setNeptunKod(String neptunKod) {
        this.neptunKod = neptunKod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public Szak getSzak() {
        return szak;
    }

    public void setSzak(Szak szak) {
        this.szak = szak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hallgato hallgato = (Hallgato) o;
        return Objects.equals(neptunKod, hallgato.neptunKod) && Objects.equals(nev, hallgato.nev) && Objects.equals(szak, hallgato.szak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(neptunKod, nev, szak);
    }

    @Override
    public String toString() {
        return "Hallgato{" +
                "neptunKod='" + neptunKod + '\'' +
                ", nev='" + nev + '\'' +
                ", szak=" + szak +
                '}';
    }
}
