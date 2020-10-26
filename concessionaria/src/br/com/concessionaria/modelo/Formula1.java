package br.com.concessionaria.modelo;

public class Formula1 {
	private String cor;
	private String escuderia;
	private boolean status;
	private float velocidadeAtual;
	private float valor;
	private String ligar;
	private String desligar;
	private float acelerar;
	private float desacelerar;

	//Sintaxe para os metodos
	//<modificador> <Tipo do Retorno> <nomeMetodo> (<TipoParam> <nomeParam>{ 
	public void preencherEscuderia(String pEscuderia) {
		escuderia=pEscuderia.toUpperCase();
	}

	public String retornarEscuderia() {
		return escuderia;
	}

	public void preencherCor(String pCor) {
		cor=pCor.toUpperCase();
	}

	public String retornoCor() {
		return cor;
	}

	public void preencherValor(float pValor) {
		valor = pValor;
	}
	public float retornaValor() {
		return valor;
	}

	public String ligar() {
		status=true;
		return "Carro ligado";
	}

	public String desligar() {
		status=false;
		return "Carro desligado";
	}

	public void acelerar (float pVelocidade) {
		if(status==true) {
			velocidadeAtual+=pVelocidade;	
		}		
	}

	public void desacelerar (float pVelocidade) {
		if (status==true) {
			velocidadeAtual-=pVelocidade;
			if (velocidadeAtual<0) {
				velocidadeAtual=0;
			}
		}

	}
	public float retornarVelocidadeAtual() {
		return velocidadeAtual;
	}


	//preenchercor() - preencherValor() - retornarCor() - retornarValor()

}//fechar classe
