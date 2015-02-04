package br.com.fiap.pokemon.dao;

import java.sql.ResultSet;
import java.util.List;

import br.com.fiap.pokemon.to.TipoCausaTO;

public class TipoCausaDAO extends GenericDAO<TipoCausaTO> {

	@Override
	public List<TipoCausaTO> todos() {
		String sql = "SELECT * FROM T_AM_PO_TIPO_CAUSA";
		return todos(sql);
	}

	@Override
	public TipoCausaTO buscar(int codigo) {
		String sql = "SELECT * FROM T_AM_PO_TIPO_CAUSA WHERE CD_CAUSA = ?";
		return buscar(sql,codigo);
	}

	@Override
	public void inserir(TipoCausaTO objeto) {
		// DO NOTHING
		
	}

	@Override
	public void excluir(TipoCausaTO objeto) {
		// DO NOTHING
		
	}

	@Override
	public void atualizar(TipoCausaTO objeto) {
		// DO NOTHING
		
	}

	@Override
	protected TipoCausaTO carregarFromRS(ResultSet rs) {
		
		TipoCausaTO tipo = new TipoCausaTO();
		try {
			
			tipo.setCd_causa( rs.getInt("cd_causa") );
			tipo.setDs_causa( rs.getString("ds_causa") );
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return tipo;
	}

}
