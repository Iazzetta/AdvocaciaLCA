package br.com.fiap.pokemon.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.pokemon.dao.DAOFactory;
import br.com.fiap.pokemon.dao.DespesaDAO;
import br.com.fiap.pokemon.to.DespesaTO;

/**
 * Servlet implementation class excluirHonorario
 */
@WebServlet("/excluirDespesa")
public class excluirDespesa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cd_lancamento = Integer.parseInt( request.getParameter("cd_lancamento") );
		DespesaTO despesa = DAOFactory.get( DespesaDAO.class ).buscar( cd_lancamento );
		DAOFactory.get( DespesaDAO.class ).excluir( despesa );
		
		response.sendRedirect("consultarDespesas?nr_processo=" + despesa.getProcesso().getNr_processo());

	}
}
