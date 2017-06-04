package ui;

import dao.ClienteDao;
import dao.ClienteJpaDao;
import model.Cliente;

public class TesteInsere {
	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.setNome("Iarlen");
		
		ClienteDao dao = new ClienteJpaDao();
		
		dao.adiciona(cli);
		
	}
}
