package com.example.criminalrecordfinal.Model;

public class CriminalRecord {

    private String criminal_record_centre;
    private String criminal_record_date;
    private String criminal_record_type_of_case;
    private String criminal_record_inference_number;

    public CriminalRecord() {
    }

    public CriminalRecord(String criminal_record_centre, String criminal_record_date, String criminal_record_type_of_case, String criminal_record_inference_number) {
        this.criminal_record_centre = criminal_record_centre;
        this.criminal_record_date = criminal_record_date;
        this.criminal_record_type_of_case = criminal_record_type_of_case;
        this.criminal_record_inference_number = criminal_record_inference_number;
    }

    public String getCriminal_record_centre() {
        return criminal_record_centre;
    }

    public void setCriminal_record_centre(String criminal_record_centre) {
        this.criminal_record_centre = criminal_record_centre;
    }

    public String getCriminal_record_date() {
        return criminal_record_date;
    }

    public void setCriminal_record_date(String criminal_record_date) {
        this.criminal_record_date = criminal_record_date;
    }

    public String getCriminal_record_type_of_case() {
        return criminal_record_type_of_case;
    }

    public void setCriminal_record_type_of_case(String criminal_record_type_of_case) {
        this.criminal_record_type_of_case = criminal_record_type_of_case;
    }

    public String getCriminal_record_inference_number() {
        return criminal_record_inference_number;
    }

    public void setCriminal_record_inference_number(String criminal_record_inference_number) {
        this.criminal_record_inference_number = criminal_record_inference_number;
    }
}
