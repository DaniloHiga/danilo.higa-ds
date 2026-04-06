import java.util.Scanner;
class CadastroAluno {
    public static double calculoMediadouble n1, double n2) {
        return (n1 + n2)/2;
    }

    public static void verificacao(double media) {
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        double media = calcularMedia(n1, n2);

        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + media);

        verificarSituacao(media);

        scanner.close();
    }
}