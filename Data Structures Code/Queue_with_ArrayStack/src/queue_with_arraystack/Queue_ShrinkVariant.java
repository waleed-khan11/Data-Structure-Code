/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_with_arraystack;

/**
 *
 * @author Hp
 */
public class Queue_ShrinkVariant<T>
{
    T[] arr=(T[])new Object[10];
    int Head=-1,tail=-1;
    public boolean isfull(){
    if(tail==arr.length-1)
        return true;
        return false;
    }
    public boolean isEmpty(){
        if(Head==tail) 
            return true;
            return false;
    }
    public T peek(){
        if(isEmpty())
        return null;
        else
            return arr[Head+1];
    }
    public int size(){
        return tail-Head;
    }
    public void enqueue(T value){
        if(isfull()){
            System.out.println("Queue is full");
        }
        else{
            tail++;
            arr[tail]=value;
        }
    }
    public T dequeue(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return null;
    }
    else{
        Head++;
        return arr[Head];
    }    
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            for(int i = Head+1;i<=tail;i++){
                System.out.print(arr[i]+"=");
            }
        }
        System.out.println("End");
    }
    
}
