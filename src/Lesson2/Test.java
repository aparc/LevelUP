package Lesson2;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[10001];

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        array[0] = array[1] = 0;
        for (int i = 2; i < array.length; i++){
            if (array[i] != 0) {
                for (int j = 2; j*i < array.length; j++)
                {
                    int k = i * j;
                    array[k] = 0;
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0) {continue;}
            System.out.println(array[i]);
        }
    }
}
