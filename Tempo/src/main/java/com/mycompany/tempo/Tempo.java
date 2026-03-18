package com.mycompany.tempo;

import javax.swing.JOptionPane;
public class Tempo {
    
    // Atributo
    int minutos;
    
    // Método para converter minutos em horas
    public void converterparahoras() {
        double horas = minutos / 60.0;
        
        String mensagem = minutos + " minutos equivalem a " + String.format("%.2f", horas) + " horas";
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    // Método main
    public static void main(String[] args) {
        Tempo tempo = new Tempo();
        
        // Receceber valor
        String inputMinutos = JOptionPane.showInputDialog("Digite a quantidade de minutos:");
        tempo.minutos = Integer.parseInt(inputMinutos);
        
        // mostrarresultado
        tempo.converterparahoras();
    }
}