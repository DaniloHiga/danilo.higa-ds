import java.util.Scanner;
class Intervalo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o número:"); //vai ler o numero e dizer se ele está no intervalo
        float num=scanner.nextFloat();
        if (num>=10 && num<=50) {
            System.out.println("O número está no intervalo");
        }
        else {
            System.out.println("O número não está no intervalo");
        }
        scanner.close();
    }    
}