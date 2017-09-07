package Lesson3.ArrayUtils;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[7];

        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(6);
        }
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
        ArrayUtils.MinMaxOfArray(array);

        System.out.println("Среднее арифметическое значение элементов: " + ArrayUtils.AverageValue(array));
    }


}
