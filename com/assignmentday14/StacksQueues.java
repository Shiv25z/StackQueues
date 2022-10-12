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


        MyQueueOps enqueue = new MyQueueOps();// UC3
        enqueue.offer(56);
        enqueue.offer(30);
        enqueue.offer(70);

        enqueue.printer();
        enqueue.poll();
    }
}
