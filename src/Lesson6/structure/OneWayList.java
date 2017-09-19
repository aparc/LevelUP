package Lesson6.structure;

public class OneWayList<T> implements CustomList<T> {


    private Element head;
    private Element tail;
    private Element current;
    private Element buff;


    private class Element {
        Element next;
        T value;
        Element(T value) {
            this.value = value;
        }
    }

    @Override
    public void add(T value) {
        Element el = new Element(value);
        if (head == null) {
            head = el;
            tail = el;
        } else {
//            Element current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = el;

            // tail - текущий последний элемент
            // tail.next = null
            // добавляем новый элемент в конец
            tail.next = el; // пока еще последний элемент
            // ссылает на новый элемент
            tail = el;
        }
    }

    @Override
    public void delete(int index) {

        if (head == null) {return;}


        if (index == 0) {
            if (head.next == null) { head = null;}
            head = head.next;
            System.out.println("Nowa Head is " + head.value);
        } else {
            current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;

            }
            System.out.println("В этот элемент запишем ссылку на элемент через одного: " + current.value);
            if (current.next.next == null) {
                current.next = null;
            } else {
                current.next = current.next.next;
                System.out.println("Данный элемент записан: " + current.next.value);
            }
        }

//        System.out.println(current.next.value);


    }

}
