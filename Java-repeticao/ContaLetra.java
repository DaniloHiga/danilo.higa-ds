import java.util.Scanner;
class ContaLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto=scanner.nextLine();

        int contador = 0;

        for (int i=0; i<texto.length(); i++) {
            char c=texto.charAt(i);
            if (Character.isLetter(c)) {
                contador++;
            }
        }
        System.out.println("Quantidade de letras: " + contador);
        scanner.close();
    }
}