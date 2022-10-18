package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println("Please enter student name: ");
        Scanner input = new Scanner(System.in);
        double StuName = input.nextDouble();
        System.out.println("You entered: " + StuName);
    }
}
