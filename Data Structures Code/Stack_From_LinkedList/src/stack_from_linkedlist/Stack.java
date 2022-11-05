/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_from_linkedlist;

/**
 *
 * @author Hp
 */
public class Stack<T>
{

    class Node
    {

        T data;
        Node next;
    }
    Node Start = null;
    int count = 0;

    private boolean isEmpty()
    {
        if (Start == null)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public void push(T Value)
    {
        Node n = new Node();
        n.data = Value;
        n.next = Start;
        Start = n;
        count++;
    }

    public T pop()
    {
        if (this.isEmpty())
        {
            return null;
        } else
        {
            T value = Start.data;
            Start = Start.next;
            count--;
            return value;
        }
    }

    public T peek()
    {
        if (this.isEmpty())
        {
            return null;
        } else
        {
            return Start.data;
        }
    }

    public int Size()
    {
        return count;
    }

    public void print()
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return;
        } else
        {
            Node t = Start;
            while (t != null)
            {
                System.out.print(t.data + "=>");
                t = t.next;
            }
            System.out.println("null");
        }
    }
}
