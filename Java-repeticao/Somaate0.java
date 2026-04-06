import java.util.Scanner;
class Somaate0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=1;
        int soma=0;
        while(num!=0) {
            System.out.println("Digite um numero (0 para parar): ");
            num=scanner.nextInt();
            soma+=num;
        }
        System.out.println("Total: " +soma);
        scanner.close();
    }
}