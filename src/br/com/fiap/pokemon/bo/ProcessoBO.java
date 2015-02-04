package br.com.fiap.pokemon.bo;

import java.util.List;

import br.com.fiap.pokemon.dao.DAOFactory;
import br.com.fiap.pokemon.dao.ProcessoDAO;
import br.com.fiap.pokemon.to.ProcessoTO;

public class ProcessoBO {

	public List<ProcessoTO> getProcessos(){
		return DAOFactory.get( ProcessoDAO.class ).todos();
	}
	
	public ProcessoTO getProcesso(int nr_processo){
		return DAOFactory.get( ProcessoDAO.class ).buscar( nr_processo );
	}
}
