import java.util.Scanner;
class KwH {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o consumo de energia em KWh:"); //vai ler o consumo de energia e calcular quanto deve ser pago
        float KWh=scanner.nextFloat();
        double consumo1=KWh*0.2;
        double consumo2=KWh*0.25;
        if (KWh<100) {
            System.out.println("O valor a ser pago é de R$" +consumo1);
        }
        else {
            System.out.println("O valor a ser pago é de R$" +consumo2);
        }
        scanner.close();
    }    
}