package org.dsa.LinkedList;

class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}
class SinglyLinkedList{
    private Node head;
    // Insert at start
    void insertStart(int val){
        Node node = new Node(val);
        if(head ==  null)
        {
            head = node;
        }
        else{
            Node curr = head;
            head = node;
            head.next = curr;
        }
    }
    // Insert at end
    void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
        }
        else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = node;
        }
    }
    // Insert at any position
    void insertPos(int val, int pos){
        if(pos < 0){
            System.out.println("Position not valid");
            return;
        }
        if(pos == 1){
            insertStart(val);
            return;
        }
        Node newNode = new Node(val);
        Node curr = head;
        for(int i =1; i < pos -1 && curr != null; i++){
            curr = curr.next;
        }

        if(curr == null){
            System.out.println("Position out of range");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class SinglyList {
    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();
        s.insert(11);
        s.insert(43);
        s.insert(54);
        s.insert(97);
        s.insertStart(8);
        s.insertPos(14,3);
        s.display();
    }
}
