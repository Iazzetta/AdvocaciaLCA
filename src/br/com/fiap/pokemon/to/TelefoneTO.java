package br.com.fiap.pokemon.to;
import java.io.Serializable;

public class TelefoneTO implements Serializable{

	/**
	 * Entidade representando a Telefone T
	 * 
	 */
	private static final long serialVersionUID = -5053579101611321584L;
	
	private int cd_fone;
	private TipoFoneTO tipo_fone;
	private int ddd;
	private int nr_fone;
	/**
	 * @return the cd_fone
	 */
	public int getCd_fone() {
		return cd_fone;
	}
	/**
	 * @param cd_fone the cd_fone to set
	 */
	public void setCd_fone(int cd_fone) {
		this.cd_fone = cd_fone;
	}
	/**
	 * @return the tipo_fone
	 */
	public TipoFoneTO getTipo_fone() {
		return tipo_fone;
	}
	/**
	 * @param tipo_fone the tipo_fone to set
	 */
	public void setTipo_fone(TipoFoneTO tipo_fone) {
		this.tipo_fone = tipo_fone;
	}
	/**
	 * @return the ddd
	 */
	public int getDdd() {
		return ddd;
	}
	/**
	 * @param ddd the ddd to set
	 */
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	/**
	 * @return the nr_fone
	 */
	public int getNr_fone() {
		return nr_fone;
	}
	/**
	 * @param nr_fone the nr_fone to set
	 */
	public void setNr_fone(int nr_fone) {
		this.nr_fone = nr_fone;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
