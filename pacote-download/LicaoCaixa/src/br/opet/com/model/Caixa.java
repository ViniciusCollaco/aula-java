package br.opet.com.model;

public class Caixa {

	private String desc;
	private int altura;
	private int largura;
	private int profundidade;

	public Caixa(String desc, int altura, int largura, int profundidade) {
		this.desc = desc;
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;

	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	public int getVolume(){
		return this.altura * this.largura * this.profundidade * 1000;
		
	}

}
