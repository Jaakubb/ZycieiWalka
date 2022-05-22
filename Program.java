import java.util.Scanner;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Człowiek a = new Człowiek();
        Random liczba = new Random();

        Scanner input = new Scanner(System.in);
        //Deklarujemy zmienną string aby jej później używać
        String dzialanie = "1";
        //warunek pętli while jeśli jest true to ta pętla zawsze się wykonuje chyba że natrafi na break;
        while (true){

            System.out.println("Wyjscie(x),Walka(f),Leczenie(h),Statystyki(s)");
            dzialanie = input.next();
            //Przerwanie aplikacji jesli x
            if(dzialanie.equals("x")){
                break;
            }
            //Pytamy o liczby
            int obrazenia = 1 + liczba.nextInt(99);

            //Wykonywanie działań za pomocą switcha
            switch(dzialanie){
                case "f":
                    System.out.println(obrazenia);
                    System.out.println();

                    break;
                case "h":
                    //System.out.println;
                    break;
                case "s":
                    System.out.println();
                    break;
                default:
                    break;
            }

        }
    }
}



