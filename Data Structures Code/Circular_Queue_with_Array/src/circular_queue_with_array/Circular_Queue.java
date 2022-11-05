/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular_queue_with_array;

/**
 *
 * @author Hp
 */
public class Circular_Queue<T>
{

    T[] arr;
    int Head = -1, tail = -1;
    int a;

    public Circular_Queue(int a)
    {
        this.a = a;
        arr = (T[]) new Object[a];
    }

    public boolean isFull()
    {
        if (Head + a == tail)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty()
    {
        if (Head == tail)
        {
            return true;
        }
        return false;
    }

    public void enqueue(T value)
    {
        if (isFull())
        {
            System.out.println("Queue is full");
        } else
        {
            tail++;
            arr[tail % a] = value;
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
            Head++;
            return arr[Head % a];
        }
    }

    public int size()
    {
        return tail - Head;
    }

    public T peek()
    {
        if (isEmpty())
        {
            return null;
        }
        return arr[(Head + 1) % a];
    }

    public void print()
    {
        if (isEmpty())
        {
            return;
        } else
        {
            System.out.print("Start<=");
            for (int i = (Head + 1) % a; i <= tail % a; i++)
            {
                System.out.print(arr[i] + "<=");
            }
            System.out.println("End");
        }
    }
}
