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
public class Priorty_Queue
{

    MyQueue<Integer> High = new MyQueue(10);
    MyQueue<Integer> Mediam = new MyQueue(10);
    MyQueue<Integer> Low = new MyQueue(10);

    public void enqueue(int value, int priorty)
    {
        if (priorty == 0)
        {
            if (High.isFull())
            {
                if (Mediam.isFull())
                {
                    Low.enqueue(value);
                } else
                {
                    Mediam.enqueue(value);
                }

            } else
            {

                High.enqueue(value);
            }

        } else if (priorty == 1)
        {
            if (Mediam.isFull())
            {
                Low.enqueue(value);
            } else
            {
                Mediam.enqueue(value);
            }
        } else
        {
            Low.enqueue(value);
        }
    }

    public int dequeue()
    {
        if (!High.isEmpty())
        {
            return High.dequeue();
        } else if (!Mediam.isEmpty())
        {
            return Mediam.dequeue();
        } else
        {
            return Low.dequeue(); 
        }

    }
    public void print(){
        
        System.out.print("High Priorty Queue: ");
        High.print();
        System.out.print("Mediam Priorty Queue: ");
        Mediam.print();
        System.out.print("Low Priorty Queue: ");
        Low.print();
        
       
    }

}
