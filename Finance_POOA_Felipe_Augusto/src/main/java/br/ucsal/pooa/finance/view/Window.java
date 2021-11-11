package br.ucsal.pooa.finance.view;

import java.math.BigDecimal;
import java.util.*;

import br.ucsal.pooa.finance.model.Lancamento;

public class Window {
	private Scanner sc = new Scanner(System.in);

	private List<Lancamento> lista;

	public Window(List<Lancamento> lista) {
		this.lista = lista;
		init();
	}

	public void init() {
		String op;
		do {
			System.out.println("MENU:");
			System.out.println("1 - CADASTRAR");
			System.out.println("2 - LISTAR");
			System.out.println("3 - SALDO");
			System.out.println("S - SAIR");
			System.out.println("OPCÃO: ");
			op = sc.nextLine();
		} 
		while (
				!(		op.equals("1") || 
						op.equals("2") ||
						op.equals("3") ||
						op.equalsIgnoreCase("S"))
				);
		switch (op) {
		case "1":
			cadastrar();
			break;
		case "2":
			listar();
			break;
		case "3":
			saldo();
			break;
		default:
			System.exit(0);
			break;
		}
	}
	
	public void saldo() {
		BigDecimal saldo = BigDecimal.ZERO;
		for (Lancamento lancamento : lista ) {
			if(lancamento.equals("DESPESA")) {
				saldo.subtract(lancamento.getValor());
			} else {
				saldo.add(lancamento.getValor());
			}
		}
		System.out.println(saldo.toPlainString());
		init();
	}
	public void listar() {
		for (Lancamento lancamento : lista ) {
			System.out.println(lancamento);
		}
	}

	public void cadastrar() {
		String tipo;
		do {
			System.out.println("Digite o Tipo 1 -  DESPESA ou 2 RECEITA [1 - DESPESA] :");
			tipo = sc.nextLine();
			tipo = tipo.trim();
			if (tipo.isEmpty() ||tipo.equals("1")) {
				tipo = "DESPESA";
			} else if (tipo.equals("2")) {
				tipo = "RECEITA";
			}
		} while(!(tipo.equals("DESPESA") || tipo.equals("RECEITA")));
		System.out.println("Digite a Descrição["+tipo+"]:");
		String descricao = sc.nextLine();
		if(descricao.isEmpty()) {
			descricao = tipo;
		}
		System.out.println("Digite o Valor:");
		String valor = sc.nextLine();
		BigDecimal amont = new BigDecimal(valor);
		Lancamento lancamento = new Lancamento(tipo,amont,descricao);
		lista.add(lancamento);
	}
}
