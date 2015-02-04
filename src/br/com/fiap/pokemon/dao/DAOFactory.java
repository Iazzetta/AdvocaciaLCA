package br.com.fiap.pokemon.dao;

public class DAOFactory
{
	public static <T extends GenericDAO<?>> T get(Class<T> type)
	{
		if ( type.equals( ClienteDAO.class ) )
			return type.cast(new ClienteDAO());
		else if ( type.equals( AdvogadoDAO.class ) )
			return type.cast(new AdvogadoDAO());
		else if ( type.equals( ForumDAO.class ) )
			return type.cast(new ForumDAO());
		else if ( type.equals( ProcessoDAO.class ) )
			return type.cast(new ProcessoDAO());
		else if ( type.equals( HonorarioDAO.class ) )
			return type.cast(new HonorarioDAO());
		else if ( type.equals( DespesaDAO.class ) )
			return type.cast(new DespesaDAO());
		else if ( type.equals( TipoCausaDAO.class ) )
			return type.cast(new TipoCausaDAO());
		else if ( type.equals( TipoTarefaDAO.class ) )
			return type.cast(new TipoTarefaDAO());
		else if ( type.equals( TipoDespesaDAO.class ) )
			return type.cast(new TipoDespesaDAO());

		return null;
		
	}
}