package br.com.fiap.pokemon.to;

import java.io.Serializable;

/**
 * 
 * Entidade representando Pessoa
 * @author Docau
 *
 */
public abstract class PessoaTO implements Serializable{
	
	/**
	 * ID de Serialização
	 */
	private static final long serialVersionUID = -2671157704790236649L;
	
	
	private int cd_pessoa;
	private String nm_pessoa;
	
	/**
	 * Metodo get Numero Pessoa
	 * @return
	 */
	public String getNm_pessoa() {
		return nm_pessoa;
	}
	
	/**
	 * Metodo set Numero Pessoa
	 * @param nm_pessoa
	 */
	public void setNm_pessoa(String nm_pessoa) {
		this.nm_pessoa = nm_pessoa;
	}
	
	/**
	 * Método get Codigo Pessoa
	 * @return
	 */
	public int getCd_pessoa() {
		return cd_pessoa;
	}
	
	/**
	 * Metodo set Codigo Pessoa
	 * @param cd_pessoa
	 */
	public void setCd_pessoa(int cd_pessoa) {
		this.cd_pessoa = cd_pessoa;
	}


	
	

}
