package br.opet.com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import br.opet.com.model.Caixa;
import br.opet.com.model.ResumoCaixa;
import br.opet.com.view.TelaCaixa;

public class ControllerCaixa {

	TelaCaixa tc = new TelaCaixa();
	ArrayList<Caixa> alCaixa = new ArrayList<>();

	public void executar() throws Exception {
		int opc = tc.menu();

		while (opc != 0) {
			switch (opc) {
			case 1:
				Caixa cx = tc.cadastro();
				alCaixa.add(cx);
				break;

			case 2:
				listar();
				break;

			case 3:
				resumir();
				break;

			default:
				tc.erroMenu();
				break;
			}

			opc = tc.menu();

		}

	}

	private void resumir() {
		HashMap<String, ResumoCaixa> hRes = new HashMap<>();
		for (Caixa caixa : alCaixa) {
			if (hRes.containsKey(caixa.getDesc())) { //tem o resumo do item
				ResumoCaixa res = hRes.get(caixa.getDesc());
				res.setVolume(res.getVolume() + caixa.getVolume());
			} else { //não tem o resumo do item
				ResumoCaixa res = new ResumoCaixa();
				res.setDesc(caixa.getDesc());
				res.setVolume(caixa.getVolume());
				hRes.put(res.getDesc(), res);
			}

		}
		for (ResumoCaixa rcx : hRes.values()) {
			tc.resumo(rcx);
		}

	}

	private void listar() {
		for (Caixa caixa : alCaixa) {
			tc.lista(caixa);

		}
	}

}
