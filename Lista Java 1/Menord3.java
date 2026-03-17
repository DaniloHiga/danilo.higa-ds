import java.util.Scanner;
class Menord3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o primeiro número:"); //vai ler tres numeros e dizer qual o menor deles
        float num1=scanner.nextFloat();
        System.out.println("Digite o segundo número:");
        float num2=scanner.nextFloat();
        System.out.println("Digite o terceiro número:");
        float num3=scanner.nextFloat();
        if (num1<num2 && num1<num3) {
            System.out.println("O menor número entre eles é o " +num1);
        }
        else if (num2<num1 && num2<num3) {
            System.out.println("O menor número entre eles é o " +num2);
        }
        else {
            System.out.println("O menor número entre eles é o " +num3);
        }
        scanner.close();
    }    
}