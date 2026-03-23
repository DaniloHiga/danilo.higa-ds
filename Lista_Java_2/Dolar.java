import java.util.Scanner;
class Dolar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o valor em real:"); //vai ler o valor em real e converte em dolar
        float real=scanner.nextFloat();
        System.out.println("Digite a cotação do dólar:"); 
        float cotacao=scanner.nextFloat();
        double dolar=real/cotacao;
        System.out.println("R$" +real+ " reais são $" +dolar+ " dólares");
        scanner.close();
    }    
}