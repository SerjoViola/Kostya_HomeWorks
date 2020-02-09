package HW2.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int count ;
        count = userInput % 10 * 1000 + userInput % 100 / 10 * 100 + userInput % 1000 / 100 * 10 + userInput / 1000;
        System.out.println(count);
    }
}
