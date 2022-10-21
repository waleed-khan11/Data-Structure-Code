/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solving_recursion;

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
    public boolean isEmpty(){
        if(start==null)
            return true;
        else
            return false;
    }
    public void push(T val){
        node n  = new node();
        n.data=val;
        n.next=start;
        start=n;
    }
    public T pop(){
      if(start==null)
       return null;
      else{
       T val = start.data;
       start=start.next;
       return val;
      }
    }
    
}
