import java.util.Scanner;
class ValidadorCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF (somente numeros): ");
        String cpf = scanner.nextLine();
        if (cpf.length() == 11) {
            System.out.println("CPF valido");
        } else {
            System.out.println("CPF invalido");
        }
        scanner.close();
    }
}