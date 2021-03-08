
package kifejezeskiertekeles.gombos.imre;


import java.util.ArrayList;
import java.util.Stack;
public class KifejezeskiertekelesGombosImre {
 static char[] kifejezestomb=new char[3];
    final static char[] operatorok =new char[4];

    public static void main(String[] args) {
      String kifejezes="teszt";
        operatorok[0]='+';
        operatorok[1]='-';
        operatorok[2]='/';
        operatorok[3]='*';



        System.out.println(kifejezesekbenkeres('-'));




        Stack<Character> verem = new Stack<Character>();

        for (int i = 0; i <kifejezes.length(); i++)
        {
            char akt=kifejezes.charAt(i);
            if (akt=='(')
            {
                verem.push(kifejezes.charAt(i));
            }
            else if(!(kifejezesekbenkeres(akt)))
            {
            }

        }
    }
    private static boolean kifejezesekbenkeres(char akt)
    {
        boolean szam=false;
        for (int i = 0; i<operatorok.length; i++)
        {
            if (!(akt==operatorok[i]))
            {
                szam=true;
            }
            else
            {
                szam=false;
            }
        }
        return szam;
    }

    
    
}
