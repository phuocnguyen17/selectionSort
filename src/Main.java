import java.time.Instant;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(100000);
        StopWatch stopWatch = new StopWatch(Instant.now());

        selectionSort(arr);
        stopWatch.setEndTime(Instant.now());
        System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}


