// Calculadora em Java capaz de identificar o 
// segundo número como 0 para evitar divisão por zero.

package calculadoraemjava;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
    
        System.out.println("Digite um número inteiro:");
        Scanner n1 = new Scanner(System.in);
    
        int primeiro_numero = Integer.parseInt(n1.nextLine());

        System.out.println("Digite outro número inteiro:");
        Scanner n2 = new Scanner(System.in);
        
        int segundo_numero = Integer.parseInt(n2.nextLine());

        if (segundo_numero == 0) {
  
            System.out.printf("%d + %d = %d\n", primeiro_numero, segundo_numero, primeiro_numero + segundo_numero);
            System.out.printf("%d - %d = %d\n", primeiro_numero, segundo_numero, primeiro_numero - segundo_numero);
            System.out.printf("%d * %d = %d\n", primeiro_numero, segundo_numero, primeiro_numero * segundo_numero);
            System.out.printf("Não existe divisão por 0.");

        }

        else {

            System.out.printf("%d + %d = %d\n", primeiro_numero, segundo_numero, primeiro_numero + segundo_numero);
            System.out.printf("%d - %d = %d\n", primeiro_numero, segundo_numero, primeiro_numero - segundo_numero);
            System.out.printf("%d * %d = %d\n", primeiro_numero, segundo_numero, primeiro_numero * segundo_numero);
            System.out.printf("%d / %d = %d\n", primeiro_numero, segundo_numero, primeiro_numero / segundo_numero);

        }
  
    }
}