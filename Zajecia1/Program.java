package Zajecia1;

public class Program {
    public static void main(String[] args) {
        Auto czerwone = new Auto();
        System.out.println(czerwone.predkość);
        czerwone.zmiana_predkosci(90);
        System.out.println(czerwone.predkość);
    }
}
