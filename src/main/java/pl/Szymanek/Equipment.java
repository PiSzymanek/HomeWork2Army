package pl.Szymanek;

import java.util.List;

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
}
