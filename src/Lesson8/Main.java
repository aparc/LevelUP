package Lesson8;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        int min = - 100;
        int max = 100;
        int [] array = new int[20];
        String s = "";

        for(int i = 0; i < array.length; i++){
            array[i] = r.nextInt(max - min + 1) + min;
        }

        for (int x: array){
            System.out.println(x);
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
        int key2 = 0;
        int value2 = 0;
        int count = 0;

        for(int i = 0; i < array.length; i++){ // запихали в HashMap
            map.put(array[i], zero);
        }

        for(int i = 0; i < array.length; i++){  // определяем количество повторений каждого элемента
            for(Integer key: map.keySet()){
                if (array[i] == key) {
                    map.put(key, map.get(key) + 1);
                }
            }
        }

        for(Integer key: map.keySet()){     // находим элемент, который чаще всего повторяется
            if(map.get(key) > value2) {value2 = map.get(key);
                key2 = key;}
        }

        for(Integer key: map.keySet()){   // есть ли элемент с таким же количеством повторений
            if (map.get(key) == value2){count++;}
        }

        if (count > 1){
            return;
        } else {
            System.out.println("Элемент " + key2 + " повторяется " + value2 + " раз(а).");}
    }

}
