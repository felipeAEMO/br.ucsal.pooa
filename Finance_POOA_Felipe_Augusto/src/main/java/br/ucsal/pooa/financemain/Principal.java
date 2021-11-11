package br.ucsal.pooa.financemain;

import br.ucsal.pooa.finance.persistencia.LancamentoDAO;
import br.ucsal.pooa.finance.view.Window;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LancamentoDAO dao = new LancamentoDAO();
		Window window = new Window(dao.listar());

	}

}
