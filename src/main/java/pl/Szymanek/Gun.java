package pl.Szymanek;

import java.math.BigDecimal;

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
}
