package com.example.criminalrecordfinal.Model;

public class Travel {

    String travel_crossing;
    String travel_date;
    String travel_reason_for_visiting;
    String travel_type;

    public Travel() {
    }

    public Travel(String travel_crossing, String travel_date, String travel_reason_for_visiting, String travel_type) {
        this.travel_crossing = travel_crossing;
        this.travel_date = travel_date;
        this.travel_reason_for_visiting = travel_reason_for_visiting;
        this.travel_type = travel_type;
    }

    public String getTravel_crossing() {
        return travel_crossing;
    }

    public void setTravel_crossing(String travel_crossing) {
        this.travel_crossing = travel_crossing;
    }

    public String getTravel_date() {
        return travel_date;
    }

    public void setTravel_date(String travel_date) {
        this.travel_date = travel_date;
    }

    public String getTravel_reason_for_visiting() {
        return travel_reason_for_visiting;
    }

    public void setTravel_reason_for_visiting(String travel_reason_for_visiting) {
        this.travel_reason_for_visiting = travel_reason_for_visiting;
    }

    public String getTravel_type() {
        return travel_type;
    }

    public void setTravel_type(String travel_type) {
        this.travel_type = travel_type;
    }
}
