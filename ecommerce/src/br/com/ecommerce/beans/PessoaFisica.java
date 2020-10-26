package br.com.ecommerce.beans;

public class PessoaFisica extends Cliente{
	private String cfp;
	private String rg;
	
		
	public void setAll (int id, String nome, String fone, Endereco endereco, String cfp, String rg) {
		super.setAll(id, nome, fone, endereco);
		this.cfp = cfp;
		this.rg = rg;
	}

	public String getAll() {
		return
				super.getAll() + "\n" +
				"CPF.: " + cfp + "\n" +
				"RG..: " + rg;
	}
		
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(int id, String nome, String fone, Endereco endereco, String cfp, String rg) {
		super(id, nome, fone, endereco);
		this.cfp = cfp;
		this.rg = rg;
	}
	public String getCfp() {
		return cfp;
	}
	public void setCfp(String cfp) {
		this.cfp = cfp;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	

}
