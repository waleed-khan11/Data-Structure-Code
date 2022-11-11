/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple_queue;

/**
 *
 * @author Hp
 */
public class MyQueue<T>
{

    T[] arr;
    int tail = -1;

    public MyQueue(int a)
    {
        arr = (T[]) new Object[a];
    }

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

    public void enqueue(T value)
    {
        if (isFull())
        {
            System.out.println("Queue is Full");
        } else
        {
            tail++;
            arr[tail] = value;
        }
    }

    public T dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        } else
        {
            T val = arr[0];
            this.moveForward();
            return val;
        }
    }

    public void moveForward()
    {
        for (int i = 0; i < tail; i++)
        {
            arr[i] = arr[i + 1];
        }
        tail--;
    }

    public int size()
    {
        return tail + 1;
    }

    public T peek()
    {
        return arr[0];
    }

    public void print()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
        } else
        {
            System.out.print("Start<=");
            for (int i = 0; i <= tail; i++)
            {
                System.out.print(arr[i] + "<=");
            }
            System.out.println("End");
        }
    }

}
