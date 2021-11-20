package com.doloroo.doloroo_backend.diary;

import java.time.LocalDateTime;

public class Entry {
    private int painLevel;
    private String location;
    private String quality;
    private LocalDateTime timestamp;

    public Entry(int painLevel, String location, String quality, LocalDateTime timestamp) {
        if (painLevel >= 0 && painLevel <= 10) {
            this.painLevel = painLevel;
        }else{
            throw new IllegalArgumentException("Pain Level has to been between 0 and 10");
        }

        this.location = location;
        this.quality = quality;
        this.timestamp = timestamp;
    }

    public int getPainLevel() {
        return painLevel;
    }

    public void setPainLevel(int painLevel) {
        this.painLevel = painLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
