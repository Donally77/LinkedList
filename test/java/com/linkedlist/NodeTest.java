package com.linkedlist;

import org.junit.jupiter.api.Test;

import java.security.Key;

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

    //uc4 for inserting element
    @Test
    public void testforinsert() {
        System.out.println("This is test method for inserting element in the list.");
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(firstNode);
        linkedlist.append(thirdNode);
        linkedlist.insert(firstNode, secondNode);
        linkedlist.print();
        boolean result = linkedlist.head.equals(firstNode) && linkedlist.head.getNext().equals(secondNode)
                && linkedlist.tail.equals(thirdNode);
        assertEquals(true, result);
    }
    //uc5 for deleting first node
    @Test
    public void testfordelete() {
        System.out.println("This is test method for deleting first element from the list.");
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(firstNode);
        linkedlist.add(secondNode);
        linkedlist.add(thirdNode);
        linkedlist.print();
        linkedlist.pop();
        linkedlist.print();
        Node<Integer> pop = (Node<Integer>) linkedlist.pop();
        assertEquals(secondNode,pop);
    }
    //uc6 for deleting last element
    @Test
    public void testFordeletelast() {
        System.out.println("This is test method for deleting last element from the list.");
        Node<Integer> firstNode = new Node<Integer>(70);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(56);
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(firstNode);
        linkedlist.add(secondNode);
        linkedlist.add(thirdNode);
        linkedlist.print();
        linkedlist.popLast();
        linkedlist.print();
        Node<Integer> popLast = (Node<Integer>) linkedlist.pop();
        assertEquals(thirdNode,popLast);

    }
    //uc 7 for search
    @Test
    public void testForSearch() {
        System.out.println("This is test method for searching an element of the list.");
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        LinkedList LinkedList = new LinkedList();
        LinkedList.add(firstNode);
        LinkedList.append(secondNode);
        LinkedList.append(thirdNode);
        Node<Integer> search = (Node<Integer>) LinkedList.search(30);
        
        assertEquals(secondNode, search);
    }

    //uc8 for search and insert
    @Test
    public void testForSearchAndInsert() {
        System.out.println("This is test method for searching and inserting an element in the list.");
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        LinkedList LinkedList = new LinkedList();
        LinkedList.add(firstNode);
        LinkedList.append(secondNode);
        LinkedList.append(thirdNode);
        LinkedList.print();
        Node<Integer> fourthNode = new Node<Integer>(40);
        Node<Integer> searchAndInsert = (Node<Integer>) LinkedList.searchAndInsert(30, fourthNode);
        LinkedList.print();
        assertEquals(secondNode, searchAndInsert);
    }

    //uc9 to delete in between
    @Test
    public void testForSearchAndRemove() {
        System.out.println("This is test method for searching and removing an element from the list.");
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(40);
        Node<Integer> fourthNode = new Node<Integer>(70);
        LinkedList LinkedList = new LinkedList();
        LinkedList.add(firstNode);
        LinkedList.append(secondNode);
        LinkedList.append(thirdNode);
        LinkedList.append(fourthNode);
        LinkedList.print();
        Node<Integer> searchAndRemove = (Node<Integer>) LinkedList.searchAndRemove(40);
        System.out.print("Search and Remove! \nSize = " + LinkedList.Resize() + "\n");
        LinkedList.print();
        assertEquals(secondNode, searchAndRemove);
    }




}
