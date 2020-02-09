package HW2.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        while (userInput < 1000 && userInput >= 10000) {
            System.out.println("Try again");
            userInput = sc.nextInt();
        }
        int composition = (userInput / 1000) * (userInput % 1000 / 100) * (userInput % 100 / 10) * (userInput % 10);
        System.out.println(composition);
    }
}
