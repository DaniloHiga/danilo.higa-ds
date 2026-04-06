import java.util.Scanner;
class ValidarResposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        System.out.print("Digite 1 ou 2: ");
        resposta=scanner.nextLine();

        while (!resposta.equalsIgnoreCase("1") && !resposta.equalsIgnoreCase("2")) {
            System.out.print("Resposta inválida. Digite 1 ou 2: ");
            resposta=scanner.nextLine();
        }

        System.out.println("Resposta válida: " + resposta);
        scanner.close();
    }
}