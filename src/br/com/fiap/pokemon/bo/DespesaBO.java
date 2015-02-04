package br.com.fiap.pokemon.bo;

import java.util.List;

import br.com.fiap.pokemon.dao.DAOFactory;
import br.com.fiap.pokemon.dao.DespesaDAO;
import br.com.fiap.pokemon.dao.TipoDespesaDAO;
import br.com.fiap.pokemon.to.DespesaTO;
import br.com.fiap.pokemon.to.ProcessoTO;
import br.com.fiap.pokemon.to.TipoDespesaTO;


public class DespesaBO {
	
	public List<DespesaTO> getDespesas(ProcessoTO processo){
		return DAOFactory.get( DespesaDAO.class ).getDespesasProcesso(processo);
	}

	
	public List<TipoDespesaTO> getTiposDespesas(){
		return DAOFactory.get( TipoDespesaDAO.class ).todos();
	}
	
	public DespesaTO getDespesaL(int cd_lancamento){
		return DAOFactory.get( DespesaDAO.class ).buscar( cd_lancamento );
	}
	
}
