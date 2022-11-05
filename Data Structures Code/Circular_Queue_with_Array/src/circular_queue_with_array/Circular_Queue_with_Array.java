/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular_queue_with_array;

/**
 *
 * @author Hp
 */
public class Circular_Queue_with_Array
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Circular_Queue<Integer> q = new Circular_Queue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(9);
        q.enqueue(2);
        q.enqueue(1);
        q.enqueue(1);
        System.out.println(q.peek());
        q.print();
        
        }
    
}
