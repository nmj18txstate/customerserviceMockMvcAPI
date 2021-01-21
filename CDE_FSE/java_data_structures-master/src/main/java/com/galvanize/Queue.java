package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Node> top;
    public Queue(){
        this.top=new ArrayList<Node>();
    }

    public void enqueue(Node x){
        top.add(x);
        //Node node = new Node(x);
        //Check if stack(heap) is full.
        if(top == null)
        {
            System.out.println("Heap Overflow");
            return;
        }
        System.out.println("Inserting " + x);

    }
    public boolean isEmpty(){
        if(top.isEmpty())
            return true;
        else
            return false; // top == null;
    }

    public int length(){
        //int count =0;
        int size = top.size();
        return size;
    }

    public Node getFront() {
        return top.get(0);
    }

    public Node getRear() {
        return top.get(top.size()-1);
    }

    public Node dequeue() {
        return top.remove(0);
    }
}
