package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    //private Node top;
    private List<Node> top;
    public Stack(){

        this.top=new ArrayList<Node>();;
    }

    public void push(Node x){
        //Allocate a new node in the heap
        top.add(x);
        //Node node = new Node(x);
        //Check if stack(heap) is full.
         if(top == null)
         {
             System.out.println("Heap Overflow");
             return;
         }
         System.out.println("Inserting " + x);

        //Setting data in allocated node
        //top.data = x;
        //top.next = top;//Set the .next pointer ot the new top node of the list

        //update the to ppointer
        //top = node;
    }
    public boolean isEmpty(){
        if(top.isEmpty())
        return true;
        else
        return false; // top == null;
    }

    public int count(){
        //int count =0;
        int size = top.size();
        return size;
    }

    public Node pop(){

        return top.remove(top.size()-1);

    }
    public Node peek(){
        return top.get(top.size()-1);
    }
}
