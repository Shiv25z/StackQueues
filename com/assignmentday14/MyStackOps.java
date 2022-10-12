package com.assignmentday14;

import java.util.LinkedList;

public class MyStackOps {
    LinkedList<Integer> list = new LinkedList<Integer>();
    public void push(Integer data){
        list.add(data);
    }
    public void printer(){
        System.out.println(list);
    }
    public void peek() {
        System.out.println(list.peek());
    }

    public void pop() {
        System.out.println( list.pop());

    }
}
