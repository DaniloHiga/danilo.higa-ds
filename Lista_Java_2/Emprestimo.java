import java.util.Scanner;
class Emprestimo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite seu salário:"); //vai ler o salario e o valor da parcela e dizer se pode ser aprovado
        float salario=scanner.nextFloat();
        System.out.println("Digite o valor da parcela:");
        float parcela=scanner.nextFloat();
        if (parcela<=(salario*0.3)) {
            System.out.println("Empréstimo aprovado");
        }
        else {
            System.out.println("Empréstimo negado");   
        }
        scanner.close();
    }    
}