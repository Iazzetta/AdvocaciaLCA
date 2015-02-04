/**
 * 
 */
package br.com.fiap.pokemon.to;

import java.io.Serializable;

/**
 * Entidade representando Endereço da Pessoa
 * @author Docau
 * 
 */
public class PessoaEnderecoTO implements Serializable {

	/**
	 * ID da serialização
	 */
	private static final long serialVersionUID = 4963367955724411934L;
	
	private int cd_pessoa_ende;
	private String nr_cep;
	private int cd_pessoa;
	private String nr_endereco;
	private String ds_complemento;
	
	/**
	 * Metodo get Codigo Pessoa Endereço
	 * @return the cd_pessoa_ende
	 */
	public int getCd_pessoa_ende() {
		return cd_pessoa_ende;
	}
	/**
	 * Metodo set Codigo Pessoa Endereço
	 * @param cd_pessoa_ende the cd_pessoa_ende to set
	 */
	public void setCd_pessoa_ende(int cd_pessoa_ende) {
		this.cd_pessoa_ende = cd_pessoa_ende;
	}
	/**
	 * Metodo get Numero CEP
	 * @return the nr_cep
	 */
	public String getNr_cep() {
		return nr_cep;
	}
	/**
	 * Metodo set Numero CEP
	 * @param nr_cep the nr_cep to set
	 */
	public void setNr_cep(String nr_cep) {
		this.nr_cep = nr_cep;
	}
	/**
	 * Metodo get Codigo Pessoa
	 * @return the cd_pessoa
	 */
	public int getCd_pessoa() {
		return cd_pessoa;
	}
	/**
	 * Metodo set Codigo Pessoa
	 * @param cd_pessoa the cd_pessoa to set
	 */
	public void setCd_pessoa(int cd_pessoa) {
		this.cd_pessoa = cd_pessoa;
	}
	/**
	 * Metodo get Numero Endereço
	 * @return the nr_endereco
	 */
	public String getNr_endereco() {
		return nr_endereco;
	}
	/**
	 * Metodo set Numero Endereco
	 * @param nr_endereco the nr_endereco to set
	 */
	public void setNr_endereco(String nr_endereco) {
		this.nr_endereco = nr_endereco;
	}
	/**
	 * Metodo get Descrição Complemento
	 * @return the ds_complemento
	 */
	public String getDs_complemento() {
		return ds_complemento;
	}
	/**
	 * Metodo set Descrição Complemento
	 * @param ds_complemento the ds_complemento to set
	 */
	public void setDs_complemento(String ds_complemento) {
		this.ds_complemento = ds_complemento;
	}
	/**
	 * Metodo get Serial Version
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
