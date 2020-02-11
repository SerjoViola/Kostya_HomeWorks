package Tasks.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numPer = sc.nextInt();
        double percent = (num + 0.0) / 100 * numPer;
        System.out.println(numPer + "% от " + num + "\nРезультат: " + percent);
    }
}
