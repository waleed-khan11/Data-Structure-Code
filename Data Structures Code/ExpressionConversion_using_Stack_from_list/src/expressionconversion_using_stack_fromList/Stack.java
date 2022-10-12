/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionconversion_using_stack_fromList;

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
    public void push(T value){
     node n = new node();
     n.data=value;
     n.next=start;
     start=n;
    }
    public T pop(){
     if(start==null){
         System.out.println("list is empty");
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
