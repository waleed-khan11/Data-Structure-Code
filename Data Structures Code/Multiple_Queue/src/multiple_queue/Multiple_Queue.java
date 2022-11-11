/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple_queue;

/**
 *
 * @author Hp
 */
public class Multiple_Queue
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Priorty_Queue pq = new Priorty_Queue();
        pq.enqueue(10, 2);
        pq.enqueue(20, 2);
        pq.enqueue(30, 2);
        pq.enqueue(40, 1);
        pq.enqueue(50, 1);
        pq.enqueue(60, 0);
        pq.enqueue(70, 2);
        pq.enqueue(2, 0);
        pq.enqueue(3, 0);
        pq.enqueue(5, 2);
        pq.enqueue(11, 1);
        pq.enqueue(19, 1);
        pq.print();
    }

}
