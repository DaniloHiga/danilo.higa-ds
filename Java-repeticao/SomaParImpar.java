import java.util.Scanner;
class SomaParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número n: ");
        int n=scanner.nextInt();
        int somaPar=0;
        int somaImpar=0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                somaPar += i;
            } else {
                somaImpar += i;
            }
        }
        System.out.println("Soma dos pares: " +somaPar);
        System.out.println("Soma dos ímpares: " +somaImpar);

        scanner.close();
    }
}