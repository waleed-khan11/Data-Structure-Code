/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_with_linkedlist;

/**
 *
 * @author Hp
 */
public class Queue_with_LinkedList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(17);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.size());
        q.print();
    }
    
}
