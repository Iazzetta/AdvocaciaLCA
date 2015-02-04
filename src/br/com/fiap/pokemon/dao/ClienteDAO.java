package br.com.fiap.pokemon.dao;

import java.sql.ResultSet;
import java.util.List;

import br.com.fiap.pokemon.to.ClienteTO;

public class ClienteDAO extends GenericDAO<ClienteTO> {


	@Override
	public List<ClienteTO> todos() {

		String sql = "SELECT * "
				+ "FROM T_AM_PO_CLIENTE C "
				+ "		INNER JOIN T_AM_PO_PESSOA P ON(C.CD_CLIENTE = P.CD_PESSOA)";


		return todos(sql);
	}

	@Override
	public ClienteTO buscar(int codigo) {

		String sql = "SELECT * "
				+ "FROM T_AM_PO_CLIENTE C "
				+ 		"INNER JOIN T_AM_PO_PESSOA P ON(C.CD_CLIENTE = P.CD_PESSOA)"
				+ "WHERE C.CD_CLIENTE = ?";

		return buscar(sql,codigo);

	}

	@Override
	public void inserir(ClienteTO pessoa) {
		// TODO Auto-generated method stub


	}

	@Override
	public void excluir(ClienteTO pessoa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(ClienteTO pessoa) {
		// TODO Auto-generated method stub

	}

	protected ClienteTO carregarFromRS(ResultSet rs){
		ClienteTO p = new ClienteTO();

		try{
			p.setCd_pessoa(rs.getInt("cd_pessoa"));
			p.setNm_pessoa(rs.getString("nm_pessoa"));

			p.setCd_cliente(rs.getInt("cd_cliente"));
			p.setDs_razao_social(rs.getString("ds_razao_social"));
			p.setNr_cpnj(rs.getString("nr_cnpj"));
			p.setNr_insc_estadual(rs.getString("nr_insc_estadual"));
			p.setDs_email(rs.getString("ds_email"));
			p.setDs_password(rs.getString("ds_password"));

		}catch(Exception e){
			System.out.println(e.getMessage());
		}

		return p;
	}

}
