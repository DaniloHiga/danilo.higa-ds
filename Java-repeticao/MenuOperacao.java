import java.util.Scanner;
public class MenuOperacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (a + b));
                break;
            case 2:
                System.out.println("Resultado: " + (a - b));
                break;
            case 3:
                System.out.println("Resultado: " + (a * b));
                break;
            case 4:
                if (b != 0 && a!=0) {
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("Divisão por zero");
                }
                break;
            default:
                System.out.println("Opção invalida");
        }

        scanner.close();
    }
}