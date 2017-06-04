package ui;

import dao.ClienteDao;
import dao.ClienteJpaDao;
import model.Cliente;

public class TesteInsere {
	public static void main(String[] args) {
		
		ClienteDao dao = new ClienteJpaDao();
		
		dao.getCliente(10);
		
	}
}
