package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {
	public static void main(String[] args) {
		
		//Pe�a para o usu�rio: nome e idade
		// Voc� deve exibir:
		//"Obrigado a votar" se a idade for maior que 17 e menor que 70
		// "Voto Facultativo" se a idade for igual a 16 ou 17 ou idade for maior que 70
		// "Proibido votar" se a idade for menor que 16
		
		String nome = JOptionPane.showInputDialog("Digite seu nome").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		//short idade2 = Short.parseShort(JOptionPane.showInputDialog("Digite a sua idade"));
		
		if (idade<=16) {
			System.out.println("Proibido Votar " + nome + " sua idade � " + idade + " anos");
		}		
		if (idade>17 && idade<70) {
			System.out.println(nome + " obrigado a votar");
		}
		if (idade==16 || idade==17 || idade>=70) {
			System.out.println("Voto Facultativo " + nome + " sua idade � " + idade + " anos");
		}

		

	}
}
