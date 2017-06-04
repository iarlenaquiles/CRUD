package logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import dao.ClienteJpaDao;
import model.Cliente;

public class RemoveClienteLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Integer id = Integer.parseInt(req.getParameter("id"));

		Cliente cli = new Cliente();

		cli.setId(id);

		ClienteDao dao = new ClienteJpaDao();
		dao.remove(cli);
		System.out.println("Escluindo cliente");
		return "central?logica=ListaClientesLogic";
	}

}
