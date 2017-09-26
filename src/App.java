package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        String s;

        while(!(s = reader.readLine()).equals("")){
            list.add(s);

        }

        for(int i = 1; i < list.size(); i++){
            for(int j = list.size() - 1; j >= i; j--){

                if(compareStrings(list.get(j - 1), list.get(j))){
                    String current = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, current);

                }
            }
        }
        for(String x: list) {
            System.out.println(x);
        }
        System.out.println();
        Collections.sort(list, Collections.reverseOrder());  //reverse sort
        for(String x: list){
            System.out.println(x);
        }

    }

    public static boolean compareStrings(String a, String b){

        return a.compareToIgnoreCase(b) > 0;

    }


}
