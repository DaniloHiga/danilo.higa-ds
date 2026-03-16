import java.util.Scanner;
class PosNeg {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite um numero:"); //vai ler o numero e dizer se é positivo, negativo ou se é zero
        float numero=scanner.nextFloat();
        if (numero>0){
            System.out.println("O numero e positivo");
        }
        else if (numero<0) {
            System.out.println("O numero e negativo");
        }
        else{
            System.out.println("O numero e zero");
        }
        scanner.close();
    }    
}