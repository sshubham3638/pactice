package array;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HighestNumberInArray {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i =0; i < array.length; i++){
            System.out.println(i +": ");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        for (int i=0; i< array.length; i++ ){
            if (max < array[i]){
               max = array[i];
            }
        }
        System.out.println(max);
    }
}
