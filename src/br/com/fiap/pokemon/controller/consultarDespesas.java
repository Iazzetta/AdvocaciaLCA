package br.com.fiap.pokemon.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.pokemon.bo.DespesaBO;
import br.com.fiap.pokemon.bo.ProcessoBO;
import br.com.fiap.pokemon.to.DespesaTO;
import br.com.fiap.pokemon.to.ProcessoTO;

/**
 * Servlet implementation class consultarDespesas
 */
@WebServlet("/consultarDespesas")
public class consultarDespesas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public consultarDespesas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		DespesaBO bo = new DespesaBO();

		int nr_processo = Integer.parseInt( request.getParameter("nr_processo") ); 
		ProcessoTO processo = new ProcessoBO().getProcesso( nr_processo );
		List<DespesaTO> despesas = bo.getDespesas( processo );
		request.setAttribute("despesas", despesas);
		
		request.getRequestDispatcher("consultarDespesa.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
