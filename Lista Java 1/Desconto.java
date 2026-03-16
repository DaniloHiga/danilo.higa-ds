import java.util.Scanner;
class Desconto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o valor:"); //vai ler o valor do produto e aplicar o desconto
        float valor=scanner.nextFloat();
        double desconto1=valor-(valor*0.2);
        double desconto2=valor-(valor*0.1);
        if (valor>100) {
            System.out.println("O valor final é de " +desconto1);
        }
        else {
            System.out.println("O valor final é de " +desconto2);
        }
        scanner.close();
    }    
}