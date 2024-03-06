package com.bloomtech.welcomeletter.services;

import com.bloomtech.welcomeletter.fileIO.FileManager;
import com.bloomtech.welcomeletter.models.Employee;

import java.io.IOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;




public class FormLetterService {

    private static final FileManager fileManager = new FileManager();

    public void generateWelcomeLetter(Employee employee) throws IOException {
      String letterTemplate =  fileManager.getTextFromFile("LetterTemplate");
        String template = letterTemplate
                .replace("[company name]", employee.getCompany().getCompanyname())
                .replace("[fullname]", employee.getFirstname() + " " + employee.getLastname())
                .replace("[startdate]", employee.getStartdate().toString())
                .replace("$[startingsalary]","$"+ employee.getSalary())
                .replace("[company starttime]", employee.getCompany().getCompanyname())+"\n";

        fileManager.writeTextToFile("Welcome" + employee.getFirstname() + employee.getLastname(),template);




    }}

        //TODO: Get template text from resources

        //TODO: Replace []ed text with correct info

        //TODO: Write finalized String to file


