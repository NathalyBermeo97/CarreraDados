
import java.util.Scanner;

public class CarreradeDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = "";
        int xi = 0, oi = 0, x = 0, o = 0, i = 0;

        System.out.print(0);
        System.out.print(" x   o");
        System.out.println("");
        for (int j = 1; j <= 50; j++) {
            System.out.println(j);
        }
        do {
            System.out.println("Primer jugador presione enter para lanzar los dados ");
            entrada = scanner.nextLine();
            xi = monopolyRoll();
            System.out.println("Suma de dados: " + xi);
            System.out.println("Segundo jugador presione enter para lanzar los dados ");
            entrada = scanner.nextLine();
            oi = monopolyRoll();
            System.out.println("Suma de dados: " + oi);
            System.out.println("Presione para continuar");
            entrada = scanner.nextLine();
            x = x + xi;
            o = o + oi;

            for (i = 0; i < 51; i++) {
                System.out.print(i);
                if (x == o) {
                    o = 0;
                    System.out.print(" o");
                }
                if (x == i) {
                    System.out.print(" x");
                }
                if (o == x) {
                    x = 0;
                    System.out.print(" x");
                }
                if (o == i) {
                    System.out.print(" o");
                }
                System.out.println("");
            }
            i++;
            if (x >= 50) {
                System.out.println("El ganador es: x");
                break;
            }
            if (o >= 50) {
                System.out.println("El ganador es: o");
                break;
            }
        } while ((x <= 50) || (o <= 51));
    }

    public static int dados() {
        int valor_dado = (int) Math.floor(Math.random() * 6 + 1);
        return valor_dado;
    }

    public static int monopolyRoll() {
        int sum = 0, cont = 0, x, y;
        do {
            x = dados();
            y = dados();
            sum = sum + x + y;
            cont++;
            if (cont == 3) {
                return 0;
                
            }
        } while (x == y);
        return sum;
    }
}