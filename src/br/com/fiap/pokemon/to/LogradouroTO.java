package br.com.fiap.pokemon.to;

import java.io.Serializable;

/**
 * Entidade representando Logradouro, complemento de um endereço.
 * @author alvaro
 *
 */
public class LogradouroTO implements Serializable {
	
	/**
	 *ID de serialização
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nr_cep;
	private BairroTO bairro;
	private TipoLogTO tipo_log;
	private String ds_logradouro;
	/**
	 * @return the nr_cep
	 */
	public int getNr_cep() {
		return nr_cep;
	}
	/**
	 * @param nr_cep the nr_cep to set
	 */
	public void setNr_cep(int nr_cep) {
		this.nr_cep = nr_cep;
	}
	/**
	 * @return the bairro
	 */
	public BairroTO getBairro() {
		return bairro;
	}
	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(BairroTO bairro) {
		this.bairro = bairro;
	}
	
	/**
	 * @return the ds_logradouro
	 */
	public String getDs_logradouro() {
		return ds_logradouro;
	}
	/**
	 * @param ds_logradouro the ds_logradouro to set
	 */
	public void setDs_logradouro(String ds_logradouro) {
		this.ds_logradouro = ds_logradouro;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the tipo_log
	 */
	public TipoLogTO getTipo_log() {
		return tipo_log;
	}
	/**
	 * @param tipo_log the tipo_log to set
	 */
	public void setTipo_log(TipoLogTO tipo_log) {
		this.tipo_log = tipo_log;
	}
	
}

