/**
 * 
 */
package br.com.fiap.pokemon.interfaces;

import java.util.List;

import br.com.fiap.pokemon.to.HonorarioTO;
import br.com.fiap.pokemon.to.ProcessoTO;

/**
 * @author Docau
 *
 */
public interface IHonorarioDAO {

	public List<HonorarioTO> getHonorarios(ProcessoTO processo);
	public HonorarioTO getHonorario(HonorarioTO honorario);
	public void inserirHonorario(HonorarioTO honorario);
	public void excluirHonorario(HonorarioTO honorario);
	public void atualizarHonorario(HonorarioTO honorario);
	
}
