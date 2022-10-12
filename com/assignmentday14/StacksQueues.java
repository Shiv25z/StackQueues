package com.assignmentday14;

public class StacksQueues {
    public static void main(String[] args) {
        System.out.println("Welcome to StackQueue Problem");
        MyStackOps stack = new MyStackOps();// UC1
        stack.push(70);
        stack.push(30);
        stack.push(56);


        stack.printer();// UC2
        stack.peek();
        stack.pop();
        stack.printer();


        MyQueueOps queue = new MyQueueOps();// UC3
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        queue.printer();
        queue.dequeue();//UC4
    }
}
