package pl.Szymanek;

import java.util.List;
import java.util.Objects;

public class Equipment {
    private Gun gun;
    private List<Outfit> outfit;
    private List<AdditionalEquipment> additionalEquipments;


    public Equipment() {
    }

    public Equipment(Gun gun, List<Outfit> outfit, List<AdditionalEquipment> additionalEquipments) {
        this.gun = gun;
        this.outfit = outfit;
        this.additionalEquipments = additionalEquipments;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public List<Outfit> getOutfit() {
        return outfit;
    }

    public void setOutfit(List<Outfit> outfit) {
        this.outfit = outfit;
    }

    public List<AdditionalEquipment> getAdditionalEquipments() {
        return additionalEquipments;
    }

    public void setAdditionalEquipments(List<AdditionalEquipment> additionalEquipments) {
        this.additionalEquipments = additionalEquipments;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "gun=" + gun +
                ", outfit=" + outfit +
                ", additionalEquipments=" + additionalEquipments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipment equipment = (Equipment) o;

        if (!Objects.equals(gun, equipment.gun)) return false;
        if (!Objects.equals(outfit, equipment.outfit)) return false;
        return Objects.equals(additionalEquipments, equipment.additionalEquipments);
    }

    @Override
    public int hashCode() {
        int result = gun != null ? gun.hashCode() : 0;
        result = 31 * result + (outfit != null ? outfit.hashCode() : 0);
        result = 31 * result + (additionalEquipments != null ? additionalEquipments.hashCode() : 0);
        return result;
    }
}
