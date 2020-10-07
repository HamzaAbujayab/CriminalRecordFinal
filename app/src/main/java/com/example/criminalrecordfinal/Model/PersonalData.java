package com.example.criminalrecordfinal.Model;

public class PersonalData implements java.io.Serializable{

   private String personal_data_image ;
   private String personal_data_name_of_user;
   private String personal_data_ID_number;
   private String personal_data_place;
    private String personal_data_date_of_birth;
    private String personal_data_social_status;
    private String personal_data_religion;
    private String imagpersonal_data_gendere;
    private String personal_data_mothers_name;
    private String personal_data_number_home;
    private String personal_data_street;
    private String personal_data_box_number;

    public PersonalData() {
    }

    public PersonalData(String personal_data_image, String personal_data_name_of_user, String personal_data_ID_number, String personal_data_place, String personal_data_date_of_birth, String personal_data_social_status, String personal_data_religion, String imagpersonal_data_gendere, String personal_data_mothers_name, String personal_data_number_home, String personal_data_street, String personal_data_box_number) {
        this.personal_data_image = personal_data_image;
        this.personal_data_name_of_user = personal_data_name_of_user;
        this.personal_data_ID_number = personal_data_ID_number;
        this.personal_data_place = personal_data_place;
        this.personal_data_date_of_birth = personal_data_date_of_birth;
        this.personal_data_social_status = personal_data_social_status;
        this.personal_data_religion = personal_data_religion;
        this.imagpersonal_data_gendere = imagpersonal_data_gendere;
        this.personal_data_mothers_name = personal_data_mothers_name;
        this.personal_data_number_home = personal_data_number_home;
        this.personal_data_street = personal_data_street;
        this.personal_data_box_number = personal_data_box_number;
    }

    public String getPersonal_data_image() {
        return personal_data_image;
    }

    public void setPersonal_data_image(String personal_data_image) {
        this.personal_data_image = personal_data_image;
    }

    public String getPersonal_data_name_of_user() {
        return personal_data_name_of_user;
    }

    public void setPersonal_data_name_of_user(String personal_data_name_of_user) {
        this.personal_data_name_of_user = personal_data_name_of_user;
    }

    public String getPersonal_data_ID_number() {
        return personal_data_ID_number;
    }

    public void setPersonal_data_ID_number(String personal_data_ID_number) {
        this.personal_data_ID_number = personal_data_ID_number;
    }

    public String getPersonal_data_place() {
        return personal_data_place;
    }

    public void setPersonal_data_place(String personal_data_place) {
        this.personal_data_place = personal_data_place;
    }

    public String getPersonal_data_date_of_birth() {
        return personal_data_date_of_birth;
    }

    public void setPersonal_data_date_of_birth(String personal_data_date_of_birth) {
        this.personal_data_date_of_birth = personal_data_date_of_birth;
    }

    public String getPersonal_data_social_status() {
        return personal_data_social_status;
    }

    public void setPersonal_data_social_status(String personal_data_social_status) {
        this.personal_data_social_status = personal_data_social_status;
    }

    public String getPersonal_data_religion() {
        return personal_data_religion;
    }

    public void setPersonal_data_religion(String personal_data_religion) {
        this.personal_data_religion = personal_data_religion;
    }

    public String getImagpersonal_data_gendere() {
        return imagpersonal_data_gendere;
    }

    public void setImagpersonal_data_gendere(String imagpersonal_data_gendere) {
        this.imagpersonal_data_gendere = imagpersonal_data_gendere;
    }

    public String getPersonal_data_mothers_name() {
        return personal_data_mothers_name;
    }

    public void setPersonal_data_mothers_name(String personal_data_mothers_name) {
        this.personal_data_mothers_name = personal_data_mothers_name;
    }

    public String getPersonal_data_number_home() {
        return personal_data_number_home;
    }

    public void setPersonal_data_number_home(String personal_data_number_home) {
        this.personal_data_number_home = personal_data_number_home;
    }

    public String getPersonal_data_street() {
        return personal_data_street;
    }

    public void setPersonal_data_street(String personal_data_street) {
        this.personal_data_street = personal_data_street;
    }

    public String getPersonal_data_box_number() {
        return personal_data_box_number;
    }

    public void setPersonal_data_box_number(String personal_data_box_number) {
        this.personal_data_box_number = personal_data_box_number;
    }
}
