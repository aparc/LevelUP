package Lesson6;

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
//        else {current = head;
//            for(int i = 0; i < index; i++){
//                buff.next = current.next;
//                current.next = null;
//                current = buff.next;
//            }
//
//            buff.next = current.next;
//            buff = buff.next;
//           System.out.println("delete element by index: " + current.value);
//           System.out.println("now the item under this index is " + buff.value);
//            current = null;
//            if(index == 0) {
//                head = head.next;
//            }
//        }
        current = head;
        for(int i = 0; i < index; i++){
            buff = current.next;
            current.next = current.next.next;
        }

        current = current.next;
        System.out.println(buff.value);
        System.out.println(current.value);
    }

}
