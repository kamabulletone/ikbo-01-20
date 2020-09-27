package ru.mine;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    /**
     *
     * @param element - removes that element in queue
     */
    public void remove(E element) {
        content.remove(element);
    }

    /**
     *
     * @param element - moves that elements to the back
     */
    public void moveToBack(E element) {
        content.remove(element);
        content.add(element);
    }
}
