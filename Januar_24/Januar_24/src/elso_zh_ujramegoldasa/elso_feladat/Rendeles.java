package elso_zh_ujramegoldasa.elso_feladat;

import java.time.LocalDate;
import java.util.Objects;

public class Rendeles {

    private String rendelesSzama;
    private double osszeg;
    private LocalDate rendelesDatuma;
    private String megrendelesNeve;
    private String megrendelesCime;

    public Rendeles(String rendelesSzama, double osszeg, LocalDate rendelesDatuma, String megrendelesNeve, String megrendelesCime) {
        this.rendelesSzama = rendelesSzama;
        this.osszeg = osszeg;
        this.rendelesDatuma = rendelesDatuma;
        this.megrendelesNeve = megrendelesNeve;
        this.megrendelesCime = megrendelesCime;
    }

    public String getRendelesSzama() {
        return rendelesSzama;
    }

    public void setRendelesSzama(String rendelesSzama) {
        this.rendelesSzama = rendelesSzama;
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

    public String getMegrendelesNeve() {
        return megrendelesNeve;
    }

    public void setMegrendelesNeve(String megrendelesNeve) {
        this.megrendelesNeve = megrendelesNeve;
    }

    public String getMegrendelesCime() {
        return megrendelesCime;
    }

    public void setMegrendelesCime(String megrendelesCime) {
        this.megrendelesCime = megrendelesCime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rendeles rendeles = (Rendeles) o;
        return this.rendelesSzama == ((Rendeles) o).rendelesSzama;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rendelesSzama, osszeg, rendelesDatuma, megrendelesNeve, megrendelesCime);
    }

    @Override
    public String toString() {
        return "Rendeles{" +
                "rendelesSzama='" + rendelesSzama + '\'' +
                ", osszeg=" + osszeg +
                ", rendelesDatuma=" + rendelesDatuma +
                ", megrendelesNeve='" + megrendelesNeve + '\'' +
                ", megrendelesCime='" + megrendelesCime + '\'' +
                '}';
    }
}
