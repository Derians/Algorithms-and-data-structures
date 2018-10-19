/**
 * Lesson 2. Arrays and sorting
 *
 * @author Ivan Chaykin
 * @date 15.10.2018
 */

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Lesson2 {

    public static void main(String[] args) {

        int arraySize = 1_000_000;
        int[] arrayBubble = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < arrayBubble.length; i++) {
            arrayBubble[i] = random.nextInt(Integer.MAX_VALUE);
        }

        int[] arraySelect = Arrays.copyOf(arrayBubble, arraySize);
        int[] arrayInsert = Arrays.copyOf(arrayBubble, arraySize);

        System.out.println("--- Bubble sort test on an array of " + arraySize + " items ---");
        long startTimeBubble = System.nanoTime();
        ArrayUtils.sortBubble(arrayBubble);
        System.out.println("Time spent on sorting: " +
                TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTimeBubble));

        System.out.println("--- Select sort test on an array of " + arraySize + " items ---");
        long startTimeSelect = System.nanoTime();
        ArrayUtils.sortSelect(arraySelect);
        System.out.println("Time spent on sorting: " +
                TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTimeSelect));

        System.out.println("--- Insert sort test on an array of " + arraySize + " items ---");
        long startTimeInsert = System.nanoTime();
        ArrayUtils.sortInsert(arrayInsert);
        System.out.println("Time spent on sorting: " +
                TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTimeInsert));
    }
}