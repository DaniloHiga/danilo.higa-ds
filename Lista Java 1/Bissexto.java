import java.util.Scanner;
class Bissexto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite um ano:"); //vai ler o ano e dizer se é bissexto
        int ano=scanner.nextInt();
        if ((ano%4==0 && ano%100!=0) || (ano%400==0)) {
            System.out.println("O ano é bissexto");
        }
        else {
            System.out.println("O ano não é bissexto");
        }
        scanner.close();
    }    
}