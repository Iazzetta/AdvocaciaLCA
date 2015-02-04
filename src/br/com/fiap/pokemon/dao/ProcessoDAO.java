package br.com.fiap.pokemon.dao;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.pokemon.to.ProcessoTO;

public class ProcessoDAO extends GenericDAO<ProcessoTO> {

	public List<ProcessoTO> todos() {

		String sql = "SELECT * "
				+ "FROM T_AM_PO_PROCESSO";
		return todos(sql);
		
	}

	@Override
	public ProcessoTO buscar(int codigo) {

		String sql = "SELECT * "
				+ "FROM T_AM_PO_PROCESSO "
				+ "WHERE NR_PROCESSO = ?";


		return buscar(sql, codigo);

	}

	@Override
	public void inserir(ProcessoTO objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(ProcessoTO objeto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(ProcessoTO objeto) {
		// TODO Auto-generated method stub

	}

	protected ProcessoTO carregarFromRS( ResultSet rs) {

		ProcessoTO p = new ProcessoTO();

		try{
			
			p.setNr_processo( rs.getInt("nr_processo") );

			p.setCliente( DAOFactory.get(ClienteDAO.class).buscar( rs.getInt("cd_cliente") ) );
			p.setAdvogado( DAOFactory.get(AdvogadoDAO.class).buscar( rs.getInt("cd_advogado") ) );
			p.setTipoCausa( DAOFactory.get(TipoCausaDAO.class).buscar( rs.getInt("cd_causa") ) );
			p.setForum( DAOFactory.get(ForumDAO.class).buscar( rs.getInt("cd_forum") ) );

			p.setDs_processo( rs.getString("ds_processo") );

			Calendar cal = Calendar.getInstance();
			cal.setTime( rs.getDate("dt_abertura") );
			p.setDt_abertura( cal );
			try{
			Calendar calF = Calendar.getInstance();
			calF.setTime( rs.getDate("dt_fechamento") );
			p.setDt_fechamento( calF );
			}catch(Exception e){ /*do nothing*/ }
			p.setDt_dia_vencimento( rs.getInt("dt_dia_vencimento") );

			p.setNr_resultado( rs.getInt("nr_resultado") );
			p.setNr_situacao( rs.getInt("nr_situacao") );
			p.setDs_observacao( rs.getString("ds_observacao") );
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}

		return p;

	}
}
