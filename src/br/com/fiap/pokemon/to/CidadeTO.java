package br.com.fiap.pokemon.to;

import java.io.Serializable;

/**
 * Entidade representando Cidade, um complemento de endereço.
 * @author Docau
 *
 */
public class CidadeTO implements Serializable{

	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = 8904972197718869190L;
	
	private int cd_cidade;
	private EstadoTO estado;
	private String nm_cidade;
	
	/**
	 * @return the cd_cidade
	 */
	public int getCd_cidade() {
		return cd_cidade;
	}
	/**
	 * @param cd_cidade the cd_cidade to set
	 */
	public void setCd_cidade(int cd_cidade) {
		this.cd_cidade = cd_cidade;
	}
	/**
	 * @return the estado
	 */
	public EstadoTO getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoTO estado) {
		this.estado = estado;
	}
	/**
	 * @return the nm_cidade
	 */
	public String getNm_cidade() {
		return nm_cidade;
	}
	/**
	 * @param nm_cidade the nm_cidade to set
	 */
	public void setNm_cidade(String nm_cidade) {
		this.nm_cidade = nm_cidade;
	}

}

