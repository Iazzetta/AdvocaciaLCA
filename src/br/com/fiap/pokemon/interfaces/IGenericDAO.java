package br.com.fiap.pokemon.interfaces;

import java.util.List;

/**
 * Entidade que representa a interface da classe Pessoa
 * @author Docau
 *
 */
public interface IGenericDAO<T> {

	public List<T> todos();
	public T buscar(int codigo);
	public void inserir(T objeto);
	public void excluir(T objeto);
	public void atualizar(T objeto);
	
}
