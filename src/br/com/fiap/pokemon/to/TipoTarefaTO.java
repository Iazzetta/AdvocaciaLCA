/**
 * 
 */
package br.com.fiap.pokemon.to;

import java.io.Serializable;

/**
 * Entidade representando TipoTarefa
 * @author Docau
 *
 */
public class TipoTarefaTO implements Serializable {

	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = -8786679143175640916L;
	
	private int cd_tipo_tarefa;
	private int ds_tipo_tarefa;
	
	/**
	 * @return the cd_tipo_tarefa
	 */
	public int getCd_tipo_tarefa() {
		return cd_tipo_tarefa;
	}
	/**
	 * @param cd_tipo_tarefa the cd_tipo_tarefa to set
	 */
	public void setCd_tipo_tarefa(int cd_tipo_tarefa) {
		this.cd_tipo_tarefa = cd_tipo_tarefa;
	}
	/**
	 * @return the ds_tipo_tarefa
	 */
	public int getDs_tipo_tarefa() {
		return ds_tipo_tarefa;
	}
	/**
	 * @param ds_tipo_tarefa the ds_tipo_tarefa to set
	 */
	public void setDs_tipo_tarefa(int ds_tipo_tarefa) {
		this.ds_tipo_tarefa = ds_tipo_tarefa;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
