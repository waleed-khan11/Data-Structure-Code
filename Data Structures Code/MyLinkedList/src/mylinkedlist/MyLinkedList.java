/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author Hp
 */
public class MyLinkedList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //TODO code application logic here
        //LinkedList<Integer> l = new LinkedList<Integer>();
        //l.insertAtStart(2);
        //l.insertAtEnd(4);
        //l.insertAtEnd(6);
        //l.insertAtEnd(7);
        //l.insertAtStart(5);
        //l.insertAfter(7, 9);
        //l.deleteAtStart();
        //l.deleteAtEnd();
        //l.deleteNode(5);
        //l.deleteNode(2);
        //l.deleteNode(4);
        //l.deleteNode(6);
        //l.deleteNode(7);
        //l.deleteNode(6);
        //boolean a = l.search(9);
        //System.out.println(a);
        //l.print();
        //doublylinkedlist<Integer> l1 = new doublylinkedlist();
        //l1.insertAtStart(2);
        //l1.insertAtStart(3);
        //l1.insertAtStart(5);
        //l1.insertAtStart(6);
        //l1.insertAtEnd(9);
        //l1.insertAtEnd(100);
        //l1.print();
        //System.out.println("Previous value is "+a);
        //l1.deleteAtEnd();
        //boolean t=l1.search(0);
        //System.out.println(t);
        //l1.deleteAtStart();
        //l1.print();
        //l1.insertAtEnd(32);
        //l1.print();
        //l1.insertAtStart(5);
        //l1.deleteAtEnd();
        //l1.insertAfter(100,29 );
        //System.out.println(l1.End.previous.data);
        //System.out.println(l1.End.data);
        //l1.insertAtEnd(14);
        //l1.print();
        //l1.print();
        //System.out.println(l1.End.data);
        //l1.deleteAtEnd();
        //l.print();
        //l.deleteNode(100);
        //System.out.println(l.Start.data+" ");
        //l.print();
        Circularlinkedlist<Integer> l2 = new Circularlinkedlist();
        l2.insertAtStart(1);
        l2.insertAtStart(2);
        l2.insertAtStart(3);
        l2.insertAtStart(4);
        l2.insertAtStart(6);
        l2.insertAtStart(7);
        l2.insertAtStart(11);
        l2.insertAtStart(12);
        l2.insertAtEnd(5);
        l2.insertAfter(5, 8);
        l2.deleteAtStart();
        l2.deleteAtEnd();
        l2.deleteNode(5);
        System.out.println(l2.End.data);
        System.out.println(l2.Start.next.data);
        l2.print();
        System.out.println(l2.Search(6));
    }

}
