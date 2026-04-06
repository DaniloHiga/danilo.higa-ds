import java.util.Scanner;
class ContRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero inicial: ");
        int inicial = scanner.nextInt();

        for (int i=inicial; i>=0; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}