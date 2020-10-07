package com.example.criminalrecordfinal.Model;

public class Detained {

    private String detained_centre;
    private String detained_charge;
    private String detained_beginning_of_arrest;

    public Detained() {
    }

    public Detained(String detained_centre, String detained_charge, String detained_beginning_of_arrest) {
        this.detained_centre = detained_centre;
        this.detained_charge = detained_charge;
        this.detained_beginning_of_arrest = detained_beginning_of_arrest;
    }

    public String getDetained_centre() {
        return detained_centre;
    }

    public void setDetained_centre(String detained_centre) {
        this.detained_centre = detained_centre;
    }

    public String getDetained_charge() {
        return detained_charge;
    }

    public void setDetained_charge(String detained_charge) {
        this.detained_charge = detained_charge;
    }

    public String getDetained_beginning_of_arrest() {
        return detained_beginning_of_arrest;
    }

    public void setDetained_beginning_of_arrest(String detained_beginning_of_arrest) {
        this.detained_beginning_of_arrest = detained_beginning_of_arrest;
    }
}
