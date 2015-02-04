/**
 * 
 */
package br.com.fiap.pokemon.to;

import java.io.Serializable;

/**
 * Entidade representando o Telefone de uma Pessoa.
 * @author Docau
 *
 */
public class FonePessoaTO implements Serializable{

	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = -5860046934951724983L;

	private PessoaTO pessoa; //CD_PESSOA.. SERIA OQ? PESSOA MESMO NE SAFADA? CHUPA-ME.
	private int nr_ramal;
	private TelefoneTO telefone;
	
	/**
	 * Metodo get Pessoa
	 * @return the pessoa
	 */
	public PessoaTO getPessoa() {
		return pessoa;
	}
	
	/**
	 * Metodo set Pessoa
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(PessoaTO pessoa) {
		this.pessoa = pessoa;
	}
	/**
	 * @return the nr_ramal
	 */
	public int getNr_ramal() {
		return nr_ramal;
	}
	/**
	 * @param nr_ramal the nr_ramal to set
	 */
	public void setNr_ramal(int nr_ramal) {
		this.nr_ramal = nr_ramal;
	}
	/**
	 * @return the telefone
	 */
	public TelefoneTO getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(TelefoneTO telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
