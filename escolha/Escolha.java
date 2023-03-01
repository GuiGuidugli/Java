// O conteúdo abaixo é apenas prática de exercícios e não faz parte ou compõe qualquer projeto ou aplicativo funcional.

package escolha;

import java.util.Scanner;

public class Escolha {

    public static void main(String[] args) {

        int escolha = 0;

        while (escolha != 3) {

            System.out.println("Escolha uma opção:\n 1 - Oposto\n 2 - Sinal\n 3 - Sair");
            Scanner opcao = new Scanner(System.in);
            escolha = Integer.parseInt(opcao.nextLine());

            switch (escolha) {

                case 1:
                    System.out.println("Digite um número:\n");
                    Scanner n = new Scanner(System.in);
                    int x = Integer.parseInt(n.nextLine());
                    System.out.println("O oposto é" + x * (-1));

                    break;

                case 2:
                    System.out.println("Digite um número:\n");
                    Scanner n2 = new Scanner(System.in);
                    int y = Integer.parseInt(n2.nextLine());

                    if (y >= 0) {
                        System.out.println("O número é positivo.");
                    } else {
                        System.out.println("O número é negativo.");
                    }

                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
