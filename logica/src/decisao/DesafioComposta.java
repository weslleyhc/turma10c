package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		// Pe�a a entrada de Veiculo, capacidade de passageiros
		// Exiba a mensagem: 
		//"Veiculo Categoria A", se a qts passageiros for igual a 2
		// "Veiculo Categoria B", se a qts de passageiros for entre 4 e 7
		// "Veiculo Categoria C", se a qts de passageiros for maior que 7
		String veiculo = JOptionPane.showInputDialog("Veiculo").toUpperCase();
		short passageiros = Short.parseShort(JOptionPane.showInputDialog("Informe a quantidade de passageiros"));
		//byte passageiros - Byte.parseByte(JOptionPane.showInputDialog("Passageiros"));

		if (passageiros>7) {
			System.out.println("Ve�culo Categoria C, pois possuem " + passageiros + " passageiros");
		} else if (passageiros>=4 && passageiros<=7) {
			System.out.println("Ve�culo Cateforia B, pois possuem " + passageiros + " passageiros");
		}else if (passageiros==2) {
			System.out.println("Ve�culo Categoria A, pois possuem " + passageiros + " passageiros");
		} else {
			System.out.println("Categoria desconhecida");
		}

	}

}
