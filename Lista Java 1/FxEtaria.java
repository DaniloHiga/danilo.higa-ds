import java.util.Scanner;
class FxEtaria {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a idade:"); //vai ler a idade e indicar a faixa etaria
        int idade=scanner.nextInt();
        if (idade>=0 && idade<=12) {
            System.out.println("Faixa Etária: Criança");
        }
        else if (idade>=13 && idade<=17) {
            System.out.println("Faixa Etária: Adolescente");
        }
        else if (idade>=18 && idade<=59) {
             System.out.println("Faixa Etária: Adulto");
        }
        else {
             System.out.println("Faixa Etária: Idoso");
        }
        scanner.close();
    }    
}