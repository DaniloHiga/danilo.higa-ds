import java.util.Scanner;
class ClassNota {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a nota:"); //vai ler a nota e dizer se é valida ou nao
        float nota=scanner.nextFloat();
        if (nota<0 || nota>10) {
            System.out.println("Nota inválida");
        }
        else {
            System.out.println("Nota válida");
        }
        scanner.close();
    }    
}