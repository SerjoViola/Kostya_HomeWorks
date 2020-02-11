package Tasks.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fNum = sc.nextDouble();
        double sNum = sc.nextDouble();

        double sum = fNum + sNum;
        double com = fNum * sNum;
        double dif;
        if (fNum > sNum) {
            dif = fNum - sNum;
        }
        else{
            dif = sNum - fNum;
        }

        System.out.println("Sum: " + sum + "\nDifference: " + dif + "\nComposition: " + com);
    }
}
