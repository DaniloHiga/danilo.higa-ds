import java.util.Scanner;
class Calculadora {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o primeiro numero:"); //vai ler dois números e fazer a operação correspondente (calculadora)
        double numero1=scanner.nextDouble();
        System.out.println("Digite o segundo numero:"); 
        double numero2=scanner.nextDouble();
        System.out.println("Digite a operação [+] [-] [*] [/]:");
        char opera=scanner.next().charAt(0);
        if (opera=='+') {
            System.out.println("O resultado é " +(numero1+numero2));
        }
        else if (opera=='-') {
            System.out.println("O resultado é " +(numero1-numero2));
        }
        else if (opera=='*') {
            System.out.println("O resultado é " +(numero1*numero2));
        }
        else if (opera=='/') {
            System.out.println("O resultado é " +(numero1/numero2));
        }
        else {
            System.out.println("Não é uma operação válida");
        }
        scanner.close();
    }    
}