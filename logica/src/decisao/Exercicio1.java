package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
A taxa de servi�os � de: 
R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; 
R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15;
R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
		 */

		short dias = Short.parseShort(JOptionPane.showInputDialog("Informe a quantidade de dias no hotel"));
		double valorDiaria = 0;
		if (dias>15) {
			valorDiaria = 85.5;
			//System.out.printf("O valor total com taxa: R$ " + (dias*(valorDiaria+5.5)));
		}else if (dias==15) {
			valorDiaria = 86;
			//System.out.printf("O valor total com taxa: R$ " + (dias*(valorDiaria+6.0)));
		}else {
			valorDiaria = 88;
			//System.out.println("O valor total com taxa: R$ " + (dias*(valorDiaria+8.0)));
		}
		System.out.println("Total: " + (valorDiaria*dias));

	}

}