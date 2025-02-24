package br.com.fiap;

import java.util.Scanner;

public class RetanguloScanner {
    public static void main(String[] args) {
        float base, altura, resultado;
        Scanner scan;

        try {
            scan = new Scanner(System.in);
            System.out.println("Digite a base");
            base = scan.nextFloat();
            System.out.println("Agora igite a altura");
            altura = scan.nextFloat();

            resultado = base * altura;
            System.out.printf("A área é: %.2f", resultado);

        } catch (Exception e) {
            System.out.println("Número incorreto");
        }
    }

}
