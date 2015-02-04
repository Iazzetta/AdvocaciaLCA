package br.com.fiap.pokemon.bo;

import java.util.List;

import br.com.fiap.pokemon.dao.DAOFactory;
import br.com.fiap.pokemon.dao.HonorarioDAO;
import br.com.fiap.pokemon.dao.TipoTarefaDAO;
import br.com.fiap.pokemon.to.HonorarioTO;
import br.com.fiap.pokemon.to.ProcessoTO;
import br.com.fiap.pokemon.to.TipoTarefaTO;


public class HonorarioBO {

	public List<HonorarioTO> getHonorarios(ProcessoTO processo){
		
		return DAOFactory.get( HonorarioDAO.class ).getHonorariosProcesso( processo );
		
	}
	
	public List<TipoTarefaTO> getTiposTarefas(){
		return DAOFactory.get( TipoTarefaDAO.class ).todos();
	}
	
	public HonorarioTO getHonorarioL(int cd_lancamento){
		return DAOFactory.get( HonorarioDAO.class ).buscar( cd_lancamento );
	}
	
}
