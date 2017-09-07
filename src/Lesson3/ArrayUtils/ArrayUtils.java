package Lesson3.ArrayUtils;

public class ArrayUtils {

    public static void MinMaxOfArray (int[] array){
        int max = array[0];
        int min = array[0];

        for(int i = 0; i < array.length; i++){
        max = max > array[i] ? max : array[i];
        min = min < array[i] ? min : array[i];
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static double AverageValue (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double aver = (double) sum / array.length;
        return Math.round(100.0 * aver) / 100.0;
    }

}
