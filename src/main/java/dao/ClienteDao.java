package dao;

import java.util.List;

import model.Cliente;

public interface ClienteDao {
	public void adiciona(Cliente cliente);

	public List<Cliente> getLista();

	public void altera(Cliente cliente);

	public void remove(Cliente cliente);

	public void close();
}
