package com.example.criminalrecordfinal.Model;

public class Wanted {

    String wanted_centre;
    String wanted_case;
    String wanted_date;

    public Wanted() {
    }

    public Wanted(String wanted_centre, String wanted_case, String wanted_date) {
        this.wanted_centre = wanted_centre;
        this.wanted_case = wanted_case;
        this.wanted_date = wanted_date;
    }

    public String getWanted_centre() {
        return wanted_centre;
    }

    public void setWanted_centre(String wanted_centre) {
        this.wanted_centre = wanted_centre;
    }

    public String getWanted_case() {
        return wanted_case;
    }

    public void setWanted_case(String wanted_case) {
        this.wanted_case = wanted_case;
    }

    public String getWanted_date() {
        return wanted_date;
    }

    public void setWanted_date(String wanted_date) {
        this.wanted_date = wanted_date;
    }
}
