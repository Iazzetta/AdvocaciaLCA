package br.com.fiap.pokemon.interfaces;

import java.util.List;

import br.com.fiap.pokemon.to.DespesaTO;
import br.com.fiap.pokemon.to.ProcessoTO;

/**
 * 
 * Interface referente a entidade Lançar Despesa
 * @author Docau
 *
 */
public interface IDespesaDAO {

	public List<DespesaTO> getDespesas(ProcessoTO processo);
	public DespesaTO getDespesa(DespesaTO despesa);
	public void inserirDespesa(DespesaTO despesa);
	public void excluirDespesa(DespesaTO despesa);
	public void atualizarDespesa(DespesaTO despesa);
}
