package br.com.fiap.pokemon.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.pokemon.bo.AdvogadoBO;
import br.com.fiap.pokemon.bo.DespesaBO;
import br.com.fiap.pokemon.bo.ProcessoBO;

/**
 * Servlet implementation class cadastrarDespesa
 * @author Erick
 *
 */
@WebServlet("/cadastrarDespesa")
public class cadastrarDespesa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cadastrarDespesa() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProcessoBO pbo = new ProcessoBO();
		request.setAttribute("processos", pbo.getProcessos());
		
		AdvogadoBO abo = new AdvogadoBO();
		request.setAttribute("advogados", abo.todos());
		
		DespesaBO dbo = new DespesaBO();
		request.setAttribute("tipos_despesas", dbo.getTiposDespesas());
		
		request.getRequestDispatcher("cadastrarDespesa.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
