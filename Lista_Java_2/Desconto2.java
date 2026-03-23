import java.util.Scanner;
class Desconto2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o valor do produto:"); //vai ler o valor e aplicar o desconto
        float valor=scanner.nextFloat();
        double desc1=valor-(valor*0.05);
        double desc2=valor-(valor*0.1);
        double desc3=valor-(valor*0.15);
        if (valor<50) {
            System.out.println("O preço final é de R$" +desc1);
        }
        else if (valor>=50 && valor<=100) {
            System.out.println("O preço final é de R$" +desc2);
        }
        else {
            System.out.println("O preço final é de R$" +desc3);
        }
        scanner.close();
    }    
}