package Kegiatan2;

import java.util.NoSuchElementException;

public class Queue {
    private Book[] books;
    private int front;
    private int rear;
    private Book lastbook;

    public int getSize() {
        return size;
    }

    public int size;

    public Queue(int capacity) {
        books = new Book[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == books.length;
    }

    public void enqueue(Book book) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % books.length;
        books[rear] = book;
        size++;
    }

    public Book dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        Book book = books[front];
        front = (front + 1) % books.length;
        size--;
        lastbook = book;
        return book;
    }

    public String peek(){
        if(isEmpty()){
            return null;
        }
        Book book = books[front];
        return book.getTitle();
    }
}
