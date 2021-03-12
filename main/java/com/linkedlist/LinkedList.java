package com.linkedlist;

import java.lang.Comparable;

public class LinkedList<K extends Comparable<K>> {
    public INode head;
    public INode tail;
    public int count = 0;
    public int size = 0;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // uc2 for adding to the linkedlist
    public void add(INode newNode) {
        count++;
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode temp = this.head;
            this.head = newNode;
            this.head.setNext(temp);
        }
    }



    public void print() {
        StringBuffer myNodes = new StringBuffer("Linked List: \n");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!(tempNode.equals(tail)))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    //UC3 for appending
    public void append(INode node) {
        count++;
        if (this.head == null) {
            this.head = node;
        }
        if (this.tail == null) {
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }

    }

    //uc4 for insert
    public void insert(INode myNode,INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    //uc5 for deleting first node
    public INode pop() {
        INode temp = this.head;
        this.head = head.getNext();
        return temp;
    }
    //uc6 delete last elemet
    public INode popLast() {
        INode temp = head;
        while (!temp.getNext().equals(tail)) {
            temp = temp.getNext();
        }
        this.tail = temp;
        temp = temp.getNext();
        return temp;
    }

    //uc7 for search
    public INode<K> search(K key) {
        INode<K> tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey()==(key)) {
                System.out.println("Element is found");
                return tempNode;
            } else
                tempNode = tempNode.getNext();
        }
        return null;
    }

    //uc8 for search and insert
    public INode searchAndInsert(K key, INode Node) {
        INode temp = head;
        while (temp != null && temp.getNext() != null) {
            if (temp.getKey().equals(key)) {
                break;
            } else
                temp = temp.getNext();
        }
        INode temp2 = temp.getNext();
        temp.setNext(Node);
        Node.setNext(temp2);
        return temp;
    }
    //uc9 search and remove
    public INode searchAndRemove(K key) {
        INode temp = head;
        while (temp != null && temp.getNext() != null) {
            if (temp.getNext().getKey().equals(key)) {
                break;
            } else
                temp = temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());
        size--;
        return temp;
    }

    public int Resize() {
        return size;
    }
    
    //uc10 for ordered list
    public void addSorted(INode newNode) {
        INode tempNode;

        if (head == null || (head.getKey()).compareTo(newNode.getKey()) >= 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            tempNode = head;
            while (tempNode.getNext() != null && (tempNode.getNext().getKey()).compareTo(newNode.getKey()) < 0) {
                tempNode = tempNode.getNext();
                newNode.setNext(tempNode.getNext());
                tempNode.setNext(newNode);
            }
            size++;
        }

    }


    public static void main(String[] args){
        //Mater welcome message
        System.out.println("....Welcome to LinkedList Program....");
    }


}
