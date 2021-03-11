package com.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NodeTest {
    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
        assertTrue(result);
    }
    //uc2 for adding nodes in list
    @Test
    public void testforAdd() {
        System.out.println("This test is for adding node in the list.");
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(firstNode);
        linkedlist.add(secondNode);
        linkedlist.add(thirdNode);
        linkedlist.print();
        boolean result = linkedlist.head.equals(thirdNode) && linkedlist.head.getNext().equals(secondNode)
                && linkedlist.tail.equals(firstNode);
        assertEquals(true, result);
    }

    //UC3 for append
    @Test
    public void testforAppend() {
        System.out.println("This is test method for appending node to the list.");
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(firstNode);
        linkedlist.append(secondNode);
        linkedlist.append(thirdNode);
        linkedlist.print();
        boolean result = linkedlist.head.equals(firstNode) && linkedlist.head.getNext().equals(secondNode)
                && linkedlist.tail.equals(thirdNode);
        assertTrue(result);
    }


}
