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
public class DoubleEnded_Queue
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        DE_Queue<Integer> q  = new DE_Queue(10);
        q.enqueueAtHead(2);
        q.enqueueAtTail(3);
        q.enqueueAtHead(3);
        q.dequeueAtTail();
        q.enqueueAtTail(3);
        q.enqueueAtTail(4);
        q.enqueueAtHead(9);
        q.enqueueAtHead(3);
        q.enqueueAtHead(94);
        q.enqueueAtHead(11);
        q.enqueueAtTail(236);
        q.enqueueAtHead(2);
        System.out.println(q.size());
         
        q.print();
        
    }
    
}
