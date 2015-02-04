package br.com.fiap.pokemon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.pokemon.to.DespesaTO;
import br.com.fiap.pokemon.to.ProcessoTO;

public class DespesaDAO extends GenericDAO<DespesaTO> {
	
	public PreparedStatement pstt;

	public List<DespesaTO> getDespesasProcesso(ProcessoTO processo) {

		String sql = "SELECT D.CD_LANCAMENTO,D.CD_TIPO_DESPESA,P.NR_PROCESSO,D.DT_DESPESA,D.VL_DESPESA,D.DS_OBSERVACAO " +
				"FROM T_AM_PO_LANCA_DESPESA D INNER JOIN T_AM_PO_TIPO_DESPESA TD " +
				"ON(D.CD_TIPO_DESPESA = TD.CD_TIPO_DESPESA) " +
				"INNER JOIN T_AM_PO_PROCESSO P ON (D.NR_PROCESSO = P.NR_PROCESSO) WHERE P.NR_PROCESSO=?";

		return varios(sql, processo.getNr_processo());
	}
	
	public List<DespesaTO> getDespesasLancamento(DespesaTO despesa) {

		String sql = "SELECT D.CD_TIPO_DESPESA,P.NR_PROCESSO,D.DT_DESPESA,D.VL_DESPESA,D.DS_OBSERVACAO " +
				"FROM T_AM_PO_LANCA_DESPESA D INNER JOIN T_AM_PO_TIPO_DESPESA TD " +
				"ON(D.CD_TIPO_DESPESA = TD.CD_TIPO_DESPESA) " +
				"INNER JOIN T_AM_PO_PROCESSO P ON (D.NR_PROCESSO = P.NR_PROCESSO) WHERE D.CD_LANCAMENTO=?";

		return varios(sql, despesa.getCd_lancamento());
	}
	
	

	@Override
	public List<DespesaTO> todos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DespesaTO buscar(int codigo) {
		String sql = "SELECT * "
				+ "FROM T_AM_PO_LANCA_DESPESA "
				+ "WHERE CD_LANCAMENTO = ?";


		return buscar(sql, codigo);
	}

	@Override
	public void inserir(DespesaTO objeto) {
		
		
		Connection conn = ConnectionManager.getInstance().getConnection();
		
		String sql = "INSERT INTO T_AM_PO_LANCA_DESPESA(SQ_AM_PO_LANCA_DESPESA.nextval,CD_LANCAMENTO, TIPO_DESPESA, NR_PROCESSO, DT_DESPESA, VL_DESPESA, DS_OBSERVACAO) VALUES(?,?,?,?,?,?)";
		try{
			pstt = conn.prepareStatement(sql);
			pstt.setInt(1, objeto.getCd_lancamento());
			pstt.setInt(2, objeto.getTipo_despesa().getCd_tipo_despesa());
			pstt.setInt(3, objeto.getProcesso().getNr_processo());
			pstt.setDate(4, (java.sql.Date)objeto.getDt_despesa().getTime());
			pstt.setDouble(5, objeto.getVl_despesa());
			pstt.setString(6, objeto.getDs_observacao());
			pstt.executeQuery();
			
		}catch(SQLException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void excluir(DespesaTO objeto) {
		
		String sql = "DELETE FROM T_AM_PO_LANCA_DESPESA WHERE CD_LANCAMENTO = ?";
		
		Connection conn = ConnectionManager.getInstance().getConnection();
		
		try {
			pstt = conn.prepareStatement(sql);
			pstt.setInt(1, objeto.getCd_lancamento());
			
			pstt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void atualizar(DespesaTO objeto) {
		
		String sql = "UPDATE T_AM_PO_LANCA_DESPESA SET CD_TIPO_DESPESA=?, NR_PROCESSO=?, DT_DESPESA=?, VL_DESPESA=?, DS_OBSERVACAO=? "
				+ "WHERE CD_LANCAMENTO = ?";
		
		Connection conn = ConnectionManager.getInstance().getConnection();
		
		try {
			pstt = conn.prepareStatement(sql);
			pstt.setInt(1, objeto.getTipo_despesa().getCd_tipo_despesa());
			pstt.setInt(2, objeto.getProcesso().getNr_processo());
			pstt.setDate(3, new java.sql.Date( objeto.getDt_despesa().getTime().getTime() ) );
			pstt.setDouble(4, objeto.getVl_despesa());
			pstt.setString(5, objeto.getDs_observacao());
			
			pstt.setInt(6, objeto.getCd_lancamento());
			
			pstt.executeQuery();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	

	@Override
	protected DespesaTO carregarFromRS(ResultSet rs) {

		DespesaTO ld = new DespesaTO();
		try{
			ld.setCd_lancamento(rs.getInt("cd_lancamento"));
			ld.setTipo_despesa( DAOFactory.get(TipoDespesaDAO.class).buscar(  rs.getInt("cd_tipo_despesa") ) );
			ld.setProcesso(DAOFactory.get(ProcessoDAO.class).buscar( rs.getInt("nr_processo") ));
			
			Calendar cal = Calendar.getInstance();
			cal.setTime( rs.getDate("dt_despesa") );
			ld.setDt_despesa(cal);
			
			ld.setVl_despesa(rs.getDouble("vl_despesa"));
			ld.setDs_observacao(rs.getString("ds_observacao"));
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return ld;
	}

}
