import java.util.Scanner;
class Multiplos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o primeiro numero:"); //vai ler os numeros e dizer se o primeiro é multiplo do segundo
        int numero1=scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int numero2=scanner.nextInt();
        if (numero1%numero2==0) {
            System.out.println(numero1+ " é multiplo de " +numero2);
        }
        else {
            System.out.println(numero1+ " não é multiplo de " +numero2);
        }
        scanner.close();
    }    
}