package com.assignmentday14;

import java.util.LinkedList;

public class MyQueueOps {
    LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(Integer data){
        list.addLast(data);
        System.out.println(list);
    }
    public void dequeue(){
        list.pollFirst();
        System.out.println(list);
    }

    public void printer(){
        System.out.println(list);
    }
}
