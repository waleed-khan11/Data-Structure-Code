/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expression_evaluation_pre;

/**
 *
 * @author Hp
 */
public class Stack<T>
{
    class node{
    T data;
    node next;
}
    node start;
    public void push(T val){
        node n = new node();
        n.data=val;
        if(start==null)
            start=n;
        else{
            n.next=start;
            start=n;
        }
    }
    public T pop(){
        if(start==null){
            System.out.println("list empty");
            return null;
        }
        else{
            T val = start.data;
            start=start.next;
            return val;
        }
    }
    public T peek(){
        return start.data;
    }
}
