package br.com.fiap.pokemon.dao;
import java.sql.ResultSet;
import java.util.List;

import br.com.fiap.pokemon.to.ForumTO;

public class ForumDAO extends GenericDAO<ForumTO> {

	@Override
	public List<ForumTO> todos() {

		String sql = "SELECT * "
				+ "FROM T_AM_PO_FORUM F "
				+ "		INNER JOIN T_AM_PO_PESSOA P ON(F.CD_FORUM = P.CD_PESSOA)";

		return todos(sql);

	}

	@Override
	public ForumTO buscar(int codigo) {

		String sql = "SELECT * "
				+ "FROM T_AM_PO_FORUM F "
				+ "		INNER JOIN T_AM_PO_PESSOA P ON(F.CD_FORUM = P.CD_PESSOA) "
				+ "WHERE cd_forum = ?";

		return buscar(sql, codigo);
	}

	@Override
	public void inserir(ForumTO pessoa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(ForumTO pessoa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(ForumTO pessoa) {
		// TODO Auto-generated method stub

	}

	protected ForumTO carregarFromRS(ResultSet rs){
		ForumTO p = new ForumTO();

		try{

			p.setCd_pessoa(rs.getInt("cd_pessoa"));
			p.setNm_pessoa(rs.getString("nm_pessoa"));

			p.setCd_forum(rs.getInt("cd_forum"));
			p.setDs_forum(rs.getString("ds_forum"));

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return p;
	}
}
