/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionconversion_using_stack_from_array;

/**
 *
 * @author Hp
 */
public class Expression
{
    Stack<Character> s;
    String solpost="";
    String solpre="";
    public Expression(int a){
    s= new Stack<>(a);
    }
    public void infixToPostFix(String a){
        
      for(int i = 0;i<a.length();i++){
        if(a.charAt(i)=='('){
           s.push(a.charAt(i));
        }
        else if(a.charAt(i)==')'){
            char ch = s.pop();
            while(ch!='('){
            solpost=solpost+ch;
             ch=s.pop();
            } 
        }
        else if(Character.isDigit(a.charAt(i))||Character.isLetter(a.charAt(i))){
            solpost=solpost+a.charAt(i);
        }
        else{
            if(this.prec(s.peek())>=this.prec(a.charAt(i))){
                while(this.prec(s.peek())>=this.prec(a.charAt(i))){
                    solpost=solpost+s.pop();
                }
            }
            else{
                s.push(a.charAt(i));
            }
        }
      }
      
    }
    public void infixToPrefix(String a){
        a=this.reverse(a);
      for(int i = 0;i<a.length();i++){
        if(a.charAt(i)=='('){
           s.push(a.charAt(i));
        }
        else if(a.charAt(i)==')'){
            char ch = s.pop();
            while(ch!='('){
            solpre=solpre+ch;
             ch=s.pop();
            } 
        }
        else if(Character.isDigit(a.charAt(i))||Character.isLetter(a.charAt(i))){
            solpre=solpre+a.charAt(i);
        }
        else{
            if(this.prec(s.peek())>=this.prec(a.charAt(i))){
                while(this.prec(s.peek())>=this.prec(a.charAt(i))){
                    solpre=solpre+s.pop();
                }
            }
            else{
                s.push(a.charAt(i));
            }
        }
      }
      solpre=this.reverse(solpre);
    }
    public int prec(char a){
     if(a=='^'){
      return 3;   
     }
     else if(a=='*'||a=='/'){
         return 2;
     }
     else if(a=='+'||a=='-'){
        return 1; 
     }
     else{
         return 0;
     }
    }
    public String reverse(String a){
        String b = "";
     for(int i = a.length()-1;i>=0;i--){
      if(a.charAt(i)=='('){
          b=b+')';
      }
      else if(a.charAt(i)==')'){
          b=b+'(';
      }
      else{
       b=b+a.charAt(i);
      }
     }
     return b;
    }
    public void printPrefix(){
        System.out.println("Prefix: "+solpre);
    }
    public void printPostfix(){
        System.out.println("Postfix: "+solpost);
    }
   
}
