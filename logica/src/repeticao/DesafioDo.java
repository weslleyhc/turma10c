package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * Um jogo de adivinhação
		 * O jogador 1 digita um número inteiro
		 * O jogador 2 tem q adivinhar o numero que foi digitado pelo jogador 1
		 * Enquanto ele não acertar o jogo continua perguntando o número
		 * 
		 * etapa2:
		 * acresente uma contagem de tentativas do jogador 2 e apresente
		 * quantas ele usou para acertar o número
		 * 
		 * Etapa 3:
		 * Acrescente dicas, para o jogador 2, indicando se o número que
		 * ele está tentando adivinhar é maior ou menor do que o que ele chutou
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número a ser advinhado"));
		int chute = 0;
		int contador=0;

		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Tente acertar o número digitado"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				JOptionPane.showMessageDialog(null, "O número é maior");
			}else if (numero<chute) {
				JOptionPane.showMessageDialog(null, "O número é menor");
			}
		}while(numero!=chute);
		System.out.println("Parabéns você acertou com " + contador + " tentativa(s).");

	}

}
