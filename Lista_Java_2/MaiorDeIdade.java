import java.util.Scanner;
class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a idade:"); //vai ler a idade e dizer se é maior de idade ou não
        int idade=scanner.nextInt();
        if (idade>=18) {
            System.out.println("Você é maior de idade");
        }
        else {
            System.out.println("Você não é maior de idade");
        }
        scanner.close();
    }    
}