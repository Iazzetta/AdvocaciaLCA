/**
 * 
 */
package br.com.fiap.pokemon.to;

import java.io.Serializable;
import java.util.Calendar;

import br.com.fiap.pokemon.helpers.Helpers;

/**
 * Entidade representando a funcionalidade Lançar Despesa
 * @author Docau
 *
 */
public class DespesaTO implements Serializable {

	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = -8868844798629780015L;

	
	private int cd_lancamento;
	private TipoDespesaTO tipo_despesa;
	private ProcessoTO processo;
	private Calendar dt_despesa;
	private double vl_despesa;
	private String ds_observacao;
	

	/**
	 * Metodo get Tipo Despesa
	 * @return the tipo_despesa
	 */
	public TipoDespesaTO getTipo_despesa() {
		return tipo_despesa;
	}
	/**
	 * Metodo set Tipo Despesa
	 * @param tipo_despesa the tipo_despesa to set
	 */
	public void setTipo_despesa(TipoDespesaTO tipo_despesa) {
		this.tipo_despesa = tipo_despesa;
	}
	/**
	 * Metodo get Processo
	 * @return the processo
	 */
	public ProcessoTO getProcesso() {
		return processo;
	}
	/**
	 * Metodo set Processo
	 * @param processo the processo to set
	 */
	public void setProcesso(ProcessoTO processo) {
		this.processo = processo;
	}
	/**
	 * Metodo get Data Despesa
	 * @return the dt_despesa
	 */
	public Calendar getDt_despesa() {
		return dt_despesa;
	}
	/**
	 * Metodo set Data Despesa
	 * @param dt_despesa the dt_despesa to set
	 */
	public void setDt_despesa(Calendar dt_despesa) {
		this.dt_despesa = dt_despesa;
	}
	/**
	 * Metodo get Valor Despesa
	 * @return the vl_despesa
	 */
	public double getVl_despesa() {
		return vl_despesa;
	}
	/**
	 * Metodo set Valor Despesa
	 * @param vl_despesa the vl_despesa to set
	 */
	public void setVl_despesa(double vl_despesa) {
		this.vl_despesa = vl_despesa;
	}
	/**
	 * Metodo get Descrição Observação
	 * @return the ds_observacao
	 */
	public String getDs_observacao() {
		return ds_observacao;
	}
	/**
	 * Metodo set Descrição Observação
	 * @param ds_observacao the ds_observacao to set
	 */
	public void setDs_observacao(String ds_observacao) {
		this.ds_observacao = ds_observacao;
	}
	/**
	 * Metodo get Serial Version
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
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
	
	public String getDataFormatada(){
		return Helpers.CalendarToString(this.dt_despesa);
	}
	
	
}
