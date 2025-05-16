import java.lang.Math;
import java.lang.System;
import java.util.Arrays;

class Numbers {

    public static int[] generateRandomNumbers(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        return numbers;
    }

    public static void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(1000000000);
        // printNumbers(numbers);
        // measure time
        // linear search
        // long startTime = System.nanoTime();

        // int searchNumber = -1;
        // boolean found = false;
        // for (int i = 0; i < numbers.length; i++) {
        //     if (numbers[i] == searchNumber) {
        //         found = true;
        //         break;
        //     }
        // }
        // System.out.println("Found: " + found);

        // long endTime = System.nanoTime();
        // System.out.println(
        //     "Time taken for linear search: " + (endTime - startTime) + " ns"
        // );
        // // sort
        Arrays.sort(numbers);
        // binarySearch
        // measure time
        long startTime = System.nanoTime();
        int searchNumber = 10;
        int index = Arrays.binarySearch(numbers, searchNumber);
        System.out.println("Found: " + (index >= 0));
        long endTime = System.nanoTime();
        System.out.println(
            "Time taken for binary search: " + (endTime - startTime) + " ns"
        );
    }
}
