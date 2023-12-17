package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    public String[] seasonsArray() {
        // Return an array listing all the seasons of the year, starting with winter.
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    public int[] generateNumbers(int length) {
        // Generate an array of consecutive positive integers starting at 1 of the given length.
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public int totalSum(int[] arr) {
        // Find the sum of all elements in the array.
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public int findIndexOfNumber(int[] arr, int number) {
        // Return the index of the first occurrence of the number in the array. If not found, return -1.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public String[] reverseArray(String[] arr) {
        // Return a new array obtained by reversing the order of elements.
        String[] reversedArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return reversedArray;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        // Return a new array obtained by choosing positive numbers only.
        int countPositive = 0;
        for (int num : arr) {
            if (num > 0) {
                countPositive++;
            }
        }

        int[] positiveNumbers = new int[countPositive];
        int index = 0;
        for (int num : arr) {
            if (num > 0) {
                positiveNumbers[index++] = num;
            }
        }

        return positiveNumbers;
    }

    // [OPTIONAL] sortRaggedArray - return a sorted, ragged, two-dimensional int[][] array.
    public int[][] sortRaggedArray(int[][] arr) {
        /*// Sorting rules: 1) Sort one-dimensional arrays by length; 2) Sort numbers in each array.
        int[][] sortedArray = new int[arr.length][];

        // Sort one-dimensional arrays by length.
        Arrays.sort(arr, Comparator.comparingInt(a -> a.length));

        // Copy and sort numbers in each array.
        for (int i = 0; i < arr.length; i++) {
            sortedArray[i] = Arrays.copyOf(arr[i], arr[i].length);
            Arrays.sort(sortedArray[i]);
        }

        return sortedArray;*/
        return arr;
    }
}