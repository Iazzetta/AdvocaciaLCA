package br.com.fiap.pokemon.to;
import java.io.Serializable;

/**
 * Entidade representando o Bairro, complemento de um endereço.
 * @author Docau
 *
 */
public class BairroTO implements Serializable{

	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = 8466596666263268705L;
	
	private int cd_bairro;
	private CidadeTO cidade;
	private String nm_bairro;
	/**
	 * @return the cd_bairro
	 */
	public int getCd_bairro() {
		return cd_bairro;
	}
	/**
	 * @param cd_bairro the cd_bairro to set
	 */
	public void setCd_bairro(int cd_bairro) {
		this.cd_bairro = cd_bairro;
	}
	/**
	 * @return the cidade
	 */
	public CidadeTO getCidade() {
		return cidade;
	}
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(CidadeTO cidade) {
		this.cidade = cidade;
	}
	/**
	 * @return the nm_bairro
	 */
	public String getNm_bairro() {
		return nm_bairro;
	}
	/**
	 * @param nm_bairro the nm_bairro to set
	 */
	public void setNm_bairro(String nm_bairro) {
		this.nm_bairro = nm_bairro;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}

