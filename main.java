package oop;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    
    Dipendente dipendenti[]=new Dipendente[6];
    
    for(int i=0;i<dipendenti.length;i++) {
        System.out.println("Inserisci nome"+(i+1)+" dipendente :");
        String nome=scanner.nextLine();
        System.out.println("Inserisci il suo stipendio : ");
        Double stipendio=scanner.nextDouble();
        while (stipendio<=0) {
            System.out.println("Stipendio non valido! Inserisci un importo valido : ");
             stipendio=scanner.nextDouble();
        }scanner.nextLine();
        
      Dipendente p=new Dipendente(nome,stipendio);
      dipendenti[i]=p;
      
    
    }
    
   
    double somma =0;
    for(int i=0;i<dipendenti.length;i++) {
        somma=somma+dipendenti[i].getStipendio();
    }
    
    double  media=somma/dipendenti.length;
    
    double max= dipendenti[0].getStipendio();
    double min = dipendenti[0].getStipendio();

    for(int i=1;i<dipendenti.length;i++) {
        if (dipendenti[i].getStipendio()>max) {
            max =dipendenti[i].getStipendio();
        }
        if(dipendenti[i].getStipendio()<min) {
            min = dipendenti[i].getStipendio();
        }
    }
    
    
    System.out.println("\n ===ELENCO DIPENDENTI ===");
    for (int i=0;i<dipendenti.length;i++) {
        dipendenti[i].stampainfo();
    }
    System.out.println("La media degli stipendi é :"+ media+", mentre la somma é :"+ somma+".");
    System.out.println("lo stipendio piu alto é "+max+" mentre quello piu basso é :"+ min+".");
    
    
    
    
    }

}
