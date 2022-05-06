import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.err.println("Digita sua altura: ");
        float altura = teclado.nextFloat();
        System.out.println("Digite seu peso: ");
        float peso = teclado.nextFloat();

        if (altura < 1.20) {
            if (peso < 60) {
                System.out.println("A");
            } else if (peso >= 60 && peso <= 90) {
                System.out.println("D");
            } else {
                System.out.println("G");
            }

        } else if (altura >= 1.20 && altura <= 1.70) {
            if (peso < 60) {
                System.out.println("B");
            } else if (peso >= 60 && peso <= 90) {
                System.out.println("E");
            } else {
                System.out.println("H");
            }
        }else{
            if (peso < 60) {
                System.out.println("C");
            } else if (peso >= 60 && peso <= 90) {
                System.out.println("F");
            } else {
                System.out.println("I");
            }
        }
        teclado.close();
    }

}
