package com.example.criminalrecordfinal.Model;

public class FamilyRelation {

    String family_image;
    String family_name_of_user;
    String family_ID_number;
    String family_date_of_birth;
    String family_type_of_relation;

    public FamilyRelation() {
    }

    public FamilyRelation(String family_image, String family_name_of_user, String family_ID_number, String family_date_of_birth, String family_type_of_relation) {
        this.family_image = family_image;
        this.family_name_of_user = family_name_of_user;
        this.family_ID_number = family_ID_number;
        this.family_date_of_birth = family_date_of_birth;
        this.family_type_of_relation = family_type_of_relation;
    }

    public String getFamily_image() {
        return family_image;
    }

    public void setFamily_image(String family_image) {
        this.family_image = family_image;
    }

    public String getFamily_name_of_user() {
        return family_name_of_user;
    }

    public void setFamily_name_of_user(String family_name_of_user) {
        this.family_name_of_user = family_name_of_user;
    }

    public String getFamily_ID_number() {
        return family_ID_number;
    }

    public void setFamily_ID_number(String family_ID_number) {
        this.family_ID_number = family_ID_number;
    }

    public String getFamily_date_of_birth() {
        return family_date_of_birth;
    }

    public void setFamily_date_of_birth(String family_date_of_birth) {
        this.family_date_of_birth = family_date_of_birth;
    }

    public String getFamily_type_of_relation() {
        return family_type_of_relation;
    }

    public void setFamily_type_of_relation(String family_type_of_relation) {
        this.family_type_of_relation = family_type_of_relation;
    }
}
