package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created By Alireza Dolatabadi
 * Date: 7/29/2022
 * Time: 5:29 PM
 */
public class TestArray {
    public static void main(String[] args) {
        int[] array = new int[3];
        //index start from 0
/*        array[0] = -1;
        array[1] = -3;
        array[2] = -6;
        */
/*
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
*/
//        for (int i = 0; i < 3; i++) {
//            System.out.println(array[i]);
//        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array.length = " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));

    }
}
