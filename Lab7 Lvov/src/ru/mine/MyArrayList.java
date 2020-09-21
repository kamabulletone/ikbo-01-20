package ru.mine;

public class MyArrayList<T> {
    private final int INITSIZE = 10;
    private Object[] array;
    private int elementsInArray;


    public MyArrayList() {
        this(10);
    }
    public MyArrayList(int size) {
        if (size <= 0) {
            System.out.println("Size must be greater than 0: try again ");
            return;

        }
        this.array = new Object[size];
        this.elementsInArray = 0;

    }

    public void remove(T x) {
        if (array.length == 0) {
            System.out.println("Array is empty, nothing to delete ");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                array[i] = null;
                elementsInArray--;
                copyArray(0,"");
                return;
            }
        }

    }

    public void add(int indexX, Object x) {
        if (checkIfArrayFull()){
            copyArray(0,"double");
        }
        if (indexX >= array.length) {
            System.out.println("Index is >= array length so it is out of range ");
            System.exit(-1);
        }
        Object temp = array[indexX];
        array[indexX] = x;
        Object temp2;
        for (int i = indexX; i < array.length-1; i++) {
            temp2 = array[i+1];
            array[i+1] = temp;
            temp = temp2;
        }
        copyArray(0,"");
        elementsInArray++;
    }

    public void add(T x) {
        if (checkIfArrayFull()) {
            copyArray(0, "double");
        }

        array[this.elementsInArray] = x;
        elementsInArray++;
    }

    private boolean checkIfArrayFull() {
        return this.array.length == elementsInArray;
    }

    private void copyArray(int size, String action) {
        size = incArraySize(size,action);

        Object[] tempArr = new Object[size];
        int tempElement = 0;

        for (int i = 0; i < array.length; i++, tempElement++) {
            if (array[i] == null) {
                tempElement--;
                continue;
            }

            tempArr[tempElement] = this.array[i];
        }

        this.array = null;
        this.array = new Object[tempArr.length];
        this.array = tempArr;

    }

    private int incArraySize(int size, String action) {
        if (action == "double") {
            size = this.array.length * 2;
        }
        else {
            size = this.array.length + size;
        }

        return size;
    }




    public T get(int index) {
        Object element = null;
        try {
            element = array[index];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index >= array's length ");
            System.exit(-1);
        }
        return (T)element;
    }
    public int size() { return elementsInArray; }
    public boolean isEmpty() { return elementsInArray == 0 ;}
    public boolean isIn(T x) {
        return find(x) >= 0;
    }
    public int find(T x) {
        for (int i = 0; i < array.length; i++) {
            if (x.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }



}
