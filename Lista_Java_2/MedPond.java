import java.util.Scanner;
class MedPond {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a primeira nota:"); //vai ler tres notas e calcular a media ponderada delas
        float nota1=scanner.nextFloat();
        System.out.println("Digite a segunda nota:");
        float nota2=scanner.nextFloat();
        System.out.println("Digite a terceira nota:");
        float nota3=scanner.nextFloat();
        System.out.println("Digite o peso da primeira nota:");
        int peso1=scanner.nextInt();
        System.out.println("Digite o peso da segunda nota:");
        int peso2=scanner.nextInt();
        System.out.println("Digite o peso da terceira nota:");
        int peso3=scanner.nextInt();
        double media=((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
        System.out.println("A média ponderada dessas notas é " +media);
        scanner.close();
    }    
}