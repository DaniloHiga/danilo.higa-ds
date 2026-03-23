import java.util.Scanner;
class Notas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a primeira nota:"); //vai ler duas notas, calcular a média e dizer se foi aprovado ou nõo
        float nota1=scanner.nextFloat();
        System.out.println("Digite a segunda nota:"); 
        float nota2=scanner.nextFloat();
        double media=(nota1+nota2)/2
        if (media>=6) {
            System.out.println("Aprovado")
        }
        else {
            System.out.println("Reprovado")
        }
        scanner.close();
    }    
}