import java.util.Scanner;
class MaiorNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o primeiro numero:"); //vai ler os dois numeros e dizer qual deles e o maior
        float numero1=scanner.nextFloat();
        System.out.println("Digite o segundo numero:");
        float numero2=scanner.nextFloat();
        if (numero1>numero2){
            System.out.println("O numero maior e o " +numero1);
        }
        else if (numero2>numero1) {
            System.out.println("O numero maior e o " +numero2);
        }
        else{
            System.out.println("Os numeros sao iguais");
        }
        scanner.close();
    }    
}