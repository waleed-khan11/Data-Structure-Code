/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

/**
 *
 * @author Hp
 */
public class StackFromArray <T>
{
    T[]arr = (T[])new Object[10];
    int top = -1;
    private boolean isEmpty(){
        if(top==-1){
          return true;  
        }
        else 
         return false;   
    }
    private boolean isFull(){
      if(top==arr.length-1)
          return true;
      else 
          return false;
    }
    public void push(T value){
      if(this.isFull())
      System.out.println("Stack Overflow");
      else{
       top++;     
       arr[top]=value;       
       }
   }
    public T pop(){
      if(this.isEmpty()){
      System.out.println("Stack Overflow");   
      return null;
      }
      else{
       T value = arr[top];
       top--;
       return value;
      }
    }
    public T peek(){
      if(this.isEmpty()){
          System.out.println("Stack Underflow");
          return null;
      }
      else{
          return arr[top];
       }
      
    }
    public int Size(){
      return top+1;    
      }
    public void print(){
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        else{
        for(int i=top;i>=0;i--){
            System.out.println("|"+arr[i]+"|");
        }
        }
    }
}
