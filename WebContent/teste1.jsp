<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lanca Despesa</title>
</head>
<body>

		<table id="tabelaProcessos">
			<thead>
				<tr>
					<th>Lancamento</th>
					<th>Descricao</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="despesa" items="${despesa}">
					<tr>
						<td>${despesa.cd_lancamento}</td>
						<td>${despesa.ds_observacao}</td>
				</c:forEach>
			</tbody>
		</table>

</body>
</html>