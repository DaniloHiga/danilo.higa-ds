import java.util.Scanner;
class AmbPositivos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o primeiro número:"); //vai ler dois numeros e soma los se forem ambos positivos
        float num1=scanner.nextFloat();
        System.out.println("Digite o segundo número:");
        float num2=scanner.nextFloat();
        double soma=num1+num2;
        if (num1>0 && num2>0) {
            System.out.println(soma);
        }
        else {
            System.out.println("Valores inválidos");
        }
        scanner.close();
    }    
}