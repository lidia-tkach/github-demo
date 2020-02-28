package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class seasons {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the month name");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        if (month.equals("December") || month.equals("January") || month.equals("February")) {
            System.out.println("WINTER");
        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
            System.out.println("SPRING");
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            System.out.println("SUMMER");
        } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            System.out.println("AUTUMN");
        } else {
            System.out.println("There is no such month");
        }

    }
}