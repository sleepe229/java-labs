package Laba142;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static String path = "files\\example1.txt";

    public static void main(String[] args) {
        int digitSum = 0;

        try (FileReader reader = new FileReader(path)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (Character.isDigit(ch)) {
                    digitSum += Character.getNumericValue(ch);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        } catch (IOException e) {
            System.out.println("Error reading file: " + path);
        }

        System.out.println(digitSum);
    }
}
