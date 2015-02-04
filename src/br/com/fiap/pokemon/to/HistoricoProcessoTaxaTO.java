package br.com.fiap.pokemon.to;
import java.io.Serializable;
import java.util.Calendar;

public class HistoricoProcessoTaxaTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2072223648995015740L;
	private ProcessoTO processo;
	private int cd_taxa;
	private Calendar dt_validade;
	
	
	
	/**
	 * @return the cd_taxa
	 */
	public int getCd_taxa() {
		return cd_taxa;
	}
	/**
	 * @param cd_taxa the cd_taxa to set
	 */
	public void setCd_taxa(int cd_taxa) {
		this.cd_taxa = cd_taxa;
	}
	/**
	 * @return the dt_validade
	 */
	public Calendar getDt_validade() {
		return dt_validade;
	}
	/**
	 * @param dt_validade the dt_validade to set
	 */
	public void setDt_validade(Calendar dt_validade) {
		this.dt_validade = dt_validade;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the processo
	 */
	public ProcessoTO getProcesso() {
		return processo;
	}
	/**
	 * @param processo the processo to set
	 */
	public void setProcesso(ProcessoTO processo) {
		this.processo = processo;
	}

}

