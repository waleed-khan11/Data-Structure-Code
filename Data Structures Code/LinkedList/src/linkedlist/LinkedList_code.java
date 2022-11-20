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

    //you must have a general idea of this data structure in order to understand code
    class Node  // class containing node objects
    {

        T data;          // data which will contain node value
        Node next;       // next is a reference variable which holds reference of the next node
    }
    Node Start;          // start holds the reference of the starting node

    public void insertAtStart(T Value) // for insertion of node at Start
    {
        Node n = new Node();           // create node object
        n.data = Value;                // assign value to the node 
        if (Start == null)             // when there is no node in the list 
        {
            Start = n;                 // assign start to node
        } else
        {
            n.next = Start;           // next of node refers to start
            Start = n;                // start then refers to n remember order is important
        }
    }

    public void insertAtEnd(T Value) // for insertion of node at end
    {
        Node n = new Node();
        n.data = Value;
        if (Start == null)           // if there is no inital node then we simple put it in start           
        {
            n.next = Start;
            Start = n;
        } else
        {
            Node _t1 = Start;        // temporary node
            while (_t1.next != null) // loop to find the end node
            {
                _t1 = _t1.next;      // move the temprory node to next node     
            }
            _t1.next = n;            // place node next to end node

        }
    }

    public void insertAfter(T Key, T Value) // for insertion after a key node
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return;
        } else
        {
            Node _t = Start;
            while (_t != null)              // search all the node in the list
            {
                if (_t.data == Key)         //when key node is found 
                {
                    Node n = new Node();
                    n.data = Value;
                    n.next = _t.next;       // next node  of n node refers to the next node of key node
                    _t.next = n;            // next of key node refers to n node
                    return;
                }
                _t = _t.next;
            }
            System.out.println("Key not found");
        }
    }

    public T deleteAtStart()  // for deletion at start
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return null;
        } else
        {
            T value = Start.data;      // assign value for return
            Start = Start.next;        //start will refer to the node next to start
            return value;              //return deletion node value
        }
    }

    public T deleteAtEnd()     // for deletion at end
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return null;
        } else
        {
            Node _t1 = Start;      // temporay node1 which will refer to start
            Node _t2 = null;       // temporary node2 which will refer to nothing
            while (_t1.next != null) // for finding end node
            {
                _t2 = _t1;          // t2 will always be one node behind of t1 so that we can find the second last node
                _t1 = _t1.next;
            }
            T Value = _t1.data;     //assign end node data
            _t2.next = null;        // next of second last node will refer to none 
            return Value;
        }
    }

    public T deleteNode(T Key)   // for deletion of any node
    {
        if (Start == null)
        {
            System.out.println("List is Empty");
            return null;
        } else
        {
            Node _t1 = Start, _t2 = null;   // same functionality as in last method
            while (_t1 != null)
            {
                if (_t1.data == Key) //when key node is found
                {
                    if (_t1 == Start)  //if it is in start
                    {
                        Start = Start.next;   
                        return Key;    // you can directly return the key
                    } else // works same for end and inbetween node
                    {
                        _t2.next = _t1.next; // next reference of t1 will assign to the next of t2
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

    public boolean search(T Key) // to search the presence of node
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

    public void print() // to print LinkedList 
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
