import java.util.Scanner;
class ParImpar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite um numero:"); //vai ler o numero e dizer se e par ou impar
        int numero=scanner.nextInt();
        if (numero%2==0){
            System.out.println("Seu numero e PAR");
        }
        else {
            System.out.println("Seu numero e IMPAR");
        }
        scanner.close();
    }    
}