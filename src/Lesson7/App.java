package Lesson7;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        String s  = "мама мыла раму";
        char[] array = s.toCharArray();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            map.put(array[i], count);
        }

        for(int i = 0; i < array.length; i++){
            for(Character key: map.keySet()){
                if (array[i] == key) {
                    map.put(key, map.get(key) + 1);
                }
            }
        }

        for(Map.Entry<Character, Integer> pair: map.entrySet()){
            System.out.println("Буква(символ) " + pair.getKey() + " повторяется " + pair.getValue() + " раз(а).");
        }
    }
}
