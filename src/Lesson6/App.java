package Lesson6;

public class App {

    public static void main(String[] args) {

        CustomList<String> list = new OneWayList<>();

        list.add("Cat");
        list.add("Dog");
        list.add("Car");
        list.add("Boat");
        list.add("Yota");



        list.delete(2);
//        list.delete(0);
//        list.delete(0);





    }
}
