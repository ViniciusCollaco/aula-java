package br.opet.com.view;

import com.opet.util.Reader;

import br.opet.com.model.Caixa;
import br.opet.com.model.ResumoCaixa;

public class TelaCaixa {

	public Caixa cadastro() throws Exception {

		System.out.println("Desc: ");
		String desc = Reader.readString();
		System.out.println("Altura (M): ");
		int altura = Reader.readInt();
		System.out.println("Largura (M): ");
		int largura = Reader.readInt();
		System.out.println("Profundidade (M): ");
		int profundidade = Reader.readInt();

		Caixa cx = new Caixa(desc, altura, largura, profundidade);

		return cx;

	}

	public int menu() throws Exception {
		int opc = -1;
		System.out.println("1 - Cadastro");
		System.out.println("2 - Listagem");
		System.out.println("3 - Resumo");
		System.out.println("0 - Sair");
		opc = Reader.readInt();
		return opc;
	}

	public void lista(Caixa cx) {
		System.out.println(cx.getDesc() + " - A:" + 
							cx.getAltura() + " - L:" + 
							cx.getLargura() + " - P:" + 
							cx.getProfundidade());

	}

	public void erroMenu() {
		System.out.println("Opção invalida!!!");
	}
	
	public void resumo(ResumoCaixa rcx) {
		System.out.println(rcx.getDesc() + " V:" + rcx.getVolume() + "Litros");

	}

}
