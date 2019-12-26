
package javamtpismoglava;

import java.util.Scanner;

public class JavaMTPismoGlava {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       final int PISMO = 0;
       int brojBacanja;
       int ishodBacanja;
       int brojPisma;
       int brojGlava;
       
       while(true){
           System.out.println("Unesite broj bacanja novcica: ");
           brojBacanja = input.nextInt();
           if(brojBacanja == 0)break;
           brojPisma = 0;
           brojGlava = 0;
           for(int i = 0; i<brojBacanja; i++){
           ishodBacanja = (int)(Math.random() + 0.5);
            if(ishodBacanja == PISMO){
            brojPisma++;
            }else{
            brojGlava++;
           }}
           System.out.println("Broj pisma Broj Glava");
           System.out.println("Broj pisma/ Broj bacanja");
           System.out.println("Broj glava /Broj bacanja");
           
           System.out.printf("%8d %12d %17.2f %25.2f\n",
                    brojPisma, brojGlava,
                    (double)brojPisma/brojBacanja,
                    (double)brojGlava/brojBacanja
                   );
                  
                  
       
       }
    }
    
    
}
