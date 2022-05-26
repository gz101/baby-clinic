package me.gabrielchiong.babyclinic.models;

import java.time.LocalDate;

public class Baby extends Person {
    private HealthType healthType;
    private PrimaryParent primaryParent;
    private LocalDate birthDate;

    public HealthType getHealthType() {
        return healthType;
    }

    public void setHealthType(HealthType healthType) {
        this.healthType = healthType;
    }

    public PrimaryParent getPrimaryParent() {
        return primaryParent;
    }

    public void setPrimaryParent(PrimaryParent primaryParent) {
        this.primaryParent = primaryParent;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
