<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="cabecalho.jsp"%>
<form class="conteudo">


	<div>
		<table id="tabelaProcessos">
			<thead>
				<tr>
					<th>Id</th>
					<th>Tipo</th>
					<th>Processo</th>
					<th>Data</th>
					<th>Horas</th>
					<th>Valor</th>
					<th>Ação</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="honorario" items="${honorarios}">
					<tr>
						<td>${honorario.cd_lancamento}</td>
						<td>${honorario.tipo_tarefa.ds_tipo_tarefa}</td>
						<td>${honorario.processo.ds_processo}</td>
						<td><fmt:formatDate value="${honorario.dt_honorario.time}" type="date" pattern="dd/MM/YYYY" /></td>
						<td>${honorario.qt_hora}</td>
						<td>${honorario.valorTotal}</td>
						<td>
							<a href="cadastrarHonorario?cd_lancamento=${honorario.cd_lancamento}" title="Modificar Honorário">Modificar</a>
							&nbsp;&nbsp;&nbsp;||&nbsp;&nbsp;&nbsp;
							<a href="excluirHonorario?cd_lancamento=${honorario.cd_lancamento}" title="Deletar Honorário">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</form>
<div id="rodape" class="">Advocacia LCA @ Todos os direitos
	reservados</div>
<script type="text/javascript">
        $(function () {
            $("#menu").menu();
            $("#dataDe").datepicker({ dateFormat: "dd/mm/yy" });
            $("#dataAte").datepicker({ dateFormat: "dd/mm/yy" });
			$('#tabelaProcessos').dataTable({
				"lengthMenu": [[5, 10, 20, 50, -1], [5, 10, 20, 50, "All"]]
			});
			$('#tabelaDespesas').dataTable({
				"info":      false,
				"searching": false,
			});
			$('#tabelaHonorarios').dataTable({
				"info":      false,
				"searching": false,
			});
            $("input[type=submit],button,input[type=button]").button();
        })
    </script>
<div id="a"></div>
</body>
</html>
