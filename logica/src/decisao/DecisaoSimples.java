package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		
		if (media>=6) {
			System.out.println("Aprovado com media: " + media);
		}
		if (media<4) {
			System.out.println("Infelizmente você foi reprovado com a média: " + media);
		}
		
		// and => &&
		// or => ||
		
		if (media>=4 && media<6) {
			System.out.println("Você ainda tem uma chance no exame: " + media);
		}
		
		
		// Exibir a mensagem Infelizmente você foi reprovado com a média: xxxx
	}// metodo main

}// da classe
