import java.util.Scanner;
class Segundos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite os segundos:"); //vai ler uma quantidade de segundos e converter pra horas
        int tempo = scanner.nextInt();
        int horas = tempo / 3600;
        int resto = tempo % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;
        System.out.println("Horas: " +horas);
        System.out.println("Minutos: " +minutos);
        System.out.println("Segundos: " +segundos);
        scanner.close();
    }    
}