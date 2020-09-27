package ru.mine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {

    protected ConcurrentLinkedQueue<E> content;

    /**
     * Constructor for WaitList
     */
    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    /**
     * @param content sone Collection with generic type
     */
    public WaitList(Collection<E> content) {
        this.content = new ConcurrentLinkedQueue<>(content);
    }

    /**
     * Функция получения результата {@see content}
     * @return output string with class variables
     */
    @Override
    public String toString() {
        return "WaitList {" +
                "content = " + content +
                '}';
    }

    /**
     *
     * @param element it's an element which we want to add to out Collection
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     * Method that removes first element
     * @return - returns the deleted first element
     */
    @Override
    public E remove() {
        return content.remove();
    }

    /**
     *
     * @param element - lement that we want to check if it is in a queue
     * @return - returns if it is
     */
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }


    @Override
    public boolean containsAll(Collection<E> contentCheck) {
        return content.containsAll(contentCheck);
    }

    /**
     *
     * @return - returns true if queue is empty
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
