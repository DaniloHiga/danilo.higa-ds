import java.util.Scanner;
class DifAbsoluta {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o primeiro número:"); //vai ler dois numeros inteiros e mostrar a diferença absoluta entre eles
        int num1=scanner.nextInt();
        System.out.println("Digite o segundo número:"); 
        int num2=scanner.nextInt();
        int diferenca=Math.abs(num1-num2);
        System.out.println("A diferença absoluta entre " +num1+ " e " +num2+ " é de " +diferenca);
        scanner.close();
    }    
}