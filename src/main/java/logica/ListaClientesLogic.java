package logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteJpaDao;
import model.Cliente;

public class ListaClientesLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//Monta a lista de clientes
		List<Cliente> clientes = new ClienteJpaDao().getLista();
		
		//Guarda a lista
		req.setAttribute("clientes", clientes);
		
		return "WEB-INF/jsp/lista-clientes.jsp";
	}

}
