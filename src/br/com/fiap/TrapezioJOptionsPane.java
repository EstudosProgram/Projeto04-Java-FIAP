package br.com.fiap;

import javax.swing.*;
import java.util.Scanner;

public class TrapezioJOptionsPane {
    public static void main(String[] args) {
        float base_menor, base_maior, altura, resultado;
        String scan;

        try {
            scan = JOptionPane.showInputDialog("Digite a base menor");
            base_menor = Float.parseFloat(scan);
            scan = JOptionPane.showInputDialog("Digite a base maior");
            base_maior = Float.parseFloat(scan);
            scan = JOptionPane.showInputDialog("Digite a altura");
            altura = Float.parseFloat(scan);

            resultado = (base_maior + base_menor) * altura / 2;
            JOptionPane.showMessageDialog(null,"A área é: " + resultado);
        } catch (Exception e) {
            System.out.println("Número incorreto");
        }
    }
}
