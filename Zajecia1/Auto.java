package Zajecia1;

public class Auto {
    public String kolor;
    public int predkość;

    Auto(){
        kolor = "standardowy kolor";
        predkość=100;
    }
    public void zmiana_predkosci(int dodanie){
        predkość+=dodanie;
    }

}
