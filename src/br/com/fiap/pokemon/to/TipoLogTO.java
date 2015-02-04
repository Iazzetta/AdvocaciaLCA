package br.com.fiap.pokemon.to;
import java.io.Serializable;

/**
 * Entidade Representando a classe Tipo log
 * @author Alvaro
 *
 */

public class TipoLogTO implements Serializable {
	
	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = -5262225723658012497L;
	private int cd_tipo_log;
	private String ds_tipo_log;
	
	/**
	 * @return the cd_tipo_log
	 */
	public int getCd_tipo_log() {
		return cd_tipo_log;
	}
	/**
	 * @param cd_tipo_log the cd_tipo_log to set
	 */
	public void setCd_tipo_log(int cd_tipo_log) {
		this.cd_tipo_log = cd_tipo_log;
	}
	/**
	 * @return the ds_tipo_log
	 */
	public String getDs_tipo_log() {
		return ds_tipo_log;
	}
	/**
	 * @param ds_tipo_log the ds_tipo_log to set
	 */
	public void setDs_tipo_log(String ds_tipo_log) {
		this.ds_tipo_log = ds_tipo_log;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}


