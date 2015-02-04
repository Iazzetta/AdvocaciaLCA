package br.com.fiap.pokemon.to;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Entidade representando Processo
 * @author Alvaro
 *
 */

public class ProcessoTO implements Serializable {
	
	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = 7488346928872182783L;
	private int nr_processo;
	private ClienteTO cliente;
	private AdvogadoTO advogado;
	private TipoCausaTO tipoCausa;
	private ForumTO forum;
	private String ds_processo;
	private Calendar dt_abertura;
	private Calendar dt_fechamento;
	private int dt_dia_vencimento;
	private int nr_resultado;
	private int nr_situacao;
	private String ds_observacao;
	
	/**
	 * @return the cliente
	 */
	public ClienteTO getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(ClienteTO cliente) {
		this.cliente = cliente;
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
	 * @return the tipoCausa
	 */
	public TipoCausaTO getTipoCausa() {
		return tipoCausa;
	}
	/**
	 * @param tipoCausa the tipoCausa to set
	 */
	public void setTipoCausa(TipoCausaTO tipoCausa) {
		this.tipoCausa = tipoCausa;
	}
	/**
	 * @return the forum
	 */
	public ForumTO getForum() {
		return forum;
	}
	/**
	 * @param forum the forum to set
	 */
	public void setForum(ForumTO forum) {
		this.forum = forum;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**
	 * Metodo get nr processo
	 * @return the nr_processo
	 */
	public int getNr_processo() {
		return nr_processo;
	}
	/**
	 * metodo set nr processo
	 * @param nr_processo the nr_processo to set
	 */
	public void setNr_processo(int nr_processo) {
		this.nr_processo = nr_processo;
	}
	/**
	 * @return the cd_pessoa
	 */
	
	
	
	
	/**
	 * @return the ds_processo
	 */
	public String getDs_processo() {
		return ds_processo;
	}
	/**
	 * @param ds_processo the ds_processo to set
	 */
	public void setDs_processo(String ds_processo) {
		this.ds_processo = ds_processo;
	}
	/**
	 * @return the dt_abertura
	 */
	public Calendar getDt_abertura() {
		return dt_abertura;
	}
	/**
	 * @param dt_abertura the dt_abertura to set
	 */
	public void setDt_abertura(Calendar dt_abertura) {
		this.dt_abertura = dt_abertura;
	}
	/**
	 * @return the dt_fechamento
	 */
	public Calendar getDt_fechamento() {
		return dt_fechamento;
	}
	/**
	 * @param dt_fechamento the dt_fechamento to set
	 */
	public void setDt_fechamento(Calendar dt_fechamento) {
		this.dt_fechamento = dt_fechamento;
	}
	/**
	 * @return the dt_dia_vencimento
	 */
	public int getDt_dia_vencimento() {
		return dt_dia_vencimento;
	}
	/**
	 * @param dt_dia_vencimento the dt_dia_vencimento to set
	 */
	public void setDt_dia_vencimento(int dt_dia_vencimento) {
		this.dt_dia_vencimento = dt_dia_vencimento;
	}
	/**
	 * @return the nr_resultado
	 */
	public int getNr_resultado() {
		return nr_resultado;
	}
	/**
	 * @param nr_resultado the nr_resultado to set
	 */
	public void setNr_resultado(int nr_resultado) {
		this.nr_resultado = nr_resultado;
	}
	/**
	 * @return the nr_situacao
	 */
	public int getNr_situacao() {
		return nr_situacao;
	}
	/**
	 * @param nr_situacao the nr_situacao to set
	 */
	public void setNr_situacao(int nr_situacao) {
		this.nr_situacao = nr_situacao;
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

	
}

