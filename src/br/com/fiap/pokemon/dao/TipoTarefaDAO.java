package br.com.fiap.pokemon.dao;

import java.sql.ResultSet;
import java.util.List;

import br.com.fiap.pokemon.to.TipoTarefaTO;

public class TipoTarefaDAO extends GenericDAO<TipoTarefaTO> {

	@Override
	public List<TipoTarefaTO> todos() {
		String sql = "SELECT * FROM T_AM_PO_TIPO_TAREFA";
		return todos(sql);
	}

	@Override
	public TipoTarefaTO buscar(int codigo) {
		String sql = "SELECT * FROM T_AM_PO_TIPO_TAREFA WHERE cd_tipo_tarefa = ?";
		return buscar(sql,codigo);
	}

	@Override
	public void inserir(TipoTarefaTO objeto) {
		// do nothing
		
	}

	@Override
	public void excluir(TipoTarefaTO objeto) {
		// do nothing
		
	}

	@Override
	public void atualizar(TipoTarefaTO objeto) {
		// do nothing
		
	}

	@Override
	protected TipoTarefaTO carregarFromRS(ResultSet rs) {
		TipoTarefaTO tipo = new TipoTarefaTO();
		try {
			
			tipo.setCd_tipo_tarefa( rs.getInt("cd_tipo_tarefa") );
			tipo.setDs_tipo_tarefa( rs.getString("ds_tipo_tarefa") );
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return tipo;
	}

	
	
}
