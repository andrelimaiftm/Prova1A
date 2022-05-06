import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Calculadora ---");
        System.out.println("Digite um numero: ");
        int valor1 = teclado.nextInt();
        System.out.println("Digite a operacao: ");
        char operador = teclado.next().charAt(0);
        System.out.println("Digite outro numero: ");
        int valor2 = teclado.nextInt();

        int resultado = 0;

        switch(operador){
            case '+': resultado = valor1 + valor2;
            break;
            case '-': resultado = valor1 - valor2;
            break;
            case '*': resultado = valor1 * valor2;
            break;
            case '/': resultado = valor1 /valor2;
            break;
            default: System.out.println("Operador inválido!.");
        }

        System.out.println("O resultado é: " + resultado);
        teclado.close();
    
    }
}
