package HW2.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basis = sc.nextDouble();
        double height = sc.nextDouble();
        double area = calculationTriangleArea(basis, height);
        System.out.println("Triangle area = " + area);
    }

    public static double calculationTriangleArea(double basis, double height){
        double area = basis * height / 2;

        return area;
    }

}
