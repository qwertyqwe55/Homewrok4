package com.netcracker.list;

import java.util.ArrayList;
import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E>,Iterable<E>{
    private Node<E> head;
    private int Size;
    @Override
    public void add(E element) {
        Node<E> new_element = new Node<>();
        new_element.data = element;

        if(head == null){
            head = new_element;
        }else {

            Node<E> current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = new_element;
        }
        Size++;
    }

    @Override
    public void add(int index, E element) {
        Node<E> node = head;
        Node<E> new_element = new Node<>();
        new_element.data = element;
        if(index == 0){
            new_element.next = head;
            head = new_element;
        }else {

            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }

            new_element.next = node.next;

            node.next = new_element;
        }
        Size++;
    }

    @Override
    public void clear() {
        int k = Size;
        for (int i = 0; i < k; i++) {
            remove(0);
        }
    }

    @Override
    public E get(int index) {
        Node<E> current = head;

        if(index > Size){
            return null;
        }

        for (int k = 0; k < index; k++){
            current = current.next;
        }

        return current.data;
    }

    @Override
    public int indexOf(E element) {
        Node<E> current = head;

        for (int i = 0; i < Size; i++) {
            if(current.data.equals(element)){
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        if(head == null){
            return null;
        }

        Node<E> current = head;

        if(current.next == null){
            head = null;
            return current.data;
        }

        if(index == 0){
            head = current.next;
        }

        for (int i = 0; i < index-1; i++) {
            current = current.next;
        }

        Node<E> next_element = current.next;

        current.next = next_element.next;

        Size--;

        return next_element.data;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = head;
        Node<E> new_element = new Node<>();
        new_element.data = element;
        if(index == 0){
            new_element.next = head;
            head = new_element;
        }else {

            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }


            new_element.next = node.next;

            node.next = new_element;
        }
        Size++;
        return element;
    }

    @Override
    public int size() {
        return Size;
    }

    @Override
    public Object[] toArray() {
        Object[] e = new Object[Size];
        return  e;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator<E>() {

            Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                Node<E> elem = current;
                current = current.next;
                return elem.data;
            }


        };
        return it;
    }

    @Override
    public String toString() {
        Node<E> t = head;
        String s = "";
        while (t != null)
        {
            s = s + t.data + " ";
            t = t.next;
        }
        return s;
    }
}
