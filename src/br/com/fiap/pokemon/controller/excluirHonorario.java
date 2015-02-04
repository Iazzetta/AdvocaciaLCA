package br.com.fiap.pokemon.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.pokemon.dao.DAOFactory;
import br.com.fiap.pokemon.dao.HonorarioDAO;
import br.com.fiap.pokemon.to.HonorarioTO;

/**
 * Servlet implementation class excluirHonorario
 */
@WebServlet("/excluirHonorario")
public class excluirHonorario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cd_lancamento = Integer.parseInt( request.getParameter("cd_lancamento") );
		HonorarioTO honorario = DAOFactory.get( HonorarioDAO.class ).buscar( cd_lancamento );
		DAOFactory.get( HonorarioDAO.class ).excluir( honorario );
		
		response.sendRedirect("consultarHonorarios?nr_processo=" + honorario.getProcesso().getNr_processo());

	}
}
