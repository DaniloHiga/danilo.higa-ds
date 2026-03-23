import java.util.Scanner;
class Palavra {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a primeira palavra:"); //vai ler tres palavras e dizer qual é a maior
        String palavra1=scanner.nextLine();
        System.out.println("Digite a segunda palavra:");
        String palavra2=scanner.nextLine();
        System.out.println("Digite a terceira palavra:");
        String palavra3=scanner.nextLine();
        if (palavra1.length()>=palavra2.length() && palavra1.length()>=palavra3.length()) {
            System.out.println("Maior palavra: " +palavra1);
        }
        else if (palavra2.length()>=palavra1.length() && palavra2.length()>=palavra3.length()) {
            System.out.println("Maior palavra: " +palavra2);
        }
        else {
            System.out.println("Maior palavra: " +palavra3);
        }
        scanner.close();
    }    
}