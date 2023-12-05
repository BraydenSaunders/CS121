package StacksAndQueuesActivity;

import java.util.ArrayList;

public class MyQueue {
    ArrayList<Integer> queue = new ArrayList<>();

    public void setQueue (int element){
        this.queue.add(element);
    }
    public int dequeue(int i){
        this.queue.remove(i);
        return (i);
    }
}
