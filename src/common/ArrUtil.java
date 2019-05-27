package common;

import java.util.Random;

/**
 * Created by sooyoungon on 18/05/2019.
 */
public class ArrUtil {

    public static void swap(int[] arr, int first, int second){

        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }

    public static void printArray(int[] arr){

        System.out.printf("%s\n","============================");

        for(int e: arr){
            System.out.printf("%d ", e);
        }

        System.out.printf("\n%s\n","============================");
    }

    public static int[] makeArrayRandomNumber(int count){

        Random rd = new Random();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }
}
