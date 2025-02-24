package br.com.fiap;

import javax.swing.*;

public class TrianguloJOptionPane {
    public static void main(String[] args) {
        float base, altura, resultado;
        String scan;

        try {
            scan = JOptionPane.showInputDialog("Digite a base");
            base = Float.parseFloat(scan);
            scan = JOptionPane.showInputDialog("Digite a altura");
            altura = Float.parseFloat(scan);

            resultado = (base * altura) / 2;

            JOptionPane.showMessageDialog(null,"A área é:" + resultado);


        } catch (Exception e) {
            System.out.println("Número incorreto");
        }

    }
}
