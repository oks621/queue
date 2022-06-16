package main.java;

import java.util.Objects;

public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    //добавляет элемент в конец
    public void add(Object value) {
        Node newNode = new Node(value);
        Node node1 = head;
        if (head == null) {
            head = newNode;
        } else {
            while (node1.next != null) {
                node1 = node1.next;
            }
            node1.next = newNode;
        }
        size++;
    }

    //удаляет элемент под индексом
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement;
        if (index == 0) {
            removedElement = head.element;
            head = head.next;
            if (head == null) {
                head.next = null;
            }
        } else {
            Node<T> prev = getNodeByIndex(index - 1);
            removedElement = prev.element;
            prev.next = prev.next.next;
        }
        size--;
        return removedElement;
    }

    private Node<T> getNodeByIndex(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }


    //возвращает первый элемент в очереди (FIFO)
    public T peek() {
        if (head == null) {
            return null;
        }
        return head.element;
    }

    //очищает коллекцию
    public void clear() {
        head = tail = null;
        size = 0;
    }

    //возвращает первый элемент в очереди и удаляет его из коллекции
    public T poll() {
        T result;
        if (head != null) {
            result = head.element;
            head = head.next;
        } else {
            throw new NullPointerException("Пустой список");
        }

        size--;
        return result;
    }

    //возвращает размер коллекции
    public int size() {
        return size;
    }

    private static class Node<T> {
        T element;

        Node<T> next;

        public Node(T element) {
            this.element = element;
        }

    }
}
