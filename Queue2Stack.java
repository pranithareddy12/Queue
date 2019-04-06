import java.io.*;
import java.util.*;

public class Queue2Stack {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int noElements = in.nextInt();
        
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        int command;
        
        for (int i = 0 ; i < noElements ; i++) {
            command = in.nextInt();
            
            if (command == 1)
            {
                s1.push(in.nextInt());
            } 
            else if (command == 2)
            {
                if(s2.isEmpty())
                {
                    while(!s1.isEmpty())
                    {
                        s2.push(s1.pop());
                    }                    
                }
                
                if (!s2.isEmpty()){                                
                    s2.pop(); 
                }

            }
            else if (command == 3)
            {       
                if(s2.isEmpty())
                {
                    while(!s1.isEmpty())
                    {
                        s2.push(s1.pop());
                    }
                    System.out.println(s2.peek());
                } 
                else 
                {
                    System.out.println(s2.peek());
                }
            }
        }
    
    }
}

