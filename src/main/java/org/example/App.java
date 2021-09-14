package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static boolean checkInput (String input) {

        if (input == null) {
            System.out.println("Invalid input.");
            System.exit(0);
        }
        try {
            double d = Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input.");
            System.exit(0);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("Please enter your height in inches: ");
        String height = se.nextLine();
        checkInput(height);
        float h = Float.parseFloat(height);

        System.out.print("Please enter your weight in pounds: ");
        String weight = se.nextLine();
        checkInput(weight);
        float w = Float.parseFloat(weight);

        float bmi = (w / (h * h)) * 703;

        System.out.println("Your BMI is " + bmi);

        if (bmi >= 18.5 && bmi <= 25){
            System.out.println("You are within the ideal weight.");
        }
        else if (bmi < 18.5){
            System.out.println("You are underweight. You should see your doctor.");
        }
        else{
            System.out.println("You are overweight. You should see your doctor.");
        }

    }
}
