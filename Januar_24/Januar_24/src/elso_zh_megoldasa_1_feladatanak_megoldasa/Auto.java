package elso_zh_megoldasa_1_feladatanak_megoldasa;

import java.time.LocalDate;
import java.util.Objects;

public class Auto {

    private String rendszam;
    private String tipus;
    private String marka;
    private LocalDate gyartasDatuma;
    private int teljesitmeny;

    public Auto(String rendszam, String tipus, String marka, LocalDate gyartasDatuma, int teljesitmeny) {
        this.rendszam = rendszam;
        this.tipus = tipus;
        this.marka = marka;
        this.gyartasDatuma = gyartasDatuma;
        this.teljesitmeny = teljesitmeny;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public LocalDate getGyartasDatuma() {
        return gyartasDatuma;
    }

    public void setGyartasDatuma(LocalDate gyartasDatuma) {
        this.gyartasDatuma = gyartasDatuma;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public void setTeljesitmeny(int teljesitmeny) {
        this.teljesitmeny = teljesitmeny;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return this.rendszam == ((Auto) o).rendszam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rendszam, tipus, marka, gyartasDatuma, teljesitmeny);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "rendszam='" + rendszam + '\'' +
                ", tipus='" + tipus + '\'' +
                ", marka='" + marka + '\'' +
                ", gyartasDatuma=" + gyartasDatuma +
                ", teljesitmeny=" + teljesitmeny +
                '}';
    }
}
