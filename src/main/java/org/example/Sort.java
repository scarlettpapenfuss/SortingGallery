package org.example;

import java.lang.reflect.Array;

public class Sort {

    /**
     * Should take in an array of two ints and changes it
     * to arrray with the numbers from smallest to largest.
     * @param nums
     */
    public static void sortTwo(int[] nums) {
        if(nums[0] > nums[1]){
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }





    }

    /**
     * This function should take the two arrays and merge them into the inputArray.
     * The result should be in order from smallest to largest, with all the numbers from both arrays included.
     * @param inputArray - The original array that will come back changed.
     * @param array1 - A sorted list of numbers that is the size of half the length of the inputArray
     * @param array2 - A sorted list of numbers that is the size of half the length of the inputArray
     */
    public static void merge(int[] inputArray, int[] array1, int [] array2) {

        int i=0, j=0, k=0;
        while(i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                inputArray[k] = array1[i];
                i++;
            } else {
                inputArray[k] = array2[j];
                j++;
            }
            k++;
        }
        //clean out array1
        while(i < array1.length) {
            inputArray[k] = array1[i];
            i++;
            k++;
        }
        //clean out array2
        while(j < array2.length) {
            inputArray[k] = array1[j];
            j++;
            k++;
        }

    }
}
