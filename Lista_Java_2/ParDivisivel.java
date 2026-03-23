import java.util.Scanner;
class ParDivisivel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o número:"); //vai ler um numero e dizer se é par e se é divisivel por cinco
        int num=scanner.nextInt();
        if (num%2==0) {
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é ímpar");
        }
        if (num%5==0) {
            System.out.println("O número é divisível por cinco");
        }
        else {
            System.out.println("O número não é divisível por cinco");
        }
        scanner.close();
    }    
}