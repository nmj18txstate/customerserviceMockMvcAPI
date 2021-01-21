package com.galvanize;

import java.util.Objects;

/*
    Node

    Nodes are the individual units contained in a data structure.

    A node is a value object, representing any type of value and
    providing a reference to the next node.
 */
public class Node{

    public String data;
    //public Node next;

    public Node(int x){
        data = String.valueOf(x);
    }

    public Node(String a) {
        data = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return data.equals(node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    public String getValue() {
        return data;
    }

    //Node next;
}
