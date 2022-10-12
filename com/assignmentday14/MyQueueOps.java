package com.assignmentday14;

import java.util.LinkedList;

public class MyQueueOps {
    LinkedList<Integer> list = new LinkedList<>();

    public void offer(Integer data){
        list.addLast(data);
        System.out.println(list);
    }
    public void poll(){
        list.pollFirst();
        System.out.println(list);
    }

    public void printer(){
        System.out.println(list);
    }
}
