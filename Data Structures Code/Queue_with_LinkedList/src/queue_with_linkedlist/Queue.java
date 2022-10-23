/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_with_linkedlist;

/**
 *
 * @author Hp
 */
public class Queue<T>
{
    class node{
        T data;
        node next;
    }
    node start;
    int count;
    public boolean isEmpty(){
      if(start==null)
          return true;
      return false;
    }
    public void enqueue(T value){
        node n = new node();
        n.data=value;
        if(start==null)
        start=n;
        else{
        node _t=start;
        while(_t.next!=null){
        _t=_t.next;
        }
        _t.next=n;
        }
    count++;
    } 
    public T dequeue(){
        if(start==null)
            return null;
        else{
            T value = start.data;
           start=start.next;
           count --;
           return value;
        
        }
    }
    public T peek(){
        return start.data;
    }
    public int size(){
        return count;
    }
    public void print(){
        if(start==null){
            System.out.println("Queue is Empty");
        }
        else{
            node _t=start;
            System.out.print("Start<=");
            while(_t!=null){
            System.out.print(_t.data+"<=");
            _t=_t.next;
            }
            System.out.println("End");
        }
    }
}
