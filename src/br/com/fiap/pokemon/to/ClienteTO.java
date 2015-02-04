package br.com.fiap.pokemon.to;

/**
 * 
 * Entidade representando a Classe Cliente
 * @author Docau
 *
 */
public class ClienteTO extends PessoaTO{

	/**
	 * ID de serialização
	 */
	
	private static final long serialVersionUID = -7071913827919353328L;
	
	
	private int cd_cliente;
	private String ds_razao_social;
	private String nr_cpnj;
	private String nr_insc_estadual;
	private String ds_email;
	private String ds_password;

	/**
	 * Metodo get Codigo pessoa
	 */
	public int getCd_cliente() {
		return cd_cliente;
	}
	
	/**
	 * Metodo set Codigo pessoa
	 */
	public void setCd_cliente(int cd_cliente) {
		this.cd_cliente = cd_cliente;
	}
	
	/**
	 * Metodo get Razão Social
	 */
	public String getDs_razao_social() {
		return ds_razao_social;
	}
	
	/**
	 * Metodo set Razão Social
	 */
	public void setDs_razao_social(String ds_razao_social) {
		this.ds_razao_social = ds_razao_social;
	}
	
	/**
	 * Metodo get CNJP
	 */
	public String getNr_cpnj() {
		return nr_cpnj;
	}
	
	/**
	 * Metodo set CNPJ
	 */
	public void setNr_cpnj(String nr_cpnj) {
		this.nr_cpnj = nr_cpnj;
	}
	
	/**
	 * Metodo get Inscrição Estadual
	 */
	public String getNr_insc_estadual() {
		return nr_insc_estadual;
	}
	
	/**
	 * Metodo set Inscrição Estadual
	 */
	public void setNr_insc_estadual(String nr_insc_estadual) {
		this.nr_insc_estadual = nr_insc_estadual;
	}
	
	/**
	 * Metodo get Email
	 */
	public String getDs_email() {
		return ds_email;
	}
	
	/**
	 * Metodo set Email
	 */
	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}
	
	/**
	 * Metodo get Senha
	 */
	public String getDs_password() {
		return ds_password;
	}
	
	/**
	 * Metodo set Senha
	 */
	public void setDs_password(String ds_password) {
		this.ds_password = ds_password;
	}
	

	/**
	 * Metodo get Serial Version
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
