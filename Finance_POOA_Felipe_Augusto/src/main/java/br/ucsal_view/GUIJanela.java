package br.ucsal_view;
import java.util.List;
import java.util.Scanner;

import br_ucsal.Links.*;

public class GUIJanela {
	private Scanner sc = new Scanner(System.in);
	private List<Lancamento_Mes> lista;

	public void listar() {
		for (Lancamento_Mes lancamento : lista) {
			System.out.println(lancamento);
		}
	}

	public void cadastrar() {
		lista.add(null);
	}
}
