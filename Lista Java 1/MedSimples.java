import java.util.Scanner;
class MedSimples {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a primeira nota:"); //vai ler as notas e dizer a media
        float nota1=scanner.nextFloat();
        System.out.println("Digite a segunda nota:");
        float nota2=scanner.nextFloat();
        System.out.println("Digite a terceira nota:");
        float nota3=scanner.nextFloat();
        float media=(nota1+nota2+nota3)/3;
        if (media>=7){
            System.out.println("Aprovado, media: " +media);
        }
        else if (media>=5 && media<7) {
            System.out.println("Recuperacao, media: " +media);
        }
        else{
            System.out.println("Reprovado, media: " +media);
        }
        scanner.close();
    }    
}