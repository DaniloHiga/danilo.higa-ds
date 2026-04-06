import java.util.Scanner;
class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("MENU");
            System.out.println("1 - Mostrar um numero");
            System.out.println("2 - Somar dois numeros");
            System.out.println("3 - Subtrair dois numeros");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um numero: ");
                    int num = scanner.nextInt();
                    System.out.println("Numero digitado: " + num);
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Soma: " +(num1+num2));
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    int num3 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num4 = scanner.nextInt();
                    System.out.println("Subtração: " +(num3-num4));
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
        scanner.close();
    }
}