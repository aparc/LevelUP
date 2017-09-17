package Lesson6;

public class OneWayList<T> implements CustomList<T> {


    private Element head;
    private Element tail;
    private Element current;


    private class Element {
        Element next;
        Element prev;
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
        else {current = head;
            for(int i = 0; i < index; i++){
                current.prev = current.next;
                current = current.next;
            }

            current.prev = current.next;
           System.out.println(current.value);
//            System.out.println(current.prev.value);
            current = null;
        }

    }
}
