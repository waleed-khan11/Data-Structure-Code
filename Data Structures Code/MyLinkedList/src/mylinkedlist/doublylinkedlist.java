/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author Hp
 */
public class doublylinkedlist<T>
{
    class Node{
        T data;
        Node next;
        Node previous;
    }
    Node Start;
    Node End;
    public void insertAtStart(T Value){
        Node n= new Node();
        n.data= Value;
        if(Start==null){
        Start=End=n;   
        }
        else{
         n.next=Start;
         Start.previous=n;
         Start=n;
         Start.previous=null;
        }        
    }
    public T deleteAtStart(){
        if(Start==null){
         return null;   
        }
        else{
        if(Start==End){
          T value = Start.data;
          Start=End=null;
          return value;
        }
        else{
         T value = Start.data;
         Start=Start.next;
         return value;
        }
        }
    }
    public void print(){
        if(Start==null){
            return;
        }
        else{
     Node t=Start;
     while(t!=null){
         System.out.print(t.data+"=>");
         t = t.next;
     }
        System.out.println("null");
    }
    }
    public void insertAtEnd(T Value){
     Node n = new Node();
     n.data=Value;
     n.next=null;
     n.previous=null;
     if(Start==null){
        Start=End=n; 
     }
     else if(Start==End){
      End.next=n;
      End=n;
      End.previous=Start;
     }
     else{
      Node _t1=Start,_t2=null;
      while(_t1.next!=null){ //Q
       _t2=_t1;
       _t1=_t1.next;
      }
      End.next=n;
      n.previous=End;
      End=n;
     }
     
     }
 
    public boolean search(T Key){
      if(Start ==null){
        return false;  
      }
      else{
         Node t=Start; 
         while(t!=null){
           if(t.data==Key){
             return true;  
           }
           t=t.next;
         }
         return false;
       }
      }
    public T deleteAtEnd(){
    if(Start==null){
        System.out.println("List is empty");
        return null;
    }
    else if(Start==End){
    T Value =End.data;
    Start=End=null;
    return Value;
    }
    else{
     T Value = End.data;
     End=End.previous;
     End.next=null;
     return Value;
    }    
    }
    public void insertAfter(T Key,T Value){
     if(Start==null){
      return;   
     }
     else{
       Node _t1 =Start;
       while (_t1!=null){
       if(_t1.data==Key){
         Node n = new Node();
         n.data=Value;
         if(_t1==End){
         End.next=n;
         n.previous=End;
         End=n;//Q
         End.next=null;
         }
         else{
         n.next=_t1.next;
         _t1.next.previous=n;
         _t1.next=n;
         n.previous=_t1;
         }
       }
       _t1=_t1.next;
      }
      
     }
    }
    public T deleteNode(T Key){
     if(Start==null){
      return null;
     }
     else{
      Node _t1=Start;
      while(_t1!=null){
      if(_t1.data==Key){
      if(_t1==Start){
      T Value = Start.data;
      Start=Start.next;
      Start.previous=null;
      }
      else if(_t1==End){
      T Value=End.data;
      End=End.previous;
      End.next=null;
      return Value;
       }
      else{
      T Value =_t1.data;
      _t1.previous.next=_t1.next;
      _t1.next.previous=_t1.previous;
      _t1=null;
      return Value;
      }
      }
      _t1=_t1.next;
             
      }
      return null;
      }
      }
      }

