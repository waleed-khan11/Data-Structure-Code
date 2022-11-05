/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_from_linkedlist;

/**
 *
 * @author Hp
 */
public class Stack_From_LinkedList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        System.out.println(s.peek());
        s.print();
        System.out.println( s.Size());
    }
    
}
