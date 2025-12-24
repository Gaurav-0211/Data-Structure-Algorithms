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
        s.display();
    }
}
