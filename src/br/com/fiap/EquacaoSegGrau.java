package br.com.fiap;

import java.util.Scanner;

public class EquacaoSegGrau {
    public static void main(String[] args) {
        int x1, x2, x3, soma, produto, resultado;
        Scanner scan;

        try {
            scan = new Scanner(System.in);

            System.out.println("Digite o 1ª número");
            x1 = scan.nextInt();
            System.out.println("Digite o 2ª número");
            x2 = scan.nextInt();
            System.out.println("Digite o 3ª número");
            x3 = scan.nextInt();

            soma = -x2 / x1;
            produto = x3 / x1;

            System.out.println("A soma deu: " + soma + "e o produto: " + produto);
        } catch (Exception e) {
            System.out.println("Número incorreto");
        }
    }
}
