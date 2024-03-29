/**
 * 
 */
package br.com.ana.services;

import br.com.ana.domain.Cliente;
import br.com.ana.exceptions.DAOException;
import br.com.ana.exceptions.TipoChaveNaoEncontradaException;
import br.com.ana.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
