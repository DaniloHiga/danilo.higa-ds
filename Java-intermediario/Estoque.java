import java.util.Scanner;
class Estoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = {"Arroz", "Feijao", "Carne"};
        int[] estoque = {10, 8, 5};
        int opcao;
        while (true) {
            System.out.println("1 - Ver estoque");
            System.out.println("2 - Adicionar produto");
            System.out.println("3 - Remover produto");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(produtos[i] + ": " + estoque[i]);
                    }
                    break;
                case 2:
                    System.out.print("Digite o codigo do produto (0 a 2): ");
                    int add = scanner.nextInt();
                    System.out.print("Quantidade a adicionar: ");
                    int qtdAdd = scanner.nextInt();
                    estoque[add] += qtdAdd;
                    System.out.println("Estoque atualizado!");
                    break;
                case 3:
                    System.out.print("Digite o codigo do produto (0 a 2): ");
                    int rem = scanner.nextInt();
                    System.out.print("Quantidade a remover: ");
                    int qtdRem = scanner.nextInt();
                    if (estoque[rem] >= qtdRem) {
                        estoque[rem] -= qtdRem;
                        System.out.println("Removido com sucesso!");
                    } else {
                        System.out.println("Estoque insuficiente!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}