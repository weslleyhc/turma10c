package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {
	
	public static void main(String[] args) {
		
		/*
		 * Pe�am o total de faltas
		 * se o total de faltas for maior que 20, aluno est� reprovado
		 * 
		 */
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Informe a quantidade de faltas"));
		
		if (faltas>20) {
			System.out.println("Aluno reprovado por faltas");
		} else if (media>=6 && faltas<=20) {
			System.out.println("Aprovado com media: " + media);
		}else if (media<4 && faltas<=20) {
			System.out.println("Infelizmente voc� foi reprovado com a m�dia: " + media);
		}else  {
			System.out.println("Voc� ainda tem uma chance no exame: " + media);
		}
		
		// and => &&
		// or => ||
		
		
		
		
		// Exibir a mensagem Infelizmente voc� foi reprovado com a m�dia: xxxx
	}// metodo main

}// da classe
