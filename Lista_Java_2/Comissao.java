import java.util.Scanner;
class Comissao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o valor da venda:"); //vai ler o valor da venda e calcular a comissao
        float valor=scanner.nextFloat();
        double comiss1=valor*0.04
        double comiss2=valor*0.06
        double comiss3=valor*0.08
        if (valor<1000) {
            System.out.println("A comissão para vendas é de: " +comiss1);
        }
        else if (valor>=1000 && valor<=5000) {
            System.out.println("A comissão para vendas é de: " +comiss2);
        }
        else {
            System.out.println("A comissão para vendas é de: " +comiss3);
        }
        scanner.close();
    }    
}