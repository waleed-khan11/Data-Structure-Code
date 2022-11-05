/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Hp
 */
public class LinkedList_code<T>
{

    class Node
    {

        T data;
        Node next;
    }
    Node Start;

    public void insertAtStart(T Value)
    {
        Node n = new Node();
        n.data = Value;
        if (Start == null)
        {
            Start = n;
        } else
        {
            n.next = Start;
            Start = n;
        }
    }

    public void insertAtEnd(T Value)
    {
        Node n = new Node();
        n.data = Value;
        if (Start == null)
        {
            n.next = Start;
            Start = n;
        } else
        {
            Node _t1 = Start;
            while (_t1.next != null)
            {
                _t1 = _t1.next;
            }
            _t1.next = n;

        }
    }

    public void insertAfter(T Key, T Value)
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return;
        } else
        {
            Node _t = Start;
            while (_t != null)
            {
                if (_t.data == Key)
                {
                    Node n = new Node();
                    n.data = Value;
                    n.next = _t.next;
                    _t.next = n;
                    return;
                }
                _t = _t.next;
            }
            System.out.println("Key not found");
        }
    }

    public T deleteAtStart()
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return null;
        } else
        {
            T value = Start.data;
            Start = Start.next;
            return value;
        }
    }

    public T deleteAtEnd()
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return null;
        } else
        {
            Node _t1 = Start;
            Node _t2 = null;
            while (_t1.next != null)
            {
                _t2 = _t1;
                _t1 = _t1.next;
            }
            T Value = _t1.data;
            _t2.next = null;
            return Value;
        }
    }

    public T deleteNode(T Key)
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return null;
        } else
        {
            Node _t1 = Start, _t2 = null;
            while (_t1 != null)
            {
                if (_t1 == Start)
                {
                    if (_t1.data == Key)
                    {
                        Start = Start.next;
                        return Key;
                    }
                } else
                {
                    if (_t1.data == Key)
                    {
                        _t2.next = _t1.next;
                        _t1.next = null;
                        return Key;
                    }
                }
                _t2 = _t1;
                _t1 = _t1.next;
            }

        }
        System.out.println("Key Not Found");
        return null;
    }

    public boolean search(T Key)
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return false;
        } else
        {
            Node _t = Start;
            while (_t != null)
            {
                if (_t.data == Key)
                {
                    return true;
                }
                _t = _t.next;
            }
            return false;
        }
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
