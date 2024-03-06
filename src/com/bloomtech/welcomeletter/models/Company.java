package com.bloomtech.welcomeletter.models;

public class Company {
    private static int maxId = 1;

    private int id;

    private String companyname;
    private String country;


    public static Builder builder(){
        return new Builder();
    }

    private Company(Builder builder){
        this.id = builder.id;
        this.companyname = builder.companyname;
        this.country = builder.country;
    }

    //TODO: Replace with Builder Constructor
/*    public Company(String companyname, String country) {
        //Auto-generate an id
        id = maxId;
        maxId++;

        //Initialize fields
        this.companyname = companyname;
        this.country = country;
    }*/

    public static final class Builder {
        private static int maxId = 1;
        private int id;

        private String companyname;
        private String country;

        public Builder() {
            id = maxId;
            maxId++;
        }


        //TODO: Implement Builder Pattern
        public Builder withId(int idToUse) {
            this.id = idToUse;
            return this;
        }

        public Builder withCompanyname(String companynameToUse) {
            this.companyname = companynameToUse;
            return this;
        }

        public Builder withCountry(String countryToUse) {
            this.country = countryToUse;
            return this;
        }

        public Company build() {
            return new Company(this);
        }

    }
    public int getId() {

            return id;
    }

    public String getCompanyname() {
            return companyname;

    }

        public String getCountry() {
        return country;
    }
}
