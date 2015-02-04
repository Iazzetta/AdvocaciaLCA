package br.com.fiap.pokemon.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.pokemon.to.TipoDespesaTO;

public class TipoDespesaDAO extends GenericDAO<TipoDespesaTO> {

	@Override
	public List<TipoDespesaTO> todos() {
		
		String sql="SELECT * FROM T_AM_PO_TIPO_DESPESA";
		
		return todos(sql);
	}

	@Override
	public TipoDespesaTO buscar(int codigo) {
		
		String sql = "SELECT * FROM T_AM_PO_TIPO_DESPESA WHERE CD_TIPO_DESPESA=?";
		
		return buscar(sql, codigo);
	}

	@Override
	public void inserir(TipoDespesaTO  objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(TipoDespesaTO objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(TipoDespesaTO objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected TipoDespesaTO carregarFromRS(ResultSet rs) {
		
		TipoDespesaTO tipo = new TipoDespesaTO();
		
		try {
			tipo.setCd_tipo_despesa(rs.getInt("cd_tipo_despesa"));
			tipo.setDs_tipo_despesa(rs.getString("ds_tipo_despesa"));
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		return tipo; //TODO TODO BIXA É BIXA TODO VIADO É VIADO ENTAO TODO TODO É O MC DOGÃO
	}

}
