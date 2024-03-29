/**
 * 
 */
package br.com.ana.dao;

import br.com.ana.dao.generic.IGenericDAO;
import br.com.ana.domain.Venda;
import br.com.ana.exceptions.DAOException;
import br.com.ana.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
