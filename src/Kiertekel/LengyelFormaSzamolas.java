
package Kiertekel;

import java.util.ArrayList;

public class LengyelFormaSzamolas {


     String lengyelForma;
     ArrayList <Integer> verem;

    public LengyelFormaSzamolas(String lengyelForma) {
       
        this.lengyelForma = lengyelForma;
        verem = new ArrayList<>();
        //vere ürit
        int index = 0;

//Ciklus amíg (nem üres lengyel_forma)
        while (index < lengyelForma.length()) {
            //	elem: lengyel_forma.elso_elem
            char elem = lengyelForma.charAt(index);
            System.out.println(elem);
            index++;
            boolean jo;

            try {

                Integer.parseInt(String.valueOf(elem));
                jo = true;

            } catch (NumberFormatException e) {
                jo = false;
            }        
            if (jo) {
                //A string valueOf () metódus segítségével konvertálhatja az int karakterláncra
                verem.add(Integer.parseInt(String.valueOf(elem)));
            }
   // ha (elem típusa művelet)
//		érték1=veremből()
//		érték2=veremből()
//		eredmény=kiszámol(érték2, művelet, érték1) (figyelni kell, érték2-érték1)
//		verembe(eredmény)
//	elágazás vége

            if(!jo){              
               int ertek1=veremből();
               int ertek2=veremből();
               int eredmeny=kiszamol(ertek2, elem, ertek1);
               verem.add(eredmeny);
            }
        }
  //      Végeredmény=veremből()
        int vegeredmeny = veremből();
        System.out.println(vegeredmeny);
    }

    public int veremből(){
        int szam = verem.get(verem.size()-1);
        verem.remove(verem.size()-1);
        
        
        return szam;
    }
    //	eredmény=kiszámol(érték2, művelet, érték1) (figyelni kell, érték2-érték1)
    //Operátorok (az alap "számológép")
    public int kiszamol(int ertek2, char muvelet, int ertek1){
        int kifejezes = 0;
        switch (muvelet) {
  case '+': 
      kifejezes = ertek2 + ertek1;
      break;
      case '-':
          kifejezes = ertek2 - ertek1;
      break;
          case '*':  
              kifejezes = ertek2 * ertek1;
      break;
          case '/': 
              kifejezes = ertek2 / ertek1;
      break;
        }     
        return kifejezes;
    }
    public static void main(String[] args) {
        new LengyelFormaSzamolas("32+");
    }
}
