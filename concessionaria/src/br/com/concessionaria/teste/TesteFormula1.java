package br.com.concessionaria.teste;

import javax.swing.JOptionPane;

import br.com.concessionaria.modelo.Formula1;

public class TesteFormula1 {

	public static void main(String[] args) {
		// Criar um objeto
		Formula1 objeto = null;
		//Instanciar um objeto
		Formula1 carro = new Formula1();
		carro.preencherEscuderia(JOptionPane.showInputDialog("Digite a Escuderia"));
		carro.preencherCor("Vermelho");
		carro.preencherValor(1000);
		carro.ligar();
		carro.desligar();
		System.out.println(carro.retornarEscuderia());
		System.out.println(carro.retornoCor());
		System.out.println(carro.retornaValor());
		if (JOptionPane.showConfirmDialog(null, "Ligar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0) {
			System.out.println(carro.ligar());
		}else {
			System.out.println(carro.desligar());
		}
		
		carro.acelerar(50); 
		carro.acelerar(30);
		System.out.println(carro.retornarVelocidadeAtual());
		carro.desacelerar(120);
		System.out.println(carro.retornarVelocidadeAtual());
		//System.out.println(carro.ligar());
		//System.out.println(carro.desligar());
	}

}