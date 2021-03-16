
package javaapplication12;

import java.util.Stack;


public class JavaApplication12 
{
static  Object kivettelem;
static char akt;
static char kivett;
    
    public static void main(String[] args)
    {
      
        Stack operatorverem=new Stack();
        Stack kimenet=new Stack();
        String kifejezes="2+6*(9-5)";
       
       
        for (int i = 0; i < kifejezes.length(); i++)
        {
            akt=kifejezes.charAt(i);
            if (akt=='(')
            {
                operatorverem.push(akt);
                
            }
            else if (szam(akt))
            {
                kimenet.push(akt);
                
            }
            else if (akt == '*' || akt == '/' || akt == '-' || akt == '+')
            {
                if (operatorverem.isEmpty())
                {
                    operatorverem.push(akt);
                    
                }
            }
            else
            {
               
                while(!operatorverem.isEmpty())
                {
                    kivettelem=operatorverem.pop();
                    kimenet.push(kivettelem);
                    
                    
                    
                }
                
                
            }
            operatorverem.push(akt);
        
            if (akt==')')
            {
                 
                kivett=(char)kivettelem;
                while(kivett==')')
                {
                    while (kivett!='(')
                    {
                        kimenet.push(kivett);
                        
                        
                    }
                    
                }
            
            }
            
            while(!operatorverem.isEmpty())
            {
                kimenet.push(kivett);
            }
           
                kimenet.push(kivett);
            }
        
        System.out.println("a kimenet");
        for (Object object : kimenet)
        {
            System.out.print(object);
            
        }
       
       
    }
       

    
    
    
    
    private static boolean szam(char karakter)
    {
        
        if (karakter=='1' || karakter=='2'||karakter=='3'||karakter=='4'||karakter=='5'||karakter=='6'||karakter=='7'||karakter=='8'||karakter=='9')
        {
            
        return true;    
        }
        else
        {
        return false;
        }
        
    }
    
}
