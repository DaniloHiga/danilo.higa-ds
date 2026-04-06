import java.util.Scanner;
import java.util.Random;
class JogoAdivinha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // 1 a 100
        int palpite;
        int tentativas = 0;

        System.out.println("Jogo: Adivinhe o Numero");

        while (true) {
            System.out.print("Digite seu palpite (1 a 100): ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Parabens! Voce acertou em " + tentativas + " tentativas.");
                break;
            } 
            else if (palpite < numeroSecreto) {
                System.out.println("Tente um numero MAIOR");
            } 
            else {
                System.out.println("Tente um numero MENOR");
            }
        }

        scanner.close();
    }
}