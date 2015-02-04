package br.com.fiap.pokemon.to;

/**
 * Entidade representando o Forum
 * @author Docau
 *
 */
public class ForumTO extends PessoaTO{
	
	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = -5630192813746599096L;
	
	private int cd_forum;
	private String ds_forum;
	
	/**
	 * Metodo get Codigo Forum
	 * @return
	 */
	public int getCd_forum() {
		return cd_forum;
	}
	
	/**
	 * Metodo set Codigo Forum
	 * @param cd_forum
	 */
	public void setCd_forum(int cd_forum) {
		this.cd_forum = cd_forum;
	}
	
	/**
	 * Metodo get Descrição Forum
	 * @return
	 */
	public String getDs_forum() {
		return ds_forum;
	}
	
	/**
	 * Método set Descrição Forum
	 * @param ds_forum
	 */
	public void setDs_forum(String ds_forum) {
		this.ds_forum = ds_forum;
	}
	
	

}
