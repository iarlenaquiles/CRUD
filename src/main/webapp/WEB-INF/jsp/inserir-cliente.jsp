<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inserir Cliente</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
</head>
<body>
	<c:import url="header.jsp"></c:import>

	<div class="container">
		<h2>Inserir Cliente</h2>
		<form action="central?logica=InserirClienteLogic" method="post">
			<div class="form-group">
				<label for="nome">Nome:</label> <input type="text"
					class="form-control" id="nome" placeholder="Digite o nome"
					name="nome" required>
			</div>
			<button type="submit" class="btn btn-success btn-block">Cadastrar</button>
		</form>
	</div>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>