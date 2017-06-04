package logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import dao.ClienteJpaDao;
import model.Cliente;

public class EditarClienteLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String nome = req.getParameter("nome");
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		Cliente cli = new Cliente();
		cli.setId(id);
		cli.setNome(nome);

		ClienteDao dao = new ClienteJpaDao();
		dao.altera(cli);
		System.out.println("Alterando cliente");
		return "central?logica=ListaClientesLogic";
	}

}
