package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1�) Crie um programa que pergunte ao usu�rio o seu n�vel de escolaridade 
		 * (M�dio, Superior ou P�s) enquanto a resposta for v�lida, 
		 * ir� computando os totais dos n�veis digitados, 
		 * no final apresente somente o n�vel que foi mais votado.
		 */
		String escolaridade = "";
		int contamedio = 0;
		int contasuperior = 0;
		int contapos = 0;

		/*
		 * 		do {
			candidato = JOptionPane.showInputDialog("Digite <X> ou <Y>").toUpperCase();
			if (candidato.equals("X")) {
				totalX=totalX+1;
			}else if (candidato.equals("Y")) {
				totalY=totalY+1;
			}
		}while(candidato.equals("X") || candidato.equals("Y"));
		 */


		do {

			escolaridade = JOptionPane.showInputDialog("Digite o seu grau de escolaridade - Medio, Superior ou Pos").toUpperCase();
			if (escolaridade.equals("MEDIO")) {
				contamedio++;
			}else if(escolaridade.equals("SUPERIOR")) {
				contasuperior++;
			}else if (escolaridade.equals("POS"))	{
				contapos++;
			}

		}while (escolaridade.equals("SUPERIOR") || escolaridade.equals("MEDIO") || escolaridade.equals("POS"));
		if (contamedio == 0 && contasuperior == 0 && contapos ==0) {
			System.out.println("Os votos n�o foram computados");
		}else if(contamedio > contasuperior && contamedio > contapos) {
			System.out.println("O mais votado, foi a escolaridade Medio com " + contamedio + " votos");
		}else if(contasuperior > contamedio && contasuperior > contapos) {
			System.out.println("O mais votado, foi a escolaridade Superior com " + contasuperior + " votos");
		}else {
			System.out.println("O mais votado, foi a escolaridade Pos com " + contapos + " votos");
		}


	}

}
