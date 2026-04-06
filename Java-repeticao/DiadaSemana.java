import java.util.Scanner;
class DiadaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número (1 a 7): ");
        int dia = scanner.nextInt();
        switch (dia){
            case 1 :
                System.out.println("Hoje é Domingo");
                break;
            case 2 : 
                System.out.println("Hoje é Segunda-Feira");
                break;
            case 3 :
                System.out.println("Hoje é Terça-Feira");
                break;
            case 4 :
                System.out.println("Hoje é Quarta-Feira");
                break;
            case 5 :
                System.out.println("Hoje é Quinta-Feira");
                break;
            case 6:
                System.out.println("Hoje é Sexta-feira");
                break;
            case 7:
                System.out.println("Hoje é Sábado");
                break;
            default :
                System.out.println("Dia invalido");
            
        }
        
        
    }
    
}