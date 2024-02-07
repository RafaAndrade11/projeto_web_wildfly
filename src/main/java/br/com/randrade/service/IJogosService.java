/**
 * 
 */
package br.com.randrade.service;

import br.com.randrade.domain.Jogos;
import br.com.randrade.exceptions.DAOException;
import br.com.randrade.services.generic.IGenericService;

/**
 * @author rafael.andrade
 *
 */
public interface IJogosService extends IGenericService<Jogos, Long> {

	Jogos buscarPorNome(Long nome) throws DAOException;

}
