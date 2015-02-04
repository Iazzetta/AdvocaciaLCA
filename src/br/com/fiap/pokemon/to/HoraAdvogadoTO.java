package br.com.fiap.pokemon.to;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Entidade representando Hora Advogado
 * @author Docau
 *
 */
public class HoraAdvogadoTO implements Serializable {

	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = 5131233150219877059L;
	
	private AdvogadoTO advogado;
	private int cd_hist_hora;
	private Calendar dt_vigencia;
	private double vl_hora;
	
	
	
	/**
	 * Metodo get Codigo Advogado
	 * @return advogado
	 */
	public AdvogadoTO getAdvogado() {
		return advogado;
	}

	/**
	 * Metodo set Codigo Advogado
	 * @param advogado
	 */
	public void setAdvogado(AdvogadoTO advogado) {
		this.advogado = advogado;
	}

	/**
	 * Metodo get Codigo Historico Hora
	 * @return
	 */
	public int getCd_hist_hora() {
		return cd_hist_hora;
	}
	
	/**
	 * Metodo set Codigo Hisotiroc Hora
	 * @param cd_hist_hora
	 */
	public void setCd_hist_hora(int cd_hist_hora) {
		this.cd_hist_hora = cd_hist_hora;
	}
	
	/**
	 * Metodo get Data Vigência
	 * @return
	 */
	public Calendar getDt_vigencia() {
		return dt_vigencia;
	}
	
	/**
	 * Metodo set Data Vigência
	 * @param dt_vigencia
	 */
	public void setDt_vigencia(Calendar dt_vigencia) {
		this.dt_vigencia = dt_vigencia;
	}
	
	/**
	 * Metodo get Valor Hora
	 * @return
	 */
	public double getVl_hora() {
		return vl_hora;
	}
	
	/**
	 * Metodo set Valor Hora
	 * @param vl_hora
	 */
	public void setVl_hora(double vl_hora) {
		this.vl_hora = vl_hora;
	}
	
	/**
	 * Metodo que recupera Serial Version
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
