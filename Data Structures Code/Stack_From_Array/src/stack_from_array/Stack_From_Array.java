/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_from_array;

/**
 *
 * @author Hp
 */
public class Stack_From_Array
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
         Stack<Integer> s = new Stack();
        s.push(3);
        s.push(4);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(8);
        s.push(5);
        s.push(1);
        s.push(2);
        s.push(6);
        s.pop();
        s.pop();
        System.out.println(s.Size());
        s.print();
    }
    
}
