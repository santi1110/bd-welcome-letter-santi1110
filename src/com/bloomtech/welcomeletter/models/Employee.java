package com.bloomtech.welcomeletter.models;

import java.time.LocalDate;

public class Employee {
    private static int maxId = 1;
    private int id;
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String email;
    private int salary;
    private LocalDate startdate;
    private Role role;
    private Company company;




    public static Employeebuilder builder(){
        return new Employeebuilder();
    }
    private Employee(Employeebuilder builder){
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.phonenumber = builder.phonenumber;
        this.email = builder.email;
        this.salary = builder.salary;
        this.startdate = builder.startdate;
        this.role = builder.role;
        this.company = builder.company;

    }

    //TODO: Implement Builder Pattern

    //TODO: Replace with Builder Constructor

/*    public Employee(String firstname, String lastname, String phonenumber, String email, int salary, LocalDate startdate, Role role, Company company) {
        //Auto-generate an id
        id = maxId;
        maxId++;

        //TODO: Initialize fields:
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.salary = salary;
        this.startdate = startdate;
        this.role = role;
        this.company = company;
    }*/

    //TODO: Create Builder Class
public static class Employeebuilder{
        private  int id;
        private static int maxId = 1;
        private String firstname;
        private String lastname;
        private String phonenumber;
        private String email;
        private int salary;
        private LocalDate startdate;
        private Role role;
        private Company company;

        public Employeebuilder() {
            id = maxId;
            maxId++;
        }

        public Employeebuilder withId(int idToUse){
            this.id = idToUse;
            return this;
        }
        public Employeebuilder withFirstname(String firstnameToUse){
            this.firstname = firstnameToUse;
            return this;
        }
        public Employeebuilder withLastname(String lastnameToUse){
            this.lastname = lastnameToUse;
            return this;
        }
        public Employeebuilder withPhonenumber(String phonenumberToUse){
            this.phonenumber = phonenumberToUse;
            return this;
        }
        public Employeebuilder withEmail(String emailToUse){
            this.email = emailToUse;
            return this;
        }
        public Employeebuilder withSalary(int salaryToUse){
            this.salary = salaryToUse;
            return this;
        }
        public Employeebuilder withStartdate(LocalDate startdateToUse){
            this.startdate = startdateToUse;
            return this;
        }
        public Employeebuilder withRole(Role roleToUse){
            this.role = roleToUse;
            return this;
        }
        public Employeebuilder withCompany(Company companyToUse){
            this.company = companyToUse;
            return this;
        }

    public Employee build(){
        if (firstname == null){
            throw new RuntimeException("Firstname cannot be null");}
        if (company == null){
            throw new RuntimeException("Company cannot be null");}
        return new Employee(this);
    }}

    //Getters
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public Role getRole() {
        return role;
    }

    public Company getCompany() {
        return company;
    }

    public int getId() {
        return id;
    }
}
