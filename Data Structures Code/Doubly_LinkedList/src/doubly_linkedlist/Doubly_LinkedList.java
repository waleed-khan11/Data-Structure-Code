/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubly_linkedlist;

/**
 *
 * @author Hp
 */
public class Doubly_LinkedList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        LinkedList<Integer> l = new LinkedList();
        l.insertAtStart(2);
        l.insertAtStart(3);
        l.insertAtStart(5);
        l.insertAtStart(6);
        l.insertAtEnd(9);
        l.insertAtEnd(100);
        l.print();
        l.deleteAtEnd();
        boolean t=l.search(0);
        System.out.println(t);
        l.deleteAtStart();
        l.print();
        l.insertAtEnd(32);
        l.print();
        l.insertAtStart(5);
        l.deleteAtEnd();
        l.insertAfter(100,29 );
        System.out.println(l.End.previous.data);
        System.out.println(l.End.data);
        l.insertAtEnd(14);
        l.print();
        l.print();
        System.out.println(l.End.data);
        l.deleteAtEnd();
        l.print();
        l.deleteNode(100);
        System.out.println(l.Start.data+" ");
        l.print();
    }
    
}
