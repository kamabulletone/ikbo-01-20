package ru.mine;

public class BoundedWaitList<E> extends WaitList<E> {
    int capacity;
    public BoundedWaitList(int capacity) {
        super();
        this.capacity =capacity;
    }

    /**
     *
     * @return - returns the size of queue
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @param element adds elements if the size of queue is not bigger then capacity
     */
    @Override
    public void add(E element) {
        if (this.content.size() == capacity) {
            System.out.println("cant add anymore");
        }
        else {
            content.add(element);
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}
