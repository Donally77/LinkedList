package com.linkedlist;

public class LinkedList {
    public INode head;
    public INode tail;
    public int count = 0;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

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

    // uc2 for adding to the linkedlist

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

    public static void main(String[] args){
        //Mater welcome message
        System.out.println("....Welcome to LinkedList Program....");
    }
}
