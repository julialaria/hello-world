package com.ironhack.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class main {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("result.txt", false);
        File file = new File("oscar_age_female.csv");
        Scanner scanner = new Scanner(file);
        String [] header = scanner.nextLine().replaceAll("\"", "").split(", ");


        while (scanner.hasNextLine()) {

            String [] line = scanner.nextLine().replaceAll("\"", "").split( ", ");
            writer.write(header [3]+ ":" + line [3] + "\n");
            writer.write(header [1]+ ":" + line [1] + "\n");
            writer.write(header [2]+ ":" + line [2] + "\n");
            writer.write(header [4]+ ":" + line [4] + "\n" + "======================="+ "\n");

        }
        scanner.close();
        writer.close();
    }
}

