package com.bloomtech.welcomeletter.fileIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.*;

public class FileManager {
    public FileManager() {
    }

    public String getTextFromFile(String filename) throws IOException {
    /*    String returnString = "";

        return returnString;
    }
*/
        Path filePath = Paths.get("src/resources/"+ filename + ".txt");

        try {

            byte[] fileBytes = Files.readAllBytes(filePath);

            String returnString = new String(fileBytes, StandardCharsets.UTF_8);

            System.out.println("File contents:\n" + returnString);

            return returnString;
        } catch (IOException e) {

            throw new FileNotFoundException("File not found: " + filename);
        }
    }
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        try {
            String filename = "NEWFILE";
            String contents = fileManager.getTextFromFile(filename);
            System.out.println("File contents:\n" + contents);


        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }


    public void writeTextToFile(String outFileName, String text) {
        try {
            Path outputPath = Paths.get("src/resources/out/"+ outFileName + ".txt");

            Files.write(outputPath, text.getBytes());
            System.out.println("Welcome letter saved to: " + outputPath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }


    }
}