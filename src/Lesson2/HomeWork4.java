package Lesson2;

public class HomeWork4 {
    public static void main(String[] args) {
        int array[] = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = 2; j * j <= array[i]; j++) {
                if (array[i] % j == 0) {
                    array[i] = 0;
                }
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0) {
                continue;
            }
            System.out.println(array[i]);
        }

    //  erythropenia sieve
        int[] array2 = new int[10001];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;
        }
        array2[0] = array2[1] = 0;
        for (int i = 2; i < array2.length; i++) {
            if (array2[i] != 0) {
                for (int j = 2; j * i < array2.length; j++) {
                    int k = i * j;
                    array2[k] = 0;
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == 0) {
                continue;
            }
            System.out.println(array2[i]);
        }
    }
}
