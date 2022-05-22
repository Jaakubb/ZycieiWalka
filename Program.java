import java.util.Scanner;
import java.util.Random;

public class Program {
    public static void main(String[] args) {



        Random liczba = new Random();

        Scanner input = new Scanner(System.in);

        String dzialanie = "1";

        while (true){

            System.out.println("Wyjscie(x),Walka(f),Leczenie(h),Statystyki(s)");
            dzialanie = input.next();

            if(dzialanie.equals("x")){
                break;
            }

            int obrazenia = 1 + liczba.nextInt(99);


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



