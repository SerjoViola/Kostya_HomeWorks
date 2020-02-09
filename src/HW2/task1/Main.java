package HW2.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput1 = sc.nextInt();
        int userInput2 = sc.nextInt();
        int userInput3 = sc.nextInt();
        int count = userInput1 * 100 + userInput2 * 10 + userInput3;
        System.out.println(count);

    }
}

