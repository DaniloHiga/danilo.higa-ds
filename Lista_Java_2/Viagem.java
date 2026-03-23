import java.util.Scanner;
class Viagem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a distância (km):"); //vai ler a distância e a velocidade media e calcular o tempo estimado de viagem
        float distancia=scanner.nextFloat();
        System.out.println("Digite a velocidade média (km/h):");
        float velocidade=scanner.nextFloat();
        double tempo=distancia/velocidade;
        System.out.println("Tempo estimado: " +tempo+ " horas");
        scanner.close();
    }    
}