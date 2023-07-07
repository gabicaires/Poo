
package atividade3;

import java.util.Scanner;


public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Midia[] lista = new Midia[10];

        for (int i = 0; i < lista.length; i++) {
            int opcao;

            while (true) {
                System.out.print("Digite 1 para CD e 2 para DVD: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao == 1 || opcao == 2) {
                    break;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

            if (opcao == 1) {
                lista[i] = new CD();
            } else if (opcao == 2) {
                lista[i] = new DVD();
            }

            lista[i].inserirDados();
        }

        for (Midia midia : lista) {
            if (midia != null) {
                midia.printDados();
            }
        }
    }
    
}
