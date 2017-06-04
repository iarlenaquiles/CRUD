package logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import dao.ClienteJpaDao;

public class VisualizarClienteLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		ClienteDao dao = new ClienteJpaDao();
		req.setAttribute("id", dao.getCliente(id).getId());
		req.setAttribute("nome", dao.getCliente(id).getNome());
		return "WEB-INF/jsp/visualizar-cliente.jsp";
	}

}
