package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * Um jogo de adivinha��o
		 * O jogador 1 digita um n�mero inteiro
		 * O jogador 2 tem q adivinhar o numero que foi digitado pelo jogador 1
		 * Enquanto ele n�o acertar o jogo continua perguntando o n�mero
		 * 
		 * etapa2:
		 * acresente uma contagem de tentativas do jogador 2 e apresente
		 * quantas ele usou para acertar o n�mero
		 * 
		 * Etapa 3:
		 * Acrescente dicas, para o jogador 2, indicando se o n�mero que
		 * ele est� tentando adivinhar � maior ou menor do que o que ele chutou
		 */

		int numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero a ser advinhado"));
		int chute = 0;
		int contador=0;

		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Tente acertar o n�mero digitado"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				JOptionPane.showMessageDialog(null, "O n�mero � maior");
			}else if (numero<chute) {
				JOptionPane.showMessageDialog(null, "O n�mero � menor");
			}
		}while(numero!=chute);
		System.out.println("Parab�ns voc� acertou com " + contador + " tentativa(s).");

	}

}
