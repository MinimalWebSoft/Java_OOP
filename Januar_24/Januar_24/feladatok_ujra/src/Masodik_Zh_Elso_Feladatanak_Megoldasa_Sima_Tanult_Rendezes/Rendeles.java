package Masodik_Zh_Elso_Feladatanak_Megoldasa_Sima_Tanult_Rendezes;

import java.time.LocalDate;
import java.util.Objects;

public class Rendeles {
    private String rendelesSzam;
    private double osszeg;
    private LocalDate rendelesDatuma;
    private String megrendeloNeve;
    private String megrendeloCime;

    public Rendeles(String rendelesSzam, double osszeg, LocalDate rendelesDatuma, String megrendeloNeve, String megrendeloCime) {
        this.rendelesSzam = rendelesSzam;
        this.osszeg = osszeg;
        this.rendelesDatuma = rendelesDatuma;
        this.megrendeloNeve = megrendeloNeve;
        this.megrendeloCime = megrendeloCime;
    }

    public String getRendelesSzam() {
        return rendelesSzam;
    }

    public void setRendelesSzam(String rendelesSzam) {
        this.rendelesSzam = rendelesSzam;
    }

    public double getOsszeg() {
        return osszeg;
    }

    public void setOsszeg(double osszeg) {
        this.osszeg = osszeg;
    }

    public LocalDate getRendelesDatuma() {
        return rendelesDatuma;
    }

    public void setRendelesDatuma(LocalDate rendelesDatuma) {
        this.rendelesDatuma = rendelesDatuma;
    }

    public String getMegrendeloNeve() {
        return megrendeloNeve;
    }

    public void setMegrendeloNeve(String megrendeloNeve) {
        this.megrendeloNeve = megrendeloNeve;
    }

    public String getMegrendeloCime() {
        return megrendeloCime;
    }

    public void setMegrendeloCime(String megrendeloCime) {
        this.megrendeloCime = megrendeloCime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rendeles rendeles = (Rendeles) o;
        return this.rendelesSzam == ((Rendeles) o).rendelesSzam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rendelesSzam, osszeg, rendelesDatuma, megrendeloNeve, megrendeloCime);
    }

    @Override
    public String toString() {
        return "Rendeles{" +
                "rendelesSzam='" + rendelesSzam + '\'' +
                ", osszeg=" + osszeg +
                ", rendelesDatuma=" + rendelesDatuma +
                ", megrendeloNeve='" + megrendeloNeve + '\'' +
                ", megrendeloCime='" + megrendeloCime + '\'' +
                '}';
    }
}
