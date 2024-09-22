
import java.util.Scanner;

public class ProgramaCalculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        boolean continuar = true;

        while (continuar) {

            System.out.println("Escolha uma operação: ");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Sair");
            System.out.print("Digite o número da operação: ");
            int escolha = scanner.nextInt();

            if (escolha == 5) {
                continuar = false;
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            try {
                double resultado;
                switch (escolha) {
                    case 1:
                        resultado = calculadora.somar(num1, num2);
                        System.out.printf("Resultado da soma: %.2f\n", resultado);
                        break;
                    case 2:
                        resultado = calculadora.subtrair(num1, num2);
                        System.out.printf("Resultado da subtração: %.2f\n", resultado);
                        break;
                    case 3:
                        resultado = calculadora.multiplicar(num1, num2);
                        System.out.printf("Resultado da multiplicação: %.2f\n", resultado);
                        break;
                    case 4:
                        resultado = calculadora.dividir(num1, num2);
                        System.out.printf("Resultado da divisão: %.2f\n", resultado);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
