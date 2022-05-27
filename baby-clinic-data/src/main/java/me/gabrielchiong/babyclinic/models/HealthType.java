package me.gabrielchiong.babyclinic.models;

public class HealthType extends BaseEntity {
    private String classification;

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
