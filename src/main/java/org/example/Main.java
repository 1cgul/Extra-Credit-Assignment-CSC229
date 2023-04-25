package org.example;
import java.util.Scanner;

/*
Develop an algorithm (Java or C++) that can find the ratio of the sum of the
largest two numbers divided by the sum of the smallest two numbers in an
array. The solution should be linear or better.

For example:
If the input is
int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};

The ratio is (450+321) / (1+1) = 385.5.
 */

public class Main {
    public static void main(String[] args) {
        //FOR USER INPUTS
        /*Scanner scnr = new Scanner(System.in);
        System.out.println("Pick size of array: ");
        final int USER_SIZE = scnr.nextInt();
        int input;
        int[] a = new int[USER_SIZE];
        for(int i = 0; i < a.length; i++){//adding users numbers to array
            input = scnr.nextInt();
            a[i] = input;
        }*/

        int[] example ={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
        System.out.println(solution(example));
    }

    public static double solution(int[] arr){ //runtime O(n)
        int firstHighest, secondHighest, firstLowest, secondLowest;
        firstHighest = secondHighest = firstLowest = secondLowest = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i] > secondHighest){
                if(arr[i] > firstHighest){
                    firstHighest = arr[i];
                    continue;
                }
                secondHighest = arr[i];
                continue;
            }
            if(arr[i] < secondLowest){
                if(arr[i] < firstLowest){
                    firstLowest = arr[i];
                    continue;
                }
                secondLowest = arr[i];
            }
        }
        //for testing
        //System.out.println("firstHighest: " + firstHighest + " secondHighest: " + secondHighest + " firstLowest: " + firstLowest + " secondLowest: " + secondLowest);
        return (double)(firstHighest + secondHighest) / (firstLowest + secondLowest);
    }
}