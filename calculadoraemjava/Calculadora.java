// Calculadora em Java capaz de identificar o 
// segundo número como 0 para evitar divisão por zero.

package calculadoraemjava;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
    
        System.out.println("Digite o primeiro número:");
        Scanner n1 = new Scanner(System.in);
    
        int primeiro_numero = Integer.parseInt(n1.nextLine());

        System.out.println("Digite o segundo número:");
        Scanner n2 = new Scanner(System.in);
        
        int segundo_numero = Integer.parseInt(n2.nextLine());

        int sum = primeiro_numero + segundo_numero;
        int mult = primeiro_numero * segundo_numero;
        int minus = primeiro_numero - segundo_numero;
        String div = null;

        if (segundo_numero == 0) {

            div = "Não existe divisão por 0.";

           }

        else {

            div = String.valueOf(primeiro_numero / segundo_numero);

        }

        System.out.println("Soma: " + sum + " Multiplicação: " + mult +
         " Subtração: " + minus + " Divisão: " + div);
        
    }
}