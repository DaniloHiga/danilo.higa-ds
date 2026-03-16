import java.util.Scanner;
class IdadeVoto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a idade:"); //vai ler a idade e dizer se pode votar ou não
        int idade=scanner.nextInt();
        if (idade>=18 && idade<=70){
            System.out.println("Voto Obrigatorio");
        }
        else if (idade>=16 && idade<=17 || idade>70) {
            System.out.println("Voto Opcional");
        }
        else {
            System.out.println("Nao pode votar");
        }
        scanner.close();
    }    
}