package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Cliente;

public class ClienteJpaDao implements ClienteDao {

	private EntityManager em;

	public ClienteJpaDao() {
		this.em = PersistenceManager.getEntityManager();
	}

	public ClienteJpaDao(EntityManager em) {
		setEntityManager(em);
	}

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public EntityManager getEntityManager() {
		return em;
	}

	@Override
	public void adiciona(Cliente cliente) {
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Cliente> getLista() {
		List<Cliente> result = em.createQuery("from clientes", Cliente.class).getResultList();
		em.close();
		return result;
	}

	@Override
	public void altera(Cliente cliente) {
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void remove(Cliente cliente) {
		em.getTransaction().begin();
		Cliente encontrado = em.find(Cliente.class, cliente.getId());
		em.remove(encontrado);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void close() {
		if(em != null && em.isOpen()){
			em.close();
		}
	}

}
