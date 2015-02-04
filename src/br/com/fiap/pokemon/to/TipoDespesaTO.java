/**
 * 
 */
package br.com.fiap.pokemon.to;

import java.io.Serializable;

/**
 * Entidade representando TipoDespesa (ENUM)
 * @author Docau
 *
 */
public class TipoDespesaTO implements Serializable{

	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = 3661076737686699838L;
	
	private int cd_tipo_despesa;
	private String ds_tipo_despesa;
	
	/**
	 * Metodo get Coigo Tipo Despesa
	 * @return the cd_tipo_despesa
	 */
	public int getCd_tipo_despesa() {
		return cd_tipo_despesa;
	}
	/**
	 * Metodo set Codigo Tipo Despesa
	 * @param cd_tipo_despesa the cd_tipo_despesa to set
	 */
	public void setCd_tipo_despesa(int cd_tipo_despesa) {
		this.cd_tipo_despesa = cd_tipo_despesa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the ds_tipo_despesa
	 */
	public String getDs_tipo_despesa() {
		return ds_tipo_despesa;
	}
	/**
	 * @param ds_tipo_despesa the ds_tipo_despesa to set
	 */
	public void setDs_tipo_despesa(String ds_tipo_despesa) {
		this.ds_tipo_despesa = ds_tipo_despesa;
	}
	

}
