package gra;

import java.util.Scanner;
import java.util.Random;


public class Program {
    public static void main(String[] args) {
        Człowiek b = new Człowiek();



        Random liczba = new Random();

        Scanner input = new Scanner(System.in);

        String dzialanie = "1";

        while (true){

            System.out.println("Wyjscie(x),Walka(f),Leczenie(h),Statystyki(s)");
            dzialanie = input.next();

            System.out.println(b );

            if(dzialanie.equals("x")){
                break;
            }

            int obrazenia = 1 + liczba.nextInt(99);


            switch(dzialanie){
                case "f":
                    System.out.println(obrazenia);
                    b.utrata_zdrowia(obrazenia);
                    System.out.println(b.zdrowie);
                    b.dodanie_exp(10);

                    if (b.zdrowie<0){
                        System.out.println("Przegrałeś");
                        break;
                    }
                    break;
                case "h":
                    b.leczenie_zdrowia(b.leczenie);
                    System.out.println(b.zdrowie);
                    break;
                case "s":
                    System.out.println(b.zdrowie);
                    System.out.println(b.doswiadczenie);
                    break;
                default:
                    break;
            }

        }
    }
}



