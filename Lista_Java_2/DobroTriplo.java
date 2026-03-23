import java.util.Scanner;
class DobroTriplo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o número:"); //vai ler um numero e mostrar o dobro e o triplo dele
        float num=scanner.nextFloat();
        System.out.println("O dobro desse número é " +(num*2)+ " e o triplo é " +(num*3));
        scanner.close();
    }    
}