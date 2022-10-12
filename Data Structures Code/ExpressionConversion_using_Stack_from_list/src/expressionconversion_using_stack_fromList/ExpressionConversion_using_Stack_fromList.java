/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionconversion_using_stack_fromList;

/**
 *
 * @author Hp
 *///import java.util.Scanner;
public class ExpressionConversion_using_Stack_fromList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        String exp = "((((K+L)-(M*N))+(((((O^P)*W)/U)/V)*T))+Q)";
        Expression e = new Expression();
        e.infixToPreFix(exp);
        e.infixToPostFix(exp);
        e.printpre();
        e.printpost();
    }
    
}
