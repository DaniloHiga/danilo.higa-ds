import java.util.Scanner;
class Inss {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite seu salário:"); //vai ler o salario bruto e mostrar o salario liquido
        float salario=scanner.nextFloat();
        double desc1=salario-(salario*0.08);
        double desc2=salario-(salario*0.09);
        double desc3=salario-(salario*0.11);
        if (salario<2000) {
            System.out.println("O valor do salário líquido é de R$" +desc1);
        }
        else if (salario>=2000 && salario<=3000) {
            System.out.println("O valor do salário líquido é de R$" +desc2);   
        }
        else {
            System.out.println("O valor do salário líquido é de R$" +desc3);
        }
        scanner.close();
    }    
}