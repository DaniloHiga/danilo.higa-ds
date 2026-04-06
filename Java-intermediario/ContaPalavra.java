import java.util.Scanner;
class ContaPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        String[] palavras = frase.split(" ");
        int quantidade = palavras.length;
        System.out.println("Quantidade de palavras: " + quantidade);
        scanner.close();
    }
}