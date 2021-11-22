package com.doloroo.doloroo_backend.medication;

public class Dose {
    private float dose;
    private Unit unit;

    public Dose(float dose, Unit unit) {
        this.dose = dose;
        this.unit = unit;
    }

    public float getDose() {
        return dose;
    }

    public void setDose(float dose) {
        this.dose = dose;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
