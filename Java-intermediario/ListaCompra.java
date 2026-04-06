import java.util.Scanner;
class ListaCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double total = 0;
        while (true) {
            System.out.println("1 - Arroz (R$ 20)");
            System.out.println("2 - Feijao (R$ 10)");
            System.out.println("3 - Carne (R$ 30)");
            System.out.println("0 - Finalizar compra");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    total += 20;
                    System.out.println("Arroz adicionado");
                    break;
                case 2:
                    total += 10;
                    System.out.println("Feijao adicionado");
                    break;
                case 3:
                    total += 30;
                    System.out.println("Carne adicionada");
                    break;
                case 0:
                    System.out.println("Total da compra: R$" + total);
                    System.out.println("Compra finalizada");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}