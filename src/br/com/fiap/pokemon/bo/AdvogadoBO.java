package br.com.fiap.pokemon.bo;

import java.util.List;

import br.com.fiap.pokemon.dao.AdvogadoDAO;
import br.com.fiap.pokemon.dao.DAOFactory;
import br.com.fiap.pokemon.to.AdvogadoTO;

public class AdvogadoBO {
		
	public List<AdvogadoTO> todos(){
		
		return DAOFactory.get(AdvogadoDAO.class).todos();
		
	}
	
}
