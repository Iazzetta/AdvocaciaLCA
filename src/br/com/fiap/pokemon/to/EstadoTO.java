package br.com.fiap.pokemon.to;

import java.io.Serializable;

/**
 * Entidade representando ESTADO, um complemento do endereço.
 * @author Docau
 *
 */
public class EstadoTO implements Serializable{

	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = -5438639231368460336L;
	
	private int cd_estado;
	private String nm_estado;
	private String sg_estado;
	
	/**
	 * Metodo get Codigo Estado
	 * @return the cd_estado
	 */
	public int getCd_estado() {
		return cd_estado;
	}
	/**
	 * Metodo set Codigo Estado
	 * @param cd_estado the cd_estado to set
	 */
	public void setCd_estado(int cd_estado) {
		this.cd_estado = cd_estado;
	}
	/**
	 * Metodo get Nome Estado
	 * @return the nm_estado
	 */
	public String getNm_estado() {
		return nm_estado;
	}
	/**
	 * Metodo set Nome Estado
	 * @param nm_estado the nm_estado to set
	 */
	public void setNm_estado(String nm_estado) {
		this.nm_estado = nm_estado;
	}
	/**
	 * Metodo get Sigla Estado
	 * @return the sg_estado
	 */
	public String getSg_estado() {
		return sg_estado;
	}
	/**
	 * Metodo set Sigla Estado
	 * @param sg_estado the sg_estado to set
	 */
	public void setSg_estado(String sg_estado) {
		this.sg_estado = sg_estado;
	}
	/**
	 * Metodo get Serial Version
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}

