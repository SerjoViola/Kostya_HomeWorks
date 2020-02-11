package Tasks.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fall seven times\nand\nstand up eight");

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println(userInput);
        String[] array = userInput.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
sndfjkdsnfkmfmmdfgmdkfm
