package br.com.fiap;

import java.util.Scanner;

public class TrapezioScanner {
    public static void main(String[] args) {
        float base_menor, base_maior, altura, resultado;
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite a base menor");
            base_menor = scan.nextFloat();
            System.out.println("Digite a base maior");
            base_maior = scan.nextFloat();
            System.out.println("Agora igite a altura");
            altura = scan.nextFloat();

            resultado = (base_maior + base_menor) * altura / 2;
            System.out.printf("A área é: %.2f", resultado);

        } catch (Exception e) {
            System.out.println("Número incorreto");
        }
    }
}
