import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        boolean valido = true;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Entre com o primeiro numero de 0 a 100");
            numero1 = scan.nextInt();

            System.out.println("Entre com o segundo numero de 0 a 100");
            numero2 = scan.nextInt();

            try {
                contar(numero1, numero2);
                break;
            } catch (ParametrosInvalidosException e) {
                valido = false;
                System.out.println("O primeiro numero deve ser menor que o segundo numero");

            }

        } while (!valido);

    }

    static void contar(int numeroA, int numeroB) throws ParametrosInvalidosException {
        int cont = 0;
        if (numeroA > numeroB)
            throw new ParametrosInvalidosException();

        if (numeroA < numeroB) {

            while (numeroA < numeroB - 1) {
                numeroA++;
                cont++;
                System.out.println(" ");

                System.out.println(" -> " + numeroA);
            }
            System.out.println("---------");

            System.out.println("Total de numeros incrementados entre os dois numeros passados: " + cont);

        }

    }
}