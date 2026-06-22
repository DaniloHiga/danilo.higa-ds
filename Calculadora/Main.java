import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcao;
        do {
            System.out.println("Calculadora");
            System.out.println("1- Somar");
            System.out.println("2- Subtrair");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("0- Sair");
            System.out.println("Opção: ");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {

                System.out.print("Primeiro número: ");
                double n1 = scanner.nextDouble();
                System.out.print("Segundo número: ");
                double n2 = scanner.nextDouble();
                double result = 0;

                switch(opcao){
                    case 1:
                        result = calc.soma(n1, n2);
                        break;

                    case 2:
                        result = calc.sub(n1, n2);
                        break;

                    case 3:
                        result = calc.mult(n1, n2);
                        break;

                    case 4:
                        result = calc.div(n1, n2);
                        break;
                }
                System.out.println("Resultado = " + result);
            }
        } while(opcao!=0);
        scanner.close();
    }
}