package Tasks.task2;

public class Main {

    public static void main(String[] args) {
        String taskText = "'Your time is limited, so don’t waste it living someone else’s life' Steve Jobs";
        System.out.println(taskText);
        String[] array = taskText.split(" ");

        for (int i = 0; i < array.length; i+=2) {
            System.out.println(array[i] + " " + array[i+1]);
        }

    }
}
