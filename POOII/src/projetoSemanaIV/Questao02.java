package projetoSemanaIV;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Questao02 {
	public static void main(String[] args) {
		String nome;
		nome = (String) JOptionPane.showInputDialog(
				null, 
				"Insira a largura e a altura de um retângulo",
				"Entrada de Dados",
				0, 
				new ImageIcon(Questao01.class.getResource("/resources/homer.jpg")), 
				null, 
				null);
		
		JOptionPane.showMessageDialog(
				null, 
				"Nome do estudante: " + nome, 
				"Saída de Dados", 
				0,
				new ImageIcon(Questao01.class.getResource("/resources/homer.jpg")));
	}
}
