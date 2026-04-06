import java.util.Scanner;
class ValidarResposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        System.out.print("Digite S (sim) ou N (não): ");
        resposta=scanner.nextLine();

        while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
            System.out.print("Resposta inválida! Digite S ou N: ");
            resposta=scanner.nextLine();
        }

        System.out.println("Resposta válida: " + resposta);
        scanner.close();
    }
}