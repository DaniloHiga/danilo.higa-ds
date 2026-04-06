import java.util.Scanner;
class Analisenum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos números quer inserir: ");
        int n=scanner.nextInt();
        int[] num=new int[n];
        for(int i=0; i<n; i++) {
            System.out.println("Digite o numero " + (i+1) + ": ");
            num[i]=scanner.nextInt();
        }
        int soma=0;
        int maior=num[0];
        int menor=num[0];
        
        for(int i=0; i<n; i++) {
            soma+=num[i];
        if (num[i]>maior) {
            maior=num[i];
        }
        if (num[i]<menor) {
            menor=num[i];
        }
        }
        double media = soma/n;
        System.out.println(" ");
        System.out.println("Quantidade de numeros: " +n);
        System.out.println("Soma: " +soma);
        System.out.println("Media: " +media);
        System.out.println("Maior numero: " +maior);
        System.out.println("Menor numero: " +menor);
    }
}