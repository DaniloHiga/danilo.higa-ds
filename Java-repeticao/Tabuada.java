import java.util.Scanner;
class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num=scanner.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(num+ "X" +i+ "= " +(num*i));
        }
        scanner.close();
    }
}