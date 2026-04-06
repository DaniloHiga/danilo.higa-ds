import java.util.Scanner;
class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuariocerto="admin";
        String senhacerta="1234";
        int tentativa=0;
        while (tentativa < 3) {
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();
            
            if (usuario.equals(usuariocerto) && senha.equals(senhacerta)) {
                System.out.println("Acesso concedido");
                break;
            } else {
                tentativa++;
                System.out.println("Tente novamento. Tentativas restantes: " + (3 - tentativa));
            }
        }

        if (tentativa==3) {
            System.out.println("Acesso negado");
        }

        scanner.close();
    }
}