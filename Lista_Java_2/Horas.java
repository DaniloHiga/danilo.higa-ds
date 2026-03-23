import java.util.Scanner;
class Horas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a quantidade de horas:"); //vai ler um numero em horas e converter para minutos
        int num=scanner.nextInt();
        System.out.println(num+ " hora(s) em minutos é igual a: " +(num*60)+ " minutos");
        scanner.close();
    }    
}