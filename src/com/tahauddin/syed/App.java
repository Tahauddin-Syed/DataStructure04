package com.tahauddin.syed;

import java.util.Arrays;

/**
 * insertion sort:: it has the time complexity of O(n2) nsquare
 * and it is quadratic,
 * taking the key and comparing it with the items before it.
 * starting with first index.
 *
 */
public class App {

    public static void main(String[] args) {
        Integer[] intArray = {20,30,-15,-10,-5,5,3,0,8,2,2};
        System.out.println("Before Sort");
        Arrays.stream(intArray).forEach(intValue -> {
            System.out.print(intValue + ", ");
        });

        for (int i = 1; i < intArray.length; i++){
            Integer key = intArray[i];
            int j = i - 1;
            while(j>=0 && intArray[j] > key){
                intArray[j+1] = intArray[j];
                j--;
            }
            intArray[j + 1] = key;
        }

        System.out.println("\nAfter Sort");
        Arrays.stream(intArray).forEach(intValue -> {
            System.out.print(intValue + ", ");
        });

    }


}