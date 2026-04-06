import java.util.Scanner;
class ClassificacaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota (0 a 10): ");
        double nota = scanner.nextDouble();

        if (nota >= 9) {
            System.out.println("MB");
        } else if (nota >= 7) {
            System.out.println("B");
        } else if (nota >= 5) {
            System.out.println("R");
        } else {
            System.out.println("I");
        }
        scanner.close();
    }
}