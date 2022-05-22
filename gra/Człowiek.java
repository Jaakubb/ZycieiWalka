package gra;

public class Człowiek {
    public int zdrowie;
    public int leczenie;
    public int doswiadczenie;

    Człowiek(){
        zdrowie=200;
        leczenie=100;
        doswiadczenie=0;
    }
    public void utrata_zdrowia(int utrata){
        zdrowie-=utrata;
    }
    public void leczenie_zdrowia(int leczenie) {
        zdrowie += leczenie;
    }
    public void dodanie_exp (int exp ) {
        doswiadczenie += exp;
    }

}
