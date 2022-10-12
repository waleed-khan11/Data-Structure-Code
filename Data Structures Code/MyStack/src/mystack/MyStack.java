/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

/**
 *
 * @author Hp
 */
public class MyStack
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //StackFromArray<Integer> a = new StackFromArray();
        //a.push(3);
        //a.push(4);
        //a.push(6);
        //a.push(7);
        //a.push(8);
        //a.push(9);
        //a.push(8);
        //a.push(5);
        //a.push(1);
        //a.push(2);
        //a.push(6);
        //a.pop();
        //a.pop();
        //System.out.println(a.Size());
        //a.print();
        StackFromLinkedList<Integer> l = new StackFromLinkedList();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        l.push(5);
        l.pop();
        System.out.println(l.peek());
        l.print();
        //System.out.println( l.Size());
    }
    
}
