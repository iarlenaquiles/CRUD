package logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import dao.ClienteJpaDao;
import model.Cliente;

public class InserirClienteLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String nome = req.getParameter("nome");
		
		Cliente cli = new Cliente();
		
		cli.setNome(nome);
		
		ClienteDao dao = new ClienteJpaDao();
		dao.adiciona(cli);
		System.out.println("Inserindo cliente");
		return "central?logica=ListaClientesLogic";
	}

}
