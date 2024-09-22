import java.util.Scanner;


public class ProgramaPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        boolean continuar = true;

        while (continuar) {
            // Solicita a opção
            System.out.println("Escolha uma ação: ");
            System.out.println("1. Acordar");
            System.out.println("2. Andar");
            System.out.println("3. Comer");
            System.out.println("4. Dormir");
            System.out.println("5. Sair");
            System.out.print("Digite o número da ação: ");
            int acao = scanner.nextInt();

            if (acao == 5) {
                continuar = false;
                System.out.println("Programa encerrado.");
                break;
            }

            // Executa a ação escolhida
            switch (acao) {
                case 1:
                    pessoa.acordar();
                    break;
                case 2:
                    pessoa.andar();
                    break;
                case 3:
                    pessoa.comer();
                    break;
                case 4:
                    pessoa.dormir();
                    break;
                default:
                    System.out.println("Ação inválida. Tente novamente.");
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}
