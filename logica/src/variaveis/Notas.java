package variaveis;

import javax.swing.JOptionPane;

public class Notas {
	public static void main(String[] args) {
		// Input => nome, disciplina, duas notas
		// Exibir o nome do aluno, a m�dia e a disciplina
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String disciplina = JOptionPane.showInputDialog("Digita a primeira disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informa a primeira nota"));
		// String disciplina2 = JOptionPane.showInputDialog("Digite a segunda disciplina");
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		float media = (nota1 + nota2) / 2;
		
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Disciplina 1: " + disciplina + "Nota 1: " + nota1);
		//System.out.println("Disciplina 2: " + disciplina1 + "Nota 2: " + nota2);
		System.out.println("M�dia das notas: " + media);
		System.out.printf("%s sua m�dia na disciplina %s foi de %.2f", nome, disciplina, media);
		JOptionPane.showMessageDialog(null, nome + "\n" + disciplina + "\n" + media);
		
		/*
		 * Regras para os identificadores
		 * 1� Nunca come�ar�s com n�mero. 1berto (inv�lido) // h1berto (v�lido)
		 * 2� N�o utilizar�s palavras reservadas da linguagem. void (inv�lido)
		 * 3� N�o far�s uso de caracteres especiais. d@t@ (inv�lido) - data de nascimento (inv�lido)
		 * 
		 * Padr�es
		 * - come�ar com letras muniscula
		 * - utilizar o padr�o CamelCase. dataNacimento // numeroDeMatricula
		 * - nomes significativos
		 * 
		 * Toda classe come�a com letras maiuscula
		 * Todo m�todo vem seguido de parenteses
		 * 
		 * 
		 */
	}
}
