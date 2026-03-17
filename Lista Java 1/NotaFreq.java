import java.util.Scanner;
class NotaFreq {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a nota (de 0 a 10):"); //vai ler a nota e frequencia e dizer se esta aprovado
        float nota=scanner.nextFloat();
        System.out.println("Digite a frequência (em porcentagem):");
        float freq=scanner.nextFloat();
        if ((nota>=7) && (freq>=75)) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }    
}