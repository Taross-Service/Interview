package com.taross.interview.util;

/**
 * This class represents a simple utility for performing mathematical operations on arrays.
 */
public class ArrayMathUtils {

    /**
     * This method finds the maximum value in an array of integers and returns it.
     * @deprecated
     * This method is no longer supporterd.
     * <p> Use {@link ArrayMathUtils#findMax(int[] arr)} instead.
     * @param arr The array of integers to search.
     * @return The maximum value in the array.
     */
    @Deprecated
    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * This method finds the maximum value in an array of integers and returns it.
     *
     * @param arr The array of integers to search.
     * @return The maximum value in the array.
     */
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * This method computes the sum of all even integers in an array and returns it.
     *
     * @param arr The array of integers to sum.
     * @return The sum of all even integers in the array.
     */
    public static int sumEven(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /**
     * This method counts the number of occurrences of a given integer in an array and returns it.
     *
     * @param arr The array of integers to search.
     * @param target The integer to search for.
     * @return The number of occurrences of the target integer in the array.
     */
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method returns the first index at which a given integer appears in an array. If the
     * integer is not found, the method returns -1.
     *
     * @param arr The array of integers to search.
     * @param target The integer to search for.
     * @return The index of the first occurrence of the target integer in the array, or -1 if not found.
     */
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}