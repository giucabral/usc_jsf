package br.com.giucabral.usctcc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.giucabral.usctcc.model.Cliente;
import org.springframework.transaction.annotation.Transactional;

@Repository("clienteDao")
@Transactional
public class ClienteDaoHibernate extends AbstractDao implements ClienteDao {

	public void save(Cliente cliente) {
		persist(cliente);
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> findAll() {
		final Criteria criteria = getSession().createCriteria(Cliente.class);
		return (List<Cliente>) criteria.list();
	}

	public Cliente findById(Integer id) {
		Criteria criteria = getSession().createCriteria(Cliente.class);
		criteria.add(Restrictions.eq("id", id));
		return (Cliente) criteria.uniqueResult();
	}

	public void update(Cliente cliente) {
		getSession().update(cliente);
	}

}
