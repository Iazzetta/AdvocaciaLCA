package br.com.fiap.pokemon.to;
import java.io.Serializable;
import java.util.Calendar;

/**
 * Entidade representando o Histórico Taxa
 * @author Docau
 *
 */
public class HistoricoTaxaTO implements Serializable {
	
	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = 3947892485800034013L;
	
	private int cd_taxa;
	private Calendar dt_vigencia;
	private double vl_taxa_adm;
	private double vl_taxa_juros;
	private double vl_mora_diaria;
	
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
	 * @return the dt_vigencia
	 */
	public Calendar getDt_vigencia() {
		return dt_vigencia;
	}
	/**
	 * @param dt_vigencia the dt_vigencia to set
	 */
	public void setDt_vigencia(Calendar dt_vigencia) {
		this.dt_vigencia = dt_vigencia;
	}
	/**
	 * @return the vl_taxa_adm
	 */
	public double getVl_taxa_adm() {
		return vl_taxa_adm;
	}
	/**
	 * @param vl_taxa_adm the vl_taxa_adm to set
	 */
	public void setVl_taxa_adm(double vl_taxa_adm) {
		this.vl_taxa_adm = vl_taxa_adm;
	}
	/**
	 * @return the vl_taxa_juros
	 */
	public double getVl_taxa_juros() {
		return vl_taxa_juros;
	}
	/**
	 * @param vl_taxa_juros the vl_taxa_juros to set
	 */
	public void setVl_taxa_juros(double vl_taxa_juros) {
		this.vl_taxa_juros = vl_taxa_juros;
	}
	/**
	 * @return the vl_mora_diaria
	 */
	public double getVl_mora_diaria() {
		return vl_mora_diaria;
	}
	/**
	 * @param vl_mora_diaria the vl_mora_diaria to set
	 */
	public void setVl_mora_diaria(double vl_mora_diaria) {
		this.vl_mora_diaria = vl_mora_diaria;
	}

	
}
