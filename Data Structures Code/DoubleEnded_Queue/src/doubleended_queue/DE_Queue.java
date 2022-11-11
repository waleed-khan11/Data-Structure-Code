/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleended_queue;

/**
 *
 * @author Hp
 */
public class DE_Queue<T>
{

    T[] arr;
    int tail = -1;

    public DE_Queue(int a)
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

    public int size()
    {
        return tail + 1;
    }

    public T peek()
    {
        return arr[0];
    }

    public void enqueueAtTail(T value)
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

    public void enqueueAtHead(T value)
    {
        if (isFull())
        {
            System.out.println("Queue is Full");
        } else
        {
            this.moveBackward();
            arr[0] = value;
        }
    }

    public T dequeueAtTail()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        } else
        {
            T val = arr[tail];
            tail--;
            return val;
        }
    }

    public T dequeueAtHead()
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

    public void moveBackward()
    {
        for (int i = tail; i >= 0; i--)
        {
            arr[i + 1] = arr[i];
        }
        tail++;
    }

    public void moveForward()
    {
        for (int i = 0; i <tail; i++)
        {
            arr[i] = arr[i + 1];
        }
        tail--;
    }

    public void print()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
        } else
        {
            System.out.print("Start <=");
            for (int i = 0; i <= tail; i++)
            {
                System.out.print(arr[i] + "<=");
            }
            System.out.println("End");
        }
    }
}
