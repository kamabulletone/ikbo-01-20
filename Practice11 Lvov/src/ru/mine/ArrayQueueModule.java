package ru.mine;

public class ArrayQueueModule<E> {
    //(инвариант)I: size >=0 && head >= 0 && i=0,..elements.length-1 : a[i] != null
    private static int size=0; //текущий ращмер массива
    private static int head=0;
    private static Object[] elements = new Object[5];


    //pre: element != null
    //post: elements.length && size' = size +1 && добавленный элемент в elements[(head + size)%elements.length] = element,
    // head' = head && сохранение элементов a[i] = a[i]'
    public static <E> void enqueue(E element) {
        assert element != null;
        checkCapacity(size + 1);
        elements[(head + size)%elements.length] = element;
        size++;
    }

    //pre: capacity != null
    //post size = capacity || a[i] = a[i]' && a = temp[capacity*2]
    public static <E> void checkCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }

        capacity *= 2;
        Object[] temp = new Object[capacity];
        if (head == 0) {
            for (int i =0; i < size; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
        }
        else {
            for (int i = head; i < elements.length; i++) {
                temp[i-head] = elements[i];
            }

            for (int i = 0; i <= (size + head)%elements.length; i++) {
                temp[i + elements.length - head] = elements[i];
            }
            head = 0;
            elements = temp;
        }

    }


    //pre: head >= 0
    //post: a[i]=a[i]' && Res = a[head] && size = size' && head = head'
    public static Object element() {
        assert size > 0;
        return elements[head];

    }

    //pre: head >=0
    //post a[i] = a[i]' && head = (head' + 1) % elements.length && size = size' -1 && Res = a[head]
    public static Object dequeue() {
        assert size > 0;
        Object el= elements[head];
        head = (head + 1) % elements.length;
        size--;
        return el;
    }

    //post: a[i]=a[i]' && Res = size && size = size' && head = head'
    public static int size() {
        return size;
    }

    //post: a[i]=a[i]' && Res = size > 0 && size = size' && head = head'
    public static boolean isEmpty() {
        return size == 0;
    }

    //post: a[i]=a[i]' && size = size' && head = head'
    public static void clear() {
        elements = new Object[5];
        size = 0;
        head = 0;

    }
    //post: a[i]=a[i]' && Res = String res && size = size' && head = head'
    public static String toStr() {
        StringBuilder str = new StringBuilder("[");
        if (size == 0) return "[]";
        if (head < (head + size) % elements.length) {
            for (int i = head; i < (head + size) % elements.length; i++) {
                str.append(elements[i]);
                str.append(", ");
            }
        } else {
            for (int i = head; i < elements.length; i++) {
                str.append(elements[i]);
                str.append(", ");
            }
            for (int i = 0; i < (head + size) % elements.length; i++) {
                str.append(elements[i]);
                str.append(", ");
            }
        }
        str.delete(str.length() - 2, str.length());
        str.insert(str.length(), ']');
        return str.toString();


    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }
        System.out.println(toStr());

        //pop half
        for (int i = 0; i < 5; i++) {
            ArrayQueueModule.dequeue();
        }
        System.out.println(toStr());

        //input half
        for (int i = 0; i < 5; i++) {
            ArrayQueueModule.enqueue(i);
        }
        System.out.println(toStr());

        //input more
        for (int i = 100; i < 108; i++) {
            ArrayQueueModule.enqueue(i);
        }
        System.out.println(toStr());
    }
}
