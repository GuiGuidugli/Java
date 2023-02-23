package testeaula; 

import java.util.Scanner;

public class TesteAula {

    public static void main(String[] args) {
        
        System.out.println("Qual seu nome?");
        Scanner teclado = new Scanner (System.in);
        String nome = teclado.nextLine();
        System.out.println("Olá" + nome + " , vamos aprender OOP!");
        
    }

}