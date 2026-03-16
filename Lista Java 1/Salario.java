import java.util.Scanner;
class Salario {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o salario:"); //vai ler o valor do salario e aplicar o aumento
        double salario=scanner.nextDouble();
        double aumento1=salario+(salario*0.1);
        double aumento2=salario+(salario*0.07);
        double aumento3=salario+(salario*0.05);
        if (salario<2000){
            System.out.println("Com o aumento de 10% o salario agora e R$" +aumento1);
        }
        else if (salario>=2000 && salario<4000) {
            System.out.println("Com o aumento de 7% o salario agora e R$" +aumento2);
        }
        else {
            System.out.println("Com o aumento de 5% o salario agora e R$" +aumento3);
        }
        scanner.close();
    }    
}