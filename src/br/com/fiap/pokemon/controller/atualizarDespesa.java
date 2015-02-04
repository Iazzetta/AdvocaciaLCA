package br.com.fiap.pokemon.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.pokemon.bo.DespesaBO;
import br.com.fiap.pokemon.bo.ProcessoBO;
import br.com.fiap.pokemon.dao.DAOFactory;
import br.com.fiap.pokemon.dao.DespesaDAO;
import br.com.fiap.pokemon.dao.ProcessoDAO;
import br.com.fiap.pokemon.dao.TipoDespesaDAO;
import br.com.fiap.pokemon.helpers.Helpers;
import br.com.fiap.pokemon.to.DespesaTO;

/**
 * Servlet implementation class atualizarDespesa
 */
@WebServlet("/atualizarDespesa")
public class atualizarDespesa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public atualizarDespesa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cd_lancamento = Integer.parseInt( request.getParameter("cd_lancamento") ); 
		DespesaTO despesa = new DespesaBO().getDespesaL(cd_lancamento);
		request.setAttribute("despesatt", despesa);
		
		ProcessoBO pbo = new ProcessoBO();
		request.setAttribute("processos", pbo.getProcessos());
		
		
		
		DespesaBO dbo = new DespesaBO();
		request.setAttribute("tipos_despesas", dbo.getTiposDespesas());
		
		request.getRequestDispatcher("atualizarDespesa.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int cd_lancamento = Integer.parseInt(request.getParameter("cd_lancamento"));
		
		int nr_processo = Integer.parseInt(request.getParameter("selectProcesso"));
		int cd_tipo_despesa = Integer.parseInt(request.getParameter("selectDespesa"));
		String dt_despesa = request.getParameter("inputData");
		double vl_despesa = Double.parseDouble(request.getParameter("inputValor"));
		String ds_observacao = request.getParameter("inputObservacao");
		
		DespesaTO despesa = new DespesaTO();
		
		despesa.setCd_lancamento(cd_lancamento);
		despesa.setProcesso( DAOFactory.get( ProcessoDAO.class ).buscar( nr_processo ) );
		despesa.setTipo_despesa( DAOFactory.get( TipoDespesaDAO.class ).buscar( cd_tipo_despesa ) );
		despesa.setDt_despesa( Helpers.StringToCalendar( dt_despesa ) );
		despesa.setDs_observacao(ds_observacao);
		despesa.setVl_despesa(vl_despesa);
		
		DAOFactory.get( DespesaDAO.class ).atualizar( despesa );
		
		response.sendRedirect("consultarDespesas?nr_processo=" + nr_processo);
		
	}

}
