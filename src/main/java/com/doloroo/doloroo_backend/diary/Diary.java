package com.doloroo.doloroo_backend.diary;

import com.doloroo.doloroo_backend.medication.Medication;
import com.doloroo.doloroo_backend.user.User;

import java.util.List;

public class Diary {
    private List<Entry> entries;
    private User patient;
    private List<Medication> meds;

    public Diary(List<Entry> entries, User patient, List<Medication> meds) {
        this.entries = entries;
        this.patient = patient;
        this.meds = meds;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void addEntry(Entry entry){
        entries.add(entry);
    }

    public void clearEntries(){
        entries.clear();
    }

    public User getPatient() {
        return patient;
    }

    public List<Medication> getMeds() {
        return meds;
    }

    public void addMedication(Medication medication){
        meds.add(medication);
    }

    public void clearMedication(){
        meds.clear();
    }
}
