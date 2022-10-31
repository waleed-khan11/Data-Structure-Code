/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solving_recursion;

/**
 *
 * @author Hp
 */
public class Recursion
{

    Stack<Integer> st = new Stack();
    Stack<Character> st1 = new Stack();

    public int Program(int a)
    {
        if (a == 0)
        {
            return 1;
        } else if (a < 0)
        {
            System.err.print("Wrong input\n");
            return 0;
        } else
        {
            st.push(a);
            for (int i = a; i >= 2; i--)
            {
                st1.push('*');
                st.push(i - 1);
            }
            while (!st1.isEmpty())
            {
                st.push(st.pop() * st.pop());
                st1.pop();
            }
            return st.pop();
        }
    }
}


