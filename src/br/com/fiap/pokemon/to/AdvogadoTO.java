package br.com.fiap.pokemon.to;

/**
 * Entidade representando Advogado
 * @author Alvaro
 *
 */

public class AdvogadoTO extends PessoaTO {
	
	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = -1743219023843753354L;
	
	private String cd_advogado;
	private int nr_oab;
	private String nr_cpf;
	private int	nr_rg;
	private String ds_email;
	private String ds_password;
	
	
	/**
	 * Metodo get Advogado
	 * @return
	 */
	public String getCd_advogado() {
		return cd_advogado;
	}
	
	/**
	 * Metodo set Advogado
	 * @param cd_advogado
	 */
	public void setCd_advogado(String cd_advogado) {
		this.cd_advogado = cd_advogado;
	}
	
	/**
	 * Metodo get OAB
	 * @return
	 */
	public int getNr_oab() {
		return nr_oab;
	}
	
	/**
	 * Metodo set oab
	 * @param nr_oab
	 */
	public void setNr_oab(int nr_oab) {
		this.nr_oab = nr_oab;
	}
	
	/**
	 * Metodo get NR CPF
	 * @return
	 */
	public String getNr_cpf() {
		return nr_cpf;
	}
	
	/**
	 * Metodo set NR CPF
	 * @param nr_cpf
	 */
	public void setNr_cpf(String nr_cpf) {
		this.nr_cpf = nr_cpf;
	}
	
	/**
	 *Metodo Get Numero RG
	 * @return
	 */
	public int getNr_rg() {
		return nr_rg;
	}
	
	/**
	 * Metodo set Numero RG 
	 * @param nr_rg
	 */
	public void setNr_rg(int nr_rg) {
		this.nr_rg = nr_rg;
	}
	
	/**
	 * Metodo get Email
	 * @return
	 */
	public String getDs_email() {
		return ds_email;
	}
	
	/**
	 * Metodo set Email
	 * @param ds_email
	 */
	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}
	
	/**
	 * Metodo get Password
	 * @return
	 */
	public String getDs_password() {
		return ds_password;
	}
	
	/**
	 * Metodo set Password
	 * @param ds_password
	 */
	public void setDs_password(String ds_password) {
		this.ds_password = ds_password;
	}
}
