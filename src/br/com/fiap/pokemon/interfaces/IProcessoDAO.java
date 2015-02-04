/**
 * 
 */
package br.com.fiap.pokemon.interfaces;

import java.util.List;

import br.com.fiap.pokemon.to.ProcessoTO;

/**
 * Interface relacionada à entidade Processo
 * @author Docau
 *
 */
public interface IProcessoDAO {
	
	public List<ProcessoTO> getProcessos();
	public ProcessoTO getProcesso(int nr_processo);
	public void inserirProcesso(ProcessoTO processo);
	public void excluirProcesso(ProcessoTO processo);
	public void atualizarProcesso(ProcessoTO processo);
	

}
