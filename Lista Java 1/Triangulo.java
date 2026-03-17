import java.util.Scanner;
class Triangulo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o primeiro lado:"); //vai ler tres lados e informar o triangulo
        float lado1=scanner.nextFloat();
        System.out.println("Digite o segundo lado:");
        float lado2=scanner.nextFloat();
        System.out.println("Digite o terceiro lado:");
        float lado3=scanner.nextFloat();
        if ((lado1>lado2+lado3) || (lado2>lado3+lado1) || (lado3>lado1+lado2)) {
            System.out.println("Não forma triângulo");
        }
        else if (lado1==lado2 && lado2==lado3) {
            System.out.println("O triângulo é equilátero");
        }
        else if ((lado1==lado2 && lado1!=lado3) || (lado2==lado3 && lado2!=lado1) || (lado3==lado1 && lado3!=lado2)) {
            System.out.println("O triângulo é isósceles");
        }
        else {
             System.out.println("O triângulo é escaleno");
        }
        scanner.close();
    }    
}