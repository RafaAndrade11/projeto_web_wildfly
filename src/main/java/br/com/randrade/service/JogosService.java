/**
 * 
 */
package br.com.randrade.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.randrade.dao.IJogosDAO;
import br.com.randrade.domain.Jogos;
import br.com.randrade.exceptions.DAOException;
import br.com.randrade.exceptions.MaisDeUmRegistroException;
import br.com.randrade.exceptions.TableException;
import br.com.randrade.services.generic.GenericService;

/**
 * @author rafael.andrade
 *
 */
@Stateless
public class JogosService extends GenericService<Jogos, Long> implements IJogosService {
	
	@Inject
	public JogosService(IJogosDAO jogosDAO) {
		super(jogosDAO);
	}

	@Override
	public Jogos buscarPorNome(Long nome) throws DAOException {
		try {
			return this.dao.consultar(nome);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
