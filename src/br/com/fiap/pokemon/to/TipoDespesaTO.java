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
	private String ds_tipo_Despesa;
	
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
	/**
	 * Metodo get Descrição Tipo Despesa
	 * @return the ds_tipo_Despesa
	 */
	public String getDs_tipo_Despesa() {
		return ds_tipo_Despesa;
	}
	/**
	 * Metodo set Descrição Tipo Despesa
	 * @param ds_tipo_Despesa the ds_tipo_Despesa to set
	 */
	public void setDs_tipo_Despesa(String ds_tipo_Despesa) {
		this.ds_tipo_Despesa = ds_tipo_Despesa;
	}
	/**
	 * Metodo get Serial Version
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
