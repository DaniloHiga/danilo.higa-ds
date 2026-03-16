import java.util.Scanner;
class Temperatura {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:"); //vai ler a temperatura em Celsius e converter para Fahrenheit
        float celsius=scanner.nextFloat();
        double temperatura=(celsius*1.8)+32;
        System.out.println("A temperatura em Fahrenheit e " +temperatura);
        scanner.close();
    }    
}