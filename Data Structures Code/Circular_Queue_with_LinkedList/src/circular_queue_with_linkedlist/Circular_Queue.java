/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular_queue_with_linkedlist;

/**
 *
 * @author Hp
 */
public class Circular_Queue<T>
{

    class node
    {

        T data;
        node next;
    }
    node start;
    node end;
    int count;

    public boolean isEmpty()
    {
        if (start == null)
        {
            return true;
        }
        return false;
    }

    public void enqueue(T value)
    {
        node n = new node();
        n.data = value;
        if (start == null)
        {
            start = end = n;
        } else
        {
            end.next = n;
            end = n;
            end.next = start;
        }
        count++;
    }

    public T dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        } else if (start == end)
        {
            T val = start.data;
            start = end = null;
            count--;
            return val;
        } else
        {
            T val = start.data;
            start = start.next;
            end.next = start;
            count--;
            return val;
        }
    }

    public int size()
    {
        return count;
    }

    public T peek()
    {
        return start.data;
    }

    public void print()
    {
        node _t = start;
        System.out.print("Start<=");
        do
        {
            System.out.print(_t.data + "<=");
            _t = _t.next;
        } while (_t != start);
        System.out.println("End");
    }
}
