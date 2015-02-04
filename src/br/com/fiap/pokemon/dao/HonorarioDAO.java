package br.com.fiap.pokemon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.pokemon.to.HonorarioTO;
import br.com.fiap.pokemon.to.ProcessoTO;

public class HonorarioDAO extends GenericDAO<HonorarioTO> {
	
	public PreparedStatement pstt;

	public List<HonorarioTO> getHonorariosProcesso(ProcessoTO processo) {

		String sql = "SELECT H.*, (QT_HORA * VL_HORA) AS VALOR_TOTAL "
					+"FROM T_AM_PO_LANCA_HONORARIO H "
					+"  INNER JOIN T_AM_PO_HORA_ADVOGADO HA "
					+"    ON H.CD_ADVOGADO = HA.CD_ADVOGADO AND EXTRACT(month FROM H.DT_HONORARIO ) = EXTRACT(month FROM HA.DT_VIGENCIA ) "
					+"WHERE NR_PROCESSO= ? "
					+"ORDER BY DT_HONORARIO ASC";
		return varios(sql, processo.getNr_processo());
	}

	@Override
	public List<HonorarioTO> todos() {
		
		String sql = "SELECT H.*, (QT_HORA * VL_HORA) AS VALOR_TOTAL "
				+"FROM T_AM_PO_LANCA_HONORARIO H "
				+"  INNER JOIN T_AM_PO_HORA_ADVOGADO HA "
				+"    ON H.CD_ADVOGADO = HA.CD_ADVOGADO AND EXTRACT(month FROM H.DT_HONORARIO ) = EXTRACT(month FROM HA.DT_VIGENCIA ) "
				+"ORDER BY DT_HONORARIO ASC";
		return todos(sql);
	}

	@Override
	public HonorarioTO buscar(int codigo) {
		String sql = "SELECT H.*, (QT_HORA * VL_HORA) AS VALOR_TOTAL "
				+"FROM T_AM_PO_LANCA_HONORARIO H "
				+"  INNER JOIN T_AM_PO_HORA_ADVOGADO HA "
				+"    ON H.CD_ADVOGADO = HA.CD_ADVOGADO AND EXTRACT(month FROM H.DT_HONORARIO ) = EXTRACT(month FROM HA.DT_VIGENCIA ) "
				+"WHERE H.CD_LANCAMENTO = ? "
				+"ORDER BY DT_HONORARIO ASC";
		return buscar(sql,codigo);
	}

	@Override
	public void inserir(HonorarioTO objeto) {
		
		Connection conn = ConnectionManager.getInstance().getConnection();
		
		String sql = "INSERT INTO T_AM_PO_LANCA_HONORARIO(CD_LANCAMENTO, CD_TIPO_TAREFA, NR_PROCESSO, CD_ADVOGADO, DT_HONORARIO, QT_HORA, DS_OBSERVACAO) "
				+ "VALUES(SQ_AM_PO_LANCA_HONORARIO.nextval,?,?,?,?,?,?)";
		try{
			
			pstt = conn.prepareStatement(sql);
			pstt.setInt(1, objeto.getTipo_tarefa().getCd_tipo_tarefa());
			pstt.setInt(2, objeto.getProcesso().getNr_processo());
			pstt.setInt(3, objeto.getAdvogado().getCd_advogado());
			pstt.setDate(4, new java.sql.Date( objeto.getDt_honorario().getTime().getTime() ) );
			pstt.setDouble(5, objeto.getQt_hora());
			pstt.setString(6, objeto.getDs_observacao());
			pstt.executeQuery();
			
		}catch(SQLException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(HonorarioTO objeto) {
		
		String sql = "DELETE FROM T_AM_PO_LANCA_HONORARIO WHERE CD_LANCAMENTO = ?";

		Connection conn = ConnectionManager.getInstance().getConnection();
		
		try {
			pstt = conn.prepareStatement(sql);
			pstt.setInt(1, objeto.getCd_lancamento());
			
			pstt.executeQuery();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public void atualizar(HonorarioTO objeto) {
		String sql = "UPDATE T_AM_PO_LANCA_HONORARIO SET CD_TIPO_TAREFA=?, NR_PROCESSO=?, CD_ADVOGADO=?, DT_HONORARIO=?, QT_HORA=?, DS_OBSERVACAO=? "
				+ "WHERE CD_LANCAMENTO = ?";
		
		Connection conn = ConnectionManager.getInstance().getConnection();
		
		try {
			pstt = conn.prepareStatement(sql);
			pstt.setInt(1, objeto.getTipo_tarefa().getCd_tipo_tarefa());
			pstt.setInt(2, objeto.getProcesso().getNr_processo());
			pstt.setInt(3, objeto.getAdvogado().getCd_advogado());
			pstt.setDate(4, new java.sql.Date( objeto.getDt_honorario().getTime().getTime() ) );
			pstt.setDouble(5, objeto.getQt_hora());
			pstt.setString(6, objeto.getDs_observacao());
			
			pstt.setInt(7, objeto.getCd_lancamento());
			
			pstt.executeQuery();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	protected HonorarioTO carregarFromRS(ResultSet rs) {

		HonorarioTO lh = new HonorarioTO();
		try{
			lh.setCd_lancamento(rs.getInt("cd_lancamento"));
			lh.setProcesso( DAOFactory.get(ProcessoDAO.class).buscar( rs.getInt("nr_processo") ) );
			lh.setAdvogado( DAOFactory.get(AdvogadoDAO.class).buscar( rs.getInt("cd_advogado") ) );
			lh.setTipo_tarefa( DAOFactory.get( TipoTarefaDAO.class ).buscar( rs.getInt("cd_tipo_tarefa" ) ) );

			Calendar cal = Calendar.getInstance();
			cal.setTime( rs.getDate("dt_honorario") );
			lh.setDt_honorario( cal );
			
			lh.setQt_hora( rs.getInt("qt_hora") );
			lh.setValorTotal( rs.getFloat("valor_total") );
			lh.setDs_observacao( rs.getString("ds_observacao") );

		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return lh;
	}

}
