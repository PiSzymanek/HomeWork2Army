package pl.Szymanek;

import java.math.BigDecimal;

public class Outfit {
    private String name;
    private String type; // it's field piece of outfit or gala or etc
    private BigDecimal price;

    public Outfit() {
    }

    public Outfit(String name, String type, BigDecimal price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
