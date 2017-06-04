<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clientes</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
<script src="js/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<c:import url="header.jsp"></c:import>
		<br> <br> <br>
		<div class="row">
			<div class="col-lg-8"></div>
			<div class="col-lg-4">
				<a class="btn btn-primary btn-lg" href="central?logica=FormClienteLogic"><i class="fa fa-plus"></i>Novo Cliente</a>
				<a class="btn btn-default btn-lg" href="central?logica=ListaClientesLogic"><i class="fa fa-refresh"></i>Atualizar</a>
			</div>

		</div>
		<jsp:useBean id="dao" class="dao.ClienteJpaDao"></jsp:useBean>
		<div id="list" class="row">
			<div class="table-responsive col-md-12">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>id</th>
							<th>Nome</th>
							<th class="actions">Ações</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${dao.lista}" var="cliente">
							<tr>
								<td>${cliente.id}</td>
								<td>${cliente.nome}</td>
								<td class="actions"><a class="btn btn-success btn-sm"
									href="central?logica=VisualizarClienteLogic&id=${cliente.id}"><i class="fa fa-eye"></i> Visualizar</a> <a
									class="btn btn-warning btn-sm" href="central?logica=FormClienteEditarLogic&id=${cliente.id}"><i class="fa fa-pencil"></i> Editar</a> <a
									class="btn btn-danger btn-sm"
									href="central?logica=RemoveClienteLogic&id=${cliente.id}"><i class="fa fa-trash"></i> Remover</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>