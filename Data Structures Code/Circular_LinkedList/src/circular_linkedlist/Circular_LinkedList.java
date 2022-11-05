/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular_linkedlist;

/**
 *
 * @author Hp
 */
public class Circular_LinkedList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        LinkedList<Integer> l = new LinkedList();
        l.insertAtStart(1);
        l.insertAtStart(2);
        l.insertAtStart(3);
        l.insertAtStart(4);
        l.insertAtStart(6);
        l.insertAtStart(7);
        l.insertAtStart(11);
        l.insertAtStart(12);
        l.insertAtEnd(5);
        l.insertAfter(5, 8);
        l.deleteAtStart();
        l.deleteAtEnd();
        l.deleteNode(5);
        System.out.println(l.End.data);
        System.out.println(l.Start.next.data);
        l.print();
        System.out.println(l.Search(6));
    }
    
}
