package br.com.fiap.pokemon.dao;

import java.sql.ResultSet;
import java.util.List;

import br.com.fiap.pokemon.to.AdvogadoTO;

public class AdvogadoDAO extends GenericDAO<AdvogadoTO> {



	@Override
	public List<AdvogadoTO> todos() {

		String sql = "SELECT * "
				+ "FROM T_AM_PO_ADVOGADO A "
				+ "		INNER JOIN T_AM_PO_PESSOA P ON(A.CD_ADVOGADO = P.CD_PESSOA)";
		return todos(sql);

	}


	@Override
	public AdvogadoTO buscar(int codigo) {

		String sql = "SELECT * "
				+ "FROM T_AM_PO_ADVOGADO A "
				+ "		INNER JOIN T_AM_PO_PESSOA P ON(A.CD_ADVOGADO = P.CD_PESSOA)"
				+ "WHERE A.cd_advogado = ?";
		return buscar(sql, codigo);

	}


	@Override
	public void inserir(AdvogadoTO objeto) {
		// TODO Auto-generated method stub

	}


	@Override
	public void excluir(AdvogadoTO objeto) {
		// TODO Auto-generated method stub

	}


	@Override
	public void atualizar(AdvogadoTO objeto) {
		// TODO Auto-generated method stub

	} 

	@Override
	protected AdvogadoTO carregarFromRS(ResultSet rs)
	{
		AdvogadoTO p = new AdvogadoTO();

		try{

			p.setCd_pessoa(rs.getInt("cd_pessoa"));
			p.setNm_pessoa(rs.getString("nm_pessoa"));

			p.setCd_advogado(rs.getInt("cd_advogado"));
			p.setNr_oab(rs.getInt("nr_oab"));
			p.setNr_cpf(rs.getLong("nr_cpf"));
			p.setNr_rg(rs.getString("nr_oab"));
			p.setDs_email(rs.getString("ds_email"));
			p.setDs_password(rs.getString("ds_password"));

		}catch(Exception e){

			System.out.println(e.getMessage());

		}

		return p;
	}

}
