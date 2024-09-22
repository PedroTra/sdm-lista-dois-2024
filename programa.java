import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IMC pessoa = new IMC();
        boolean continuar = true;

        while (continuar) {

            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();
            pessoa.setPeso(peso);

            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();
            pessoa.setAltura(altura);

            try {
                double imc = pessoa.calculoIMC();
                System.out.printf("O IMC é: %.2f\n", imc);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.print("Deseja calcular novamente? (s/n): ");
            String resposta = scanner.next().toLowerCase();
            if (!resposta.equals("s")) {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
