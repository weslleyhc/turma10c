package br.com.unixyz.modelo;

public class Curso {
	private int id;
	private String descricao;
	private float valor;
	private int cargaHoraria;

	public void setAll(int id, String descricao, float valor, int cargaHoraria) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getAll() {
		return
				"ID...........: " + id + "\n" +
				"Descri��o....: " + descricao + "\n" +
				"Valor........: " + valor + " Reais" + "\n" +
				"Carga Hor�ria: " + cargaHoraria + " Horas";	
	}

	public Curso() {
		super();
	}
	public Curso(int id, String descricao, float valor, int cargaHoraria) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}






}
