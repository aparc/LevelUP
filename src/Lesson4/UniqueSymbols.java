package Lesson4;

import java.nio.CharBuffer;
import java.util.ArrayList;

public class UniqueSymbols {
    public static void main(String[] args) {

        String s = "Некоторая строка.";
        char[] array = s.toCharArray();
        int temp = 0;
        int count = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++) {
                if (array[i] == s.charAt(j)) {
                    temp++;
                }

            }
            if(temp == 1) {count++;}
            temp = 0;
        }

        System.out.println("Количество уникальных символов в строке: " + count);
    }
}
