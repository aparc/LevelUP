package Lesson8;


import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        int min = - 100;
        int max = 100;
        int [] array = new int[10];
        String s = "";

        for(int i = 0; i < array.length; i++){
            array[i] = r.nextInt(max - min + 1) + min;
        }

        for(int i = 0; i < array.length; i++){
            s += array[i] + " ";
        }

        System.out.println("Converted to string: " + s);

        determineElement(array);

    }

    public static void determineElement(int[] array)
    {
        int zero = 0;
        Map<Integer, Integer> map = new HashMap<>();
        final int[] key2 = {0};
        final int[] value2 = {0};
        final int[] count = {0};

        IntStream.range(0, array.length).forEach(i -> map.put(array[i], zero)); // запихали в HashMap

        for(int i = 0; i < array.length; i++){  // определяем количество повторений каждого элемента
            for(Integer key: map.keySet()){
                if (array[i] == key) {
                    map.put(key, map.get(key) + 1);
                }
            }
        }

        map.keySet().stream().filter(key -> map.get(key) > value2[0]).forEach(key -> {  // находим элемент, который чаще всего повторяется
            value2[0] = map.get(key); //
            key2[0] = key;
        });

        map.keySet().stream().filter(key -> map.get(key) == value2[0]).forEach(key -> count[0]++);
        if (count[0] > 1){
            return;
        } else System.out.println("Элемент " + key2[0] + " повторяется " + value2[0] + " раз(а).");

    }
}
