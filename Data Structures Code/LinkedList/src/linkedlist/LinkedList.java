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
public class LinkedList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        LinkedList_code<Integer> l = new LinkedList_code();
        l.insertAtStart(2);
        l.insertAtEnd(4);
        l.insertAtEnd(6);
        l.insertAtEnd(7);
        l.insertAtStart(5);
        l.insertAfter(7, 9);
        l.deleteAtStart();
        l.deleteAtEnd();
        l.deleteNode(5);
        boolean a = l.search(8);
        System.out.println(a);
        l.deleteNode(4);
        l.print();
  
     
    }
    
}
