/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expression_evaluation_post;

/**
 *
 * @author Hp
 */
public class Expression_Evaluation_post
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
     String a1 = "19 2 - 4 2 / 1 * +";
     String[] arr = a1.split(" ");
     Evaluation e = new Evaluation();
     e.program(arr);
     e.print();
    }
    
}
