/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionconversion_using_stack_from_array;

/**
 *
 * @author Hp
 */
public class Stack<T>
{
    T[]arr;
    int top=-1;
    public Stack(int a){
    arr=(T[]) new Object[a];    
    }
    public void push(T value){
        if(top==arr.length-1){
            System.out.println("Stack Full"); 
        }
        else{
        top++;
        
        arr[top]=value;
        }
    }
    public T pop(){
        if(top==-1){
        return null;
        }
        else{        
      T val = arr[top];
      top--;
      return val;
        }
    }
    public T peek(){
        return arr[top];
    }
    public int size(){
        return top+1;
    }
    public void print(){
      for(int i = top;i>=0;i--){
          System.out.println("|"+arr[i]+"|");   
      }  
    }
    
}
