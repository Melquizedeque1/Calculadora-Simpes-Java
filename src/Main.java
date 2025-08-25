import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = input.nextDouble();

        System.out.print("Escolha um operador (+, -, *, /): ");
        String operador = input.next(); // lê algo como "+"

        System.out.print("Digite outro número: ");
        double num2 = input.nextDouble();

        double resultado;

        if (operador.equals("+")) {
            resultado = num1 + num2;
        } else if (operador.equals("-")) {
            resultado = num1 - num2;
        } else if (operador.equals("*")) {
            resultado = num1 * num2;
        } else if (operador.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("ERROR: Divisão por zero!");
                input.close();
                return;
            }
        } else {
            System.out.println("Operador inválido!");
            input.close();
            return;
        }

        System.out.println("Resultado: " + resultado);
        input.close();
    }
}
