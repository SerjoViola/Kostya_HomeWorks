package HW2.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double meters = sc.nextDouble();
        double centimeters = converter(meters, 100);
        double decimeters = converter(meters, 10);
        double millimeters = converter(meters, 1000);
        double miles = converter(meters, 0.00062);
        System.out.println("Centimeters: " + centimeters
                + "\nDecimeters: " + decimeters
                + "\nMillimeters: " + millimeters
                + "\nMiles: " + miles);
    }

    public static double converter(double meters, double scale) {
        double res = meters * scale;

        return res;
    }
}
