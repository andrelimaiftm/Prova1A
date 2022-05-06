import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        System.out.println("Digite o primeiro numero");
        int numero1 = teclado.nextInt();
        System.out.println("Digite o segundo numero");
        int numero2 = teclado.nextInt();
        System.out.println("Digite o terceiro numero");
        int numero3 = teclado.nextInt();

        if(numero1 == numero2 && numero1 == numero3){
            System.out.println("Os três numeros são iguais");
            maior = numero1;
            menor = numero1;
        }else if(numero1 >= numero2 && numero1 > numero3){
            maior = numero1;
            if(numero3 <= numero2){
                menor = numero3;
            }else{
                menor = numero2;
            }            
        }else if(numero2 >= numero1 && numero2 > numero3){
            maior = numero2;
            if(numero3 <= numero1){
                menor = numero3;
            }else{
                menor = numero1;
            }
        }else{
            maior = numero3;
            if(numero1 <= numero2){
                menor = numero1;
            }else{
                menor = numero2;
            }
        }
        System.out.println("Maior elemento é: " + maior);
        System.out.println("Menor elemento é: " + menor);
        teclado.close();
    }
    
}
