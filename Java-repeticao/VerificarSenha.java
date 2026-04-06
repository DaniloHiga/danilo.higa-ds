import java.util.Scanner;
class VerificarSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhacerta = "1234";
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (senha.equals(senhacerta)) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Senha incorreta");
        }
        scanner.close();
    }
}