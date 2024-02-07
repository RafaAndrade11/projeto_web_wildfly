/**
 * 
 */
package br.com.randrade.dao;

import br.com.randrade.dao.generic.GenericDAO;
import br.com.randrade.domain.Jogos;

/**
 * @author rafael.andrade
 *
 */
public class JogosDAO extends GenericDAO<Jogos, Long> implements IJogosDAO {

	public JogosDAO() {
		super(Jogos.class);
	}

}
