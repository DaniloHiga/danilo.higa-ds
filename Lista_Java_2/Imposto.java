import java.util.Scanner;
class Imposto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o valor do produto:"); //vai ler um valor e aplicar o imposto estadual e federal
        float valor=scanner.nextFloat();
        double impostoEst=valor*0.05;
        double impostoFed=valor*0.07;
        double valorfinal=valor+impostoEst+impostoFed;
        System.out.println("O valor do produto após a aplicação dos impostos é de R$" +valorfinal);
        scanner.close();
    }    
}