/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionconversion_using_stack_fromList;

/**
 *
 * @author Hp
 */
public class Expression
{
    Stack<Character> s = new Stack<>();
    String solpost = "";
    String solpre="";
    

    public void infixToPreFix(String a)
    {
     a=this.reverse(a);
     for(int i = 0;i<a.length();i++){
     char ch = a.charAt(i);
     if(ch=='('){
      s.push(ch);
     }
     else if(ch==')'){
      char temp=s.pop();
      while(temp!='('){
       solpre=solpre+temp;
       temp=s.pop();
      }
     }
     else if(Character.isDigit(ch)||Character.isLetter(ch)){
        solpre=solpre+ch;
     }
     else{
         while(this.prec(s.peek())>=this.prec(ch)){
             solpre=solpre+s.pop();
             }
          s.push(ch);
    }
     }
    solpre=this.reverse(solpre);
    }
    public void infixToPostFix(String a){
     for(int i = 0;i<a.length();i++){
         
         if(a.charAt(i)=='('){
             s.push(a.charAt(i));
         }
         else if(a.charAt(i)==')'){
            char ch=s.pop();
             while(ch!='('){
                 solpost=solpost+ch;
                 ch=s.pop();
             }
         }
         else if(Character.isLetter(a.charAt(i))||Character.isDigit(a.charAt(i))){
             solpost=solpost+a.charAt(i);
         }
         else {
             if(this.prec(a.charAt(i))>this.prec(s.peek())){
                 s.push(a.charAt(i));
             }
             else{
                 while(this.prec(s.peek())>=this.prec(a.charAt(i))){
                 solpost=solpost+s.pop();
                 }
             }
         }
     }   
    }


    public int prec(char a)
    {
     if(a=='^')
      return 3;   
     
     else if(a=='*'||a=='/')
         return 2;
     else if(a=='+'||a=='-')
         return 1;
     else
         return 0;
    }
   public String reverse(String a){
      String b="";
   for(int i = a.length()-1;i>=0;i--){
      if(a.charAt(i)=='('){
       b=b+")";   
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
    public void printpre(){
    System.out.println("Prefix: "+solpre);    
    }
    public void printpost(){
    System.out.println("Postfix: "+solpost);    
    }
}









