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
public class Expression
{
    Stack<Float> st = new Stack<>();
    String op;
    float num1,num2;
    public void program(String[] a){
        for(int i = a.length-1;i>=0;i--){
          String c = a[i];
          try{
              float b = Float.parseFloat(c);
              st.push(b);
          }
          catch(NumberFormatException e){
              op=c;
              num1=st.pop();
              num2=st.pop();
              st.push(this.eval(op));
          }
        } 
    }
    
public float eval(String a){
    if(a.compareTo("/")==0)
        return num1/num2;
    else if(a.compareTo("*")==0)
        return num1*num2;
    else if(a.compareTo("+")==0)
        return num1+num2;
    else if(a.compareTo("-")==0)
        return num1-num2;
        else
        return 0;
}
public void print(){
    System.out.println("Answer: "+st.pop());
}
}
