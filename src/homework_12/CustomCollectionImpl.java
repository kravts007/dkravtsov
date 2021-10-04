package homework_12;

import java.util.Collection;

public class CustomCollectionImpl implements CustomCollection {
    private Node head;
    private int size = 0;

    static class Node {
        private final String value;
        private Node next;

        private Node(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value='" + value + '\'' +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public boolean add(String str) {
        if (head == null) {
            head = new Node(str);
            size++;
            return true;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(str);
        size++;
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String s : strArr) {
            add(s);
        }
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        for (int i = 0; i < strColl.size(); i++) {
            add(strColl.get(i));
        }
        return false;
    }

    @Override
    public boolean delete(int index) {
        Node prevNode = head;
        if (index < 0 || index > size) {
            return false;
        }
        if (index == 0) {
            head = prevNode.next;
            return true;
        }
        for (int i = 0; i < index - 1; i++) {
            prevNode = prevNode.next;
        }
        Node currentNode = prevNode.next;
        prevNode.next = currentNode.next;
        size--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        if (head == null) {
            return true;
        }
        if (head.value.equals(str)) {
            head = head.next;
            return true;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value.equals(str)) {
                currentNode.next = currentNode.next.next;
                return true;
            }
            currentNode = currentNode.next;
        }
        return true;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index > size) {
            return ("Index out of range");
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    @Override
    public boolean contains(String str) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value.equals(str)) {
                return true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        head = null;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean equals(Collection coll) {
        if (this.size != coll.size()) {
            return false;
        }
        if (this == coll && this.size == coll.size()) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).equals(coll.get(i))) {
                    return true;
                }
            }

        }
        return false;
    }

        @Override
        public String toString () {
            return "CustomCollectionImpl{" +
                    "head=" + head +
                    '}';
        }
    }
