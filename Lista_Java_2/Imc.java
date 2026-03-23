import java.util.Scanner;
class Imc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o peso (kg):"); //vai ler o peso e altura e exibir o imc
        float peso=scanner.nextFloat();
        System.out.println("Digite a altura (m):"); 
        float altura=scanner.nextFloat();
        double imc=peso/(altura*altura);
        if (imc<18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc>=18.5 && imc<24.9) {
            System.out.println("Peso normal");
        }
        else {
            System.out.println("Acima do peso");
        }
        scanner.close();
    }    
}