import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {

        int AMOR =11; //Deberia ser una constante (no se como hacerlo)
        Scanner Lector = new Scanner(System.in);

        System.out.println("Cuanto me quieres del 1 al 10?");
        long primerIntento = Lector.nextLong();

        if (primerIntento == AMOR) {
            System.out.println("Yo igual :3");
        } else if (primerIntento <= AMOR) {
            System.out.println("Yo más <3");
        } else {
            System.out.println("Siempre presumiendo ee!!");
        }


    }
}
