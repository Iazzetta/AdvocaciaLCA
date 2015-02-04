package br.com.fiap.pokemon.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.pokemon.bo.HonorarioBO;
import br.com.fiap.pokemon.bo.ProcessoBO;
import br.com.fiap.pokemon.to.ProcessoTO;

/**
 * Servlet implementation class consultarHonorarios
 */
@WebServlet("/consultarHonorarios")
public class consultarHonorarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public consultarHonorarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HonorarioBO bo = new HonorarioBO();
		

		int nr_processo = Integer.parseInt( request.getParameter("nr_processo") ); 
		ProcessoTO processo = new ProcessoBO().getProcesso( nr_processo );
		
		request.setAttribute("honorarios", bo.getHonorarios(processo));
		
		request.getRequestDispatcher("consultarHonorarios.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// do nothing
	}

}
