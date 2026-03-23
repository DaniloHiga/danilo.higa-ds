import java.util.Scanner;
class OrdCresc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o primeiro número:"); //vai ler tres numeros e mostrar los em ordem crescente
        float num1=scanner.nextFloat();
        System.out.println("Digite o segundo número:"); 
        float num2=scanner.nextFloat();
        System.out.println("Digite o terceiro número:"); 
        float num3=scanner.nextFloat();
        if (num1<=num2 && num1<=num2) {
            if (num2<=num3) {
                System.out.println(num1+ " " +num2+ " " +num3);
            }
            else {
                System.out.println(num1+ " " +num3+ " " +num2);
            }
        }
        else if (num2<=num1 && num2<=num3) {
            if (num1<=num3) {
                System.out.println(num2+ " " +num1+ " " +num3);
            }
            else {
                System.out.println(num2+ " " +num3+ " " +num1);
            }
        }
        else {
            if (num1<=num2) {
                System.out.println(num3+ " " +num1+ " " +num2);
            }
            else {
                System.out.println(num3+ " " +num2+ " " +num1);
            }
        }
        scanner.close();
    }    
}