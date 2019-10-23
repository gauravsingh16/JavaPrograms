package com.bridgelabz.datastructure;
import java.util.Scanner;

import com.bridgelabz.Utility.*;

public class Parenthesis {
	static class stack  
    { 
        int top=-1; 
        int size;
        char items[] = new char[100]; 
        stack(int size)
        {
        	this.size=size;
        	items=new char[size];
        	top=-1;
        }
        void push(char x)  
        { 
            if (top == 99)  
            { 
                System.out.println("Stack full"); 
            }  
            else 
            { 
                items[++top] = x; 
            } 
        } 
  
        char pop()  
        { 
            if (top == -1)  
            { 
                System.out.println("Underflow error"); 
                return '\0'; 
            }  
            else 
            { 
                char element = items[top]; 
                top--; 
                return element; 
            } 
        } 
  
        boolean isEmpty()  
        { 
            return (top == -1); 
 
        } 
        int size()
        {
        	return (size=top+1);
        }
        int peek()
        {
        	if(!isEmpty())
        	{
        		return top;
        	}else
        		System.exit(1);
			return top;
        }
    } 
      
     boolean isMatchingPair(char character1, char character2) 
    { 
       if (character1 == '(' && character2 == ')') 
         return true; 
       else if (character1 == '{' && character2 == '}') 
         return true; 
       else if (character1 == '[' && character2 == ']') 
         return true; 
       else
         return false; 
    } 
      
     boolean areBalanced(char exp[]) 
    { 
       stack stack=new stack(100); 
       for(int i=0;i<exp.length;i++) 
       { 
          if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
            stack.push(exp[i]); 
          if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') 
          { 
             if (stack.isEmpty()) 
               { 
                   return false; 
               }  
       
             else if ( !isMatchingPair(stack.pop(), exp[i]) ) 
               { 
                   return false; 
               } 
          } 
            
       } 
       if (stack.isEmpty()) 
         return true; 
       else
         {   
             return false; 
         }  
	}
	public static void main(String[] args) {
		
		Parenthesis stack=new Parenthesis();
		Util util=new Util();
		System.out.println("Enter String");	
		String string=util.Scanner6();
		char[]arr=string.toCharArray();
			
		
		if(stack.areBalanced(arr))
		{
			System.out.println("Balanced");
		}else
		{
			System.out.println("Unbalanced");
		}
		
	}
	
	}


