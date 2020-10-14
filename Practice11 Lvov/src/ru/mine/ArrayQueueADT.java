package ru.mine;

public class ArrayQueueADT<E> {
    //(инвариант)I: queue.size >=0 && queue.head >= 0 && i=0,..queue.elements.length-1 : a[i] != null
    private int size=0; //текущий ращмер массива
    private int head=0;
    private Object[] elements = new Object[5];


    //pre: element != null
    //post: queue.elements.length && queue.size' = queue.size +1 && добавленный элемент в queue.elements[(queue.head + queue.size)%queue.elements.length] = element,
    // queue.head' = queue.head && сохранение элементов a[i] = a[i]'
    public static <E> void enqueue(ArrayQueueADT<E> queue, E element) {
        assert element != null;
        ArrayQueueADT.checkCapacity(queue,queue.size + 1);
        queue.elements[(queue.head + queue.size)%queue.elements.length] = element;
        queue.size++;
    }

    //pre: capacity != null
    //post queue.size = capacity || a[i] = a[i]' && a = temp[capacity*2]
    public static <E> void checkCapacity(ArrayQueueADT<E> queue,int capacity) {
        if (capacity <= queue.elements.length) {
            return;
        }

        capacity *= 2;
        Object[] temp = new Object[capacity];
        if (queue.head == 0) {
            for (int i =0; i < queue.size; i++) {
                temp[i] = queue.elements[i];
            }
            queue.elements = temp;
        }
        else {
            for (int i = queue.head; i < queue.elements.length; i++) {
                temp[i-queue.head] = queue.elements[i];
            }

            for (int i = 0; i <= (queue.size + queue.head)%queue.elements.length; i++) {
                temp[i + queue.elements.length - queue.head] = queue.elements[i];
            }
            queue.head = 0;
            queue.elements = temp;
        }

    }

    //pre: queue.head >= 0
    //post: a[i]=a[i]' && Res = a[queue.head] && queue.size = queue.size' && queue.head = queue.head'
    public static <E> Object element(ArrayQueueADT<E> queue) {
        assert queue.size > 0;
        return queue.elements[queue.head];

    }

    //pre: queue.head >=0
    //post a[i] = a[i]' && queue.head = (queue.head' + 1) % queue.elements.length && queue.size = queue.size' -1 && Res = a[queue.head]
    public static <E> Object dequeue(ArrayQueueADT<E> queue) {
        assert queue.size > 0;
        Object el= queue.elements[queue.head];
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return el;
    }

    //post: a[i]=a[i]' && Res = queue.size && queue.size = queue.size' && queue.head = queue.head'
    public int size(ArrayQueueADT<E> queue) {
        return queue.size;
    }

    //post: a[i]=a[i]' && Res = queue.size > 0 && queue.size = queue.size' && queue.head = queue.head'
    public boolean isEmpty(ArrayQueueADT<E> queue) {
        return queue.size == 0;
    }

    //post: a[i]=a[i]' && queue.size = queue.size' && queue.head = queue.head'
    public void clear(ArrayQueueADT<E> queue) {
        queue.elements = new Object[5];
        queue.size = 0;
        queue.head = 0;

    }

    //post: a[i]=a[i]' && Res = String res && queue.size = queue.size' && queue.head = queue.head'
    public static <E> String toString(ArrayQueueADT<E> queue) {
        StringBuilder str = new StringBuilder("[");
        if (queue.size == 0) return "[]";
        if (queue.head < (queue.head + queue.size) % queue.elements.length) {
            for (int i = queue.head; i < (queue.head + queue.size) % queue.elements.length; i++) {
                str.append(queue.elements[i]);
                str.append(", ");
            }
        } else {
            for (int i = queue.head; i < queue.elements.length; i++) {
                str.append(queue.elements[i]);
                str.append(", ");
            }
            for (int i = 0; i < (queue.head + queue.size) % queue.elements.length; i++) {
                str.append(queue.elements[i]);
                str.append(", ");
            }
        }
        str.delete(str.length() - 2, str.length());
        str.insert(str.length(), ']');
        return str.toString();


    }

    public static void main(String[] args) {
        ArrayQueueADT<Integer> queue = new ArrayQueueADT<Integer>();

        //input
        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.enqueue(queue, i);
        }
        System.out.println(ArrayQueueADT.toString(queue));

        //pop half
        for (int i = 0; i < 5; i++) {
            ArrayQueueADT.dequeue(queue);
        }
        System.out.println(ArrayQueueADT.toString(queue));

        //input half
        for (int i = 0; i < 5; i++) {
            ArrayQueueADT.enqueue(queue, i);
        }
        System.out.println(ArrayQueueADT.toString(queue));

        //input more
        for (int i = 100; i < 108; i++) {
            ArrayQueueADT.enqueue(queue, i);
        }
        System.out.println(ArrayQueueADT.toString(queue));
    }
}
