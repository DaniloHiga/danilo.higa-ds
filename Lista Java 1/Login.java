import java.util.Scanner;
class Login {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String usuario="admin";
        String senha="1234";
        System.out.println("Digite o nome de usuário:"); //vai ler a senha e o usuario para permitir o login
        String userTry=scanner.nextLine();
        System.out.println("Digite a senha:");
        String passwordTry=scanner.nextLine();
        if ((userTry.equals(usuario)) && (passwordTry.equals(senha))) {
            System.out.println("Acesso Concedido");
        }
        else {
            System.out.println("Acesso Negado");
        }
        scanner.close();
    }    
}