package com.bridgelabz;

public class LinkedList<K> {

    Node<K> head, tail;

    public void push(K key) {
        Node<K> newNode = new Node<>(key);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void print() {
        Node<K> temp = head;
        while (temp != null) {
            System.out.print(temp.key + " ");
            temp = temp.next;
        }
    }

    public void add(K key) {
        Node<K> newNode = new Node<>(key);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public Node<K> search(K key) {
        Node<K> temp = head;
        Node<K> foundKey = null;

        while (temp != null) {
            if (temp.key == key) {
                foundKey = temp;
                break;
            }
            temp = temp.next;
        }
        return foundKey;
    }

    public void insert(K key, K afterKey) {
        Node<K> searchedNode = search(afterKey);
        Node<K> insertValue = new Node<>(key);
        insertValue.next = searchedNode.next;
        searchedNode.next = insertValue;
    }

    public void pop(){
        head  = head.next;
    }

}