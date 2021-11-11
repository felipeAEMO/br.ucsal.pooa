package br.ucsal.pooa.finance.persistencia;
import br.ucsal.pooa.finance.model.*;
import java.util.ArrayList;
import java.util.List;

public class LancamentoDAO {
	
	private List<Lancamento> list = new ArrayList<>();
	
	public LancamentoDAO() {
		
	}
	public List<Lancamento> listar() {
		 
		return list;
	}
	public void inserir(Lancamento lancamento) {
		 
		list.add(lancamento);
	}
}
