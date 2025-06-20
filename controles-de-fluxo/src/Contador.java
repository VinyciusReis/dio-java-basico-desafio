import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        while(true) {
            var scanner = new Scanner(System.in);
            System.out.println("Digite um número inteiro positivo:");
            var numero1 = scanner.nextInt();
            System.out.println("Digite outro número inteiro positivo:");
            var numero2 = scanner.nextInt();
            try {
                contar(numero1, numero2);
                break;
            }catch(ParametroInvalidoException ex) {
                System.out.println(ex.getMessage());
            }finally {
                scanner.close();
            }
        }
    }
    private static void contar(int numero1, int numero2) throws ParametroInvalidoException {
        if(numero2 < numero1) {
            throw new ParametroInvalidoException("O segundo número deve ser maior que o primeiro.");
        }
        var contador = numero2 - numero1;
        for(int i = 1; i <= contador; i++) {
            System.out.println("Imprimindo o número: " + i);
        }

    }
}
