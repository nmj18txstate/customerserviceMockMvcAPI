package com.galvanize;

/*
  Linked List

  A linked list is a data structure that stores data sequentially by
  linking each item in the list to the next. It has the following properties:

  - head: the first item in the list
  - tail (optional) : last item in the list

  It's made up of items called Nodes, which contain 2 pieces of information:

  - value: any type or you can restrict to specific types
  - next: a reference to the next item in the list

  Nodes are usually added to the end of the list. Operations include:

  - Add node
  - Remove node
  - Find a node
  For example, suppose you have a LinkedList of numbers. It might look
  like so:

  * [] represents the 'value' attribute
  * -> represents the 'next' attribute
  * Together, []-> represents a Node

                    [100]-> [200]-> [300]-> null

  The Node with value 100 is the head. The Node with value 300 is the
  tail. Note how the tail points to nothing. Therefore null signifies
  the end of the list.
 */
import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public LinkedList() {
        top = new ArrayList<Node>();
    }

    private List<Node> top;
    public boolean isEmpty() {

        if(top.isEmpty())
            return true;
        else
            return false; // top == null;

    }

    public void addNode(Node node) {
            top.add(node);
            //Node node = new Node(x);
            //Check if stack(heap) is full.
            if(top == null)
            {
                System.out.println("Heap Overflow");
                return;
            }
            System.out.println("Inserting " + node);

        }

    public Node getHead() {
        return top.get(0); //getHead()
    }

    public int count() {
        int size = top.size();
        return size;
    }
}

