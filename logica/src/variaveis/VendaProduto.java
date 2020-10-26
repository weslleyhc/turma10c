package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		// Crie as variaveis para armazenar nome do produto, codigo, valor e qtde.
		//Exiba no final o nome do produto, o total e o total com 10% de desconto
		
		/*
		 * Parse => conversão entre tipos incompativeis ( String => primitivo)
		 * Primitivo => são os tipos que fazem parte da linguagem (começa com letra minusculas)
		 * boolean => armazena True ou False
		 * char => armazena um caracter
		 * byte => números inteiros ( -127 // +128 )
		 * short => números inteiros (-32k // +32k )
		 * int => números inteiros ( -2bilhoes // +2bilhoes )
		 * long => números inteiros 
		 * float => números reais
		 * double => números reais (possui o dobro de precisão nas casas decimais)
		 * 
		 * Casse Wrapper => são classes que apoiam os tipos primitivos. Exemplo: parse().
		 * int => Integer
		 * double => Double
		 * float => Float
		 * boolean = Boolean
		 */
		
		String produto = JOptionPane.showInputDialog("Digite o produto");
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
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
