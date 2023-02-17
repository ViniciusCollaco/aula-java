package br.opet.com.controller;

import br.opet.com.view.EscolhaOp;

public class ControleGenises {

	EscolhaOp esc = new EscolhaOp();
	ControlEsc con = new ContolEsc();
	
	public void executar() throws Exception{
		int opc = esc.show();
		while(opc != 0) {
			switch (opc) {
			case 1://CADASTRO
				con.cadastrar();
				break;
			case 2://CONSULTA
				con.consultar();
				break;
			default:
				esc.opcaoIvalida();
				break;
			}
			opc = esc.show();
		}
		
	}
	
}
