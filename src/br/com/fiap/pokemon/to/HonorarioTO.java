package br.com.fiap.pokemon.to;

import java.io.Serializable;
import java.util.Calendar;

import br.com.fiap.pokemon.helpers.Helpers;

public class HonorarioTO implements Serializable{
	
	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = 8485034651004362909L;
	
	private int cd_lancamento;
	private TipoTarefaTO tipo_tarefa;
	private ProcessoTO processo;
	private Calendar dt_honorario;
	private double qt_hora;
	private String ds_observacao;
	private AdvogadoTO advogado;
	private Float valorTotal;
	/**
	 * @return the cd_lancamento
	 */
	public int getCd_lancamento() {
		return cd_lancamento;
	}
	/**
	 * @param cd_lancamento the cd_lancamento to set
	 */
	public void setCd_lancamento(int cd_lancamento) {
		this.cd_lancamento = cd_lancamento;
	}

	/**
	 * @return the nr_processo
	 */
	public ProcessoTO getProcesso() {
		return processo;
	}
	/**
	 * @param nr_processo the nr_processo to set
	 */
	public void setProcesso(ProcessoTO processo) {
		this.processo = processo;
	}
	/**
	 * @return the advogado
	 */
	public AdvogadoTO getAdvogado() {
		return advogado;
	}
	/**
	 * @param advogado the advogado to set
	 */
	public void setAdvogado(AdvogadoTO advogado) {
		this.advogado = advogado;
	}
	/**
	 * @return the dt_honorario
	 */
	public Calendar getDt_honorario() {
		return dt_honorario;
	}
	/**
	 * @param dt_honorario the dt_honorario to set
	 */
	public void setDt_honorario(Calendar dt_honorario) {
		this.dt_honorario = dt_honorario;
	}
	/**
	 * @return the qt_hora
	 */
	public double getQt_hora() {
		return qt_hora;
	}
	/**
	 * @param qt_hora the qt_hora to set
	 */
	public void setQt_hora(double qt_hora) {
		this.qt_hora = qt_hora;
	}
	/**
	 * @return the ds_observacao
	 */
	public String getDs_observacao() {
		return ds_observacao;
	}
	/**
	 * @param ds_observacao the ds_observacao to set
	 */
	public void setDs_observacao(String ds_observacao) {
		this.ds_observacao = ds_observacao;
	}
	/**
	 * @return the tipo_tarefa
	 */
	public TipoTarefaTO getTipo_tarefa() {
		return tipo_tarefa;
	}
	/**
	 * @param tipo_tarefa the tipo_tarefa to set
	 */
	public void setTipo_tarefa(TipoTarefaTO tipo_tarefa) {
		this.tipo_tarefa = tipo_tarefa;
	}
	/**
	 * @return the valorTotal
	 */
	public Float getValorTotal() {
		return valorTotal;
	}
	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public String getDataFormatada(){
		return Helpers.CalendarToString(this.dt_honorario);
	}


}

