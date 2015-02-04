package br.com.fiap.pokemon.dao;

import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.pokemon.interfaces.IGenericDAO;

public abstract class GenericDAO<T> implements IGenericDAO<T> {

    final Class<T> genericType;

    public GenericDAO(Class<T> genericTypeClass) {
        this.genericType = genericTypeClass;
    }
    
    @SuppressWarnings("unchecked")
    public GenericDAO() {
        this.genericType = ((Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        init();
    }
    
    public void init(){
    	
    } 
    /**
     * Deve ser implementado pelas classes que herdam
     * @return
     */
    public abstract List<T> todos();
    protected List<T> todos(String sql) {

		List<T> resultado = new ArrayList<T>();
		Connection conn = ConnectionManager.getInstance().getConnection();
		PreparedStatement pstt = null;
		ResultSet rs = null;

		try{

			System.out.println(sql);
			pstt = conn.prepareStatement(sql);
			rs = pstt.executeQuery();

			while(rs.next()){

				resultado.add(carregarFromRS(rs));

			}


		}catch(SQLException e){

			System.out.println("Nao foi possivel consultar: " + e.getMessage());

		}finally{

			try {

				rs.close();
				pstt.close();

			} catch (SQLException e) {

				System.out.println("Nao foi possivel encerrar a conexao: " + e.getMessage());

			}

		}

		return resultado;
	}
    /**
     * Chamada Opcional
     * @param sql
     * @param codigo
     * @return
     */
    protected List<T> varios(String sql, int codigo) {

		List<T> resultado = new ArrayList<T>();
		Connection conn = ConnectionManager.getInstance().getConnection();
		PreparedStatement pstt = null;
		ResultSet rs = null;

		try{

			System.out.println(sql + "( " + codigo + " )");
			pstt = conn.prepareStatement(sql);
			pstt.setInt(1, codigo);
			rs = pstt.executeQuery();

			while(rs.next()){

				resultado.add(carregarFromRS(rs));

			}


		}catch(SQLException e){

			System.out.println("Nao foi possivel consultar: " + e.getMessage());

		}finally{

			try {

				rs.close();
				pstt.close();

			} catch (SQLException e) {

				System.out.println("Nao foi possivel encerrar a conexao: " + e.getMessage());

			}

		}

		return resultado;
	}
    /**
     * Deve ser implementado pelas classes que herdam
     * @return
     */
	public abstract T buscar(int codigo);
	protected T buscar(String sql, int codigo) {

		T resultado = null;
		
		Connection conn = ConnectionManager.getInstance().getConnection();
		PreparedStatement pstt = null;
		ResultSet rs = null;

		try{

			System.out.println(sql + "( " + codigo + " )");
			pstt = conn.prepareStatement(sql);
			pstt.setInt(1, codigo);
			rs = pstt.executeQuery();

			while(rs.next()){

				resultado = carregarFromRS(rs);

			}


		}catch(SQLException e){

			System.out.println("Nao foi possivel consultar: " + e.getMessage());

		}finally{

			try {

				rs.close();
				pstt.close();

			} catch (SQLException e) {

				System.out.println("Nao foi possivel encerrar a conexao: " + e.getMessage());

			}

		}

		return resultado;
	}

    /**
     * Deve ser implementado pelas classes que herdam
     * @return
     */
	public abstract void inserir(T objeto);
	protected void inserir(String sql, T objeto) {
		// TODO Auto-generated method stub

	}
	
	/**
     * Deve ser implementado pelas classes que herdam
     * @return
     */
	public abstract void excluir(T objeto);
	protected void excluir(String sql, T objeto) {
		// TODO Auto-generated method stub

	}
	
	/**
     * Deve ser implementado pelas classes que herdam
     * @return
     */
	public abstract void atualizar(T objeto);
	protected void atualizar(String sql, T objeto) {
				// TODO Auto-generated method stub

	}
	
	/**
     * Deve ser implementado pelas classes que herdam
     * @return
     */
	protected abstract T carregarFromRS(ResultSet rs);
	
}


