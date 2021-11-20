package com.doloroo.doloroo_backend.medication;

import java.time.LocalDate;

public class Medication {
    private String name;
    private Dose dose;
    private String substance;
    private String pzn;
    private LocalDate startDate;

    public Medication(String name, Dose dose, String substance, String pzn, LocalDate startDate) {
        this.name = name;
        this.dose = dose;
        this.substance = substance;
        this.pzn = pzn;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dose getDose() {
        return dose;
    }

    public void setDose(Dose dose) {
        this.dose = dose;
    }

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }

    public String getPzn() {
        return pzn;
    }

    public void setPzn(String pzn) {
        this.pzn = pzn;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
