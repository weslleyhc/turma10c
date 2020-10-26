package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		while (email.indexOf("@")==-1) {
			email = JOptionPane.showInputDialog("Email deve ter @ ").toLowerCase();
		}
		System.out.println(email);
		
		// Pe�a o nome do usu�rio e n�o ceite nomes com menos de cinco caracteres
		//ou com mais de 20 caracteres
		
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		while (nome.length()<5 || nome.length()>20) {
			nome = JOptionPane.showInputDialog("Digite um nome entre 5 e 20 caracter ").toUpperCase();
			
		}
		System.out.println("Nome " + nome);

	}

}
