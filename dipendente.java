package oop;

public class Dipendente {
private String nome;
private double stipendio;

public Dipendente(String nome, double stipendio) {
    this.nome=nome;
    this.stipendio=stipendio;
}
double getStipendio() {
    return stipendio;
}
public void stampainfo() {
    System.out.println("Il dipendente si chiama :"+nome+" e guadagna "+stipendio+".");
    if (stipendio>1200) {
        System.out.println("Prendi piu della media!");
    }else {
        System.out.println("Sei sottopagato");
    }
}


}
