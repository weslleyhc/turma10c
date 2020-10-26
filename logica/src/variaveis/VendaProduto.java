package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		// Crie as variaveis para armazenar nome do produto, codigo, valor e qtde.
		//Exiba no final o nome do produto, o total e o total com 10% de desconto
		
		/*
		 * Parse => convers�o entre tipos incompativeis ( String => primitivo)
		 * Primitivo => s�o os tipos que fazem parte da linguagem (come�a com letra minusculas)
		 * boolean => armazena True ou False
		 * char => armazena um caracter
		 * byte => n�meros inteiros ( -127 // +128 )
		 * short => n�meros inteiros (-32k // +32k )
		 * int => n�meros inteiros ( -2bilhoes // +2bilhoes )
		 * long => n�meros inteiros 
		 * float => n�meros reais
		 * double => n�meros reais (possui o dobro de precis�o nas casas decimais)
		 * 
		 * Casse Wrapper => s�o classes que apoiam os tipos primitivos. Exemplo: parse().
		 * int => Integer
		 * double => Double
		 * float => Float
		 * boolean = Boolean
		 */
		
		String produto = JOptionPane.showInputDialog("Digite o produto");
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		double total = qtde * valor;
		double totaldesc = qtde*valor*0.9;
				
		System.out.println("Produto: " + produto);
		System.out.println("Total..: " + total);
		System.out.println("Total com desconto: " + totaldesc);
		System.out.println("Total com desconto: " + (total*0.9));
		
		/* 
		 * System.out.println("Produto: " + produto);
		* System.out.println("Total: " + (qtde*valor));
		* System.out.println("Total com Desconto: " + (qtde*valor*0.9));
		*/
}
}
