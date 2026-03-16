import java.util.Scanner;
class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o sexo em [M] ou [F]:"); //vai ler a altura e o sexo da pessoa e dizer o peso ideal
        char sexo=scanner.next().charAt(0);
        System.out.println("Digite a altura:");
        float altura=scanner.nextFloat();
        double pesoHomem=(72.7*altura)-58;
        double pesoMulher=(62.1*altura)-44.7;
        if (sexo=='M') {
            System.out.println("Seu peso ideal é " +pesoHomem);
        }
        else {
            System.out.println("Seu peso ideal é " +pesoMulher);
        }
        scanner.close();
    }    
}