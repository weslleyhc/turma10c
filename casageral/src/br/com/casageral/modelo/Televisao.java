package br.com.casageral.modelo;

public class Televisao {
	private String marca;
	private float valor;
	private boolean status;
	private int canal;
	private int volume;

	public void preencherMarca(String pMarca) {
		marca = pMarca.toUpperCase();
	}
	public String retornaMarca() {
		return marca;
	}

	public void preencherValor (float pValor) {
		valor = pValor;
	}

	public float retornaValor() {
		return valor;
	}
	public void ligar() {
		status=true;
	}
	public void desligar() {
		status=false;
		canal=0;
	}

	public boolean retornarStatus() {
		return status;
	}

	public void mudarCanal(int pCanal) {
		if (status==true && pCanal>0) {
			canal=pCanal;
		}
	}
	public int retornaCanal( ) {
		return canal;
	}
	public void aumentarVolume(int pVolume) {
		if (status==true && pVolume>0) {
			volume+=pVolume;
		}
	}

	public void diminuirVolume (int pVolume) {
		if (status == true && (volume-pVolume)>=0) {
			volume-=pVolume;
		}
	}

	public int retornarVolume() {
		return volume;
	}

	public String retornarTudo() {
		return
				"Marca: " + marca + "\n" +
				"Valor: " + valor + "\n" +
				"Status: " + status + "\n" +
				"Volume: " + volume + "\n" +
				"Canal: " + canal;
	}
}