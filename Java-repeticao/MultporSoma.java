import java.util.Scanner;
class MultporSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int resultado = 0;
        int i = 0;

        while (i<b) {
            resultado+=a;
            i++;
        }
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}