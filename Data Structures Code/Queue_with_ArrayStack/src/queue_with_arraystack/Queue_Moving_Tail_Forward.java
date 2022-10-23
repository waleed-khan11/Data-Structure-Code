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
public class Queue_Moving_Tail_Forward<T>
{

    T[] arr = (T[]) new Object[10];
    int tail = -1;

    public boolean isFull()
    {
        if (tail == arr.length - 1)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty()
    {
        if (tail == -1)
        {
            return true;
        }
        return false;
    }
    
    public T peek(){
        return arr[0];
    }
    public int Size(){
        return tail+1;
    }
    public void enqueue(T val){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else{
            tail++;
            arr[tail]=val;
        }
    }
    public T dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        else{
            
            T val = arr[tail];
            this.moveForward();
            return val;
        }
    }
    public void moveForward(){
        for(int i = 0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        tail--;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.print("Start=");
            for(int i = 0;i<=tail;i++){
                System.out.print(arr[i]+"=");
            }
            System.out.println("End");
        }
    }
}