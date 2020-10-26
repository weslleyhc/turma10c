package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		/*
		 * Solicitar dia, mes e ano, em vari�veis separadas
		 * valide se o ano est� entre 1950 2002
		 * valide se o mes est� entre 1 e 12
		 * valida se o dia est� entre 1 e 30 (para alguns meses) ou
		 * entre 1 e 31 para outros meses
		 * No final exibe a data completa
		 */

		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
		
		while (ano<1950 || ano>2002 ) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Informe um ano v�lido entre 1950 e 2002"));
		}
		while (mes<1 || mes>12) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Informe um m�s v�lido 1 a 12"));
		}
		if (mes==2 || mes==4 || mes==6 || mes==9 || mes==11) { //meses com at� 30 dias
			while (dia<1 || dia>30) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}else {
			while (dia<1 || dia>31) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}		
		
		System.out.println("A data informada: " + dia + "/" + mes + "/" + ano );	

	}

}
