import java.util.Scanner;
public class RepetirFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        System.out.print("Quantas vezes repetir? ");
        int vezes = scanner.nextInt();

        for (int i=1; i<=vezes; i++) {
            System.out.println(frase);
        }
        scanner.close();
    }
}