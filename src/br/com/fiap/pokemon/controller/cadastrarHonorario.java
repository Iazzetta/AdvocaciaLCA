package br.com.fiap.pokemon.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.pokemon.bo.AdvogadoBO;
import br.com.fiap.pokemon.bo.HonorarioBO;
import br.com.fiap.pokemon.bo.ProcessoBO;
import br.com.fiap.pokemon.dao.AdvogadoDAO;
import br.com.fiap.pokemon.dao.DAOFactory;
import br.com.fiap.pokemon.dao.HonorarioDAO;
import br.com.fiap.pokemon.dao.ProcessoDAO;
import br.com.fiap.pokemon.dao.TipoTarefaDAO;
import br.com.fiap.pokemon.helpers.Helpers;
import br.com.fiap.pokemon.to.HonorarioTO;

/**
 * Servlet implementation class cadastrarHonorario
 */
@WebServlet("/cadastrarHonorario")
public class cadastrarHonorario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cadastrarHonorario() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("cd_lancamento") != null){
			int cd_lancamento = Integer.parseInt( request.getParameter("cd_lancamento") );
			request.setAttribute("honorariott", DAOFactory.get(HonorarioDAO.class).buscar( cd_lancamento ));
		}

		ProcessoBO pbo = new ProcessoBO();
		request.setAttribute("processos", pbo.getProcessos());
		
		AdvogadoBO abo = new AdvogadoBO();
		request.setAttribute("advogados", abo.todos());
		
		HonorarioBO hbo = new HonorarioBO();
		request.setAttribute("tipos_tarefas", hbo.getTiposTarefas());

		request.getRequestDispatcher("cadastrarHonorario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HonorarioTO honorario = new HonorarioTO();
		
		int cd_lancamento = 0;
		
		int nr_processo = Integer.parseInt(request.getParameter("processo"));
		int cd_advogado = Integer.parseInt(request.getParameter("advogado"));
		int cd_tipo_tarefa = Integer.parseInt(request.getParameter("tipo_tarefa"));
		
		String dt_honorario = request.getParameter("data");
		double qt_horas = Double.parseDouble(request.getParameter("horas"));
		String ds_observacao = request.getParameter("observacao");

		if(request.getParameter("cd_lancamento") != null){
			cd_lancamento = Integer.parseInt(request.getParameter("cd_lancamento"));
			honorario.setCd_lancamento( cd_lancamento );
		}
		
		honorario.setProcesso( DAOFactory.get( ProcessoDAO.class ).buscar( nr_processo ) );
		honorario.setAdvogado( DAOFactory.get( AdvogadoDAO.class ).buscar( cd_advogado ) );
		honorario.setTipo_tarefa(DAOFactory.get( TipoTarefaDAO.class ).buscar( cd_tipo_tarefa ) );
		
		honorario.setDt_honorario( Helpers.StringToCalendar( dt_honorario ) );
		honorario.setQt_hora( qt_horas );
		honorario.setDs_observacao(ds_observacao);
		
		if(cd_lancamento == 0){
			DAOFactory.get( HonorarioDAO.class ).inserir( honorario );
		}else{
			DAOFactory.get( HonorarioDAO.class ).atualizar( honorario );
		}

		response.sendRedirect("consultarHonorarios?nr_processo=" + nr_processo);
		
	}

}
