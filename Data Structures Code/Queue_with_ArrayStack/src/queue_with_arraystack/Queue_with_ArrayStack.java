/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_with_arraystack;

/**
 *
 * @author Hp
 */
public class Queue_with_ArrayStack
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
//        Queue_ShrinkVariant q = new Queue_ShrinkVariant();

//        q.enqueue(4);
//        q.enqueue(5);
//        q.enqueue(6);
//        System.out.println(q.size());
//        q.enqueue(7);
//        q.enqueue(8);
//        q.enqueue(9);
//        q.enqueue(2);
//        q.enqueue(4);
//        q.enqueue(2);
//        q.enqueue(3);
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.dequeue();
//        q.print();
//        
    Queue_Moving_Tail_Forward q1 = new Queue_Moving_Tail_Forward();
    q1.enqueue(3);
    q1.enqueue(5);
    q1.enqueue(6);
    q1.enqueue(7);
    q1.enqueue(8);
    q1.enqueue(9);
    q1.enqueue(45);
    q1.enqueue(23);
    q1.enqueue(213);
    q1.enqueue(69);
    q1.dequeue();
    q1.dequeue();
    q1.dequeue();
    System.out.println(q1.Size());
    q1.print();
    
    }
    
}
