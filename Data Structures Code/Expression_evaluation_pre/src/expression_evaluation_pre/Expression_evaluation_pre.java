/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expression_evaluation_pre;

/**
 *
 * @author Hp
 */
public class Expression_evaluation_pre
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        String exp = "+ - 9 2 * / 4 2 1";
        String[] arr=exp.split(" ");
        Expression e = new Expression();
        e.program(arr);
        e.print();
    }
    
}
