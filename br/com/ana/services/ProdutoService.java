/**
 * 
 */
package br.com.ana.services;

import br.com.ana.dao.IProdutoDAO;
import br.com.ana.domain.Produto;
import br.com.ana.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
