import java.util.Scanner;
class NumContagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num=scanner.nextInt();
        int contagem=0;
        while (contagem!=num) {
            contagem++;
            System.out.println(contagem);
        }
        scanner.close();
    }
}