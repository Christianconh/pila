/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christian
 */


public class pila {
    static String arrp[]= new String[10];
    
    static int top = 0;
    
    public pila()
    {
  
    }
    
    public static boolean empty()
    {
        if(top == 0)
        {
            System.out.println("La pila está vacía");
            return true;
        }
        else
        {
            System.out.println("La pila contiene elementos");
            return false;
        }
    }
    
    public static boolean push(String item) 
    {
        if(top < arrp.length)
        {
            arrp[top] = item;
            top++;
            return true;
        }
        else
            return false;
        
    }
    
    
    public static String top()
    {
        if(arrp.length != 0)
        {
            return arrp[top-1];
        }
        else
        {
            throw new RuntimeException("No hay elementos");
        }       
    }
    
    public static String pop()
    {
        String aux = null;
        
             if(top > 0)
            {
                aux = arrp[top-1];
                arrp[top-1] = null;
                top--;
                return aux;
            }        
            
          else{
            throw new RuntimeException("No hay elementos");
        }
       
    }

    public static class StackEmptyException extends Exception {

        public StackEmptyException() {
        }
    }
}
