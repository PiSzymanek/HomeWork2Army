package pl.Szymanek.Classes;

import java.math.BigDecimal;
import java.util.Objects;

public class Gun {
    private String gunName;
    private double calibre;
    private BigDecimal price;

    public Gun() {
    }

    public Gun(String gunName, double calibre, BigDecimal price) {
        this.gunName = gunName;
        this.calibre = calibre;
        this.price = price;
    }

    public String getGunName() {
        return gunName;
    }

    public void setGunName(String gunName) {
        this.gunName = gunName;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "gunName='" + gunName + '\'' +
                ", calibre=" + calibre +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gun gun = (Gun) o;
        return Double.compare(gun.calibre, calibre) == 0 && Objects.equals(gunName, gun.gunName) && Objects.equals(price, gun.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gunName, calibre, price);
    }
}
