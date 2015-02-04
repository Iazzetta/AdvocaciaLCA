package br.com.fiap.pokemon.to;
import java.io.Serializable;

/**
 * Entidade representando a classe Tipo Fone
 * @author Alvaro
 *
 */

public class TipoFoneTO implements Serializable {
	
	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = -1076294269517673240L;
	private int cd_tipo_fone;
	private String ds_tipo_fone;
	
	/**
	 * @return the cd_tipo_fone
	 */
	public int getCd_tipo_fone() {
		return cd_tipo_fone;
	}
	/**
	 * @param cd_tipo_fone the cd_tipo_fone to set
	 */
	public void setCd_tipo_fone(int cd_tipo_fone) {
		this.cd_tipo_fone = cd_tipo_fone;
	}
	/**
	 * @return the ds_tipo_fone
	 */
	public String getDs_tipo_fone() {
		return ds_tipo_fone;
	}
	/**
	 * @param ds_tipo_fone the ds_tipo_fone to set
	 */
	public void setDs_tipo_fone(String ds_tipo_fone) {
		this.ds_tipo_fone = ds_tipo_fone;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
