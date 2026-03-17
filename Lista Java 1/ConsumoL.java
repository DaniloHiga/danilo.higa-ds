import java.util.Scanner;
class ConsumoL {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a distância em Km:"); //vai ler a quant de km e o consumo do carro e responder em litros
        float distancia=scanner.nextFloat();
        System.out.println("Digite o consumo do carro em Km/L:");
        float consumo=scanner.nextFloat();
        double litros=distancia/consumo;
        System.out.println("Litros gastos: " +litros);
        scanner.close();
    }    
}