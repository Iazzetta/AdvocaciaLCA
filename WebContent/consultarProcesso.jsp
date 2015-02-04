<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="cabecalho.jsp"%>
<form class="conteudo">

	<div>
		<table id="tabelaProcessos">
			<thead>
				<tr>
					<th>Numero</th>
					<th>Descrição</th>
					<th>Cliente</th>
					<th>Advogado</th>
					<th>Ação</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="processo" items="${processos}">
					<tr>
						<td>${processo.nr_processo}</td>
						<td>${processo.ds_processo}</td>
						<td>${processo.cliente.nm_pessoa}</td>
						<td>${processo.advogado.nm_pessoa}</td>
						<td>
							<a href="consultarDespesas?nr_processo=${processo.nr_processo}">Despesas</a>
							&nbsp;&nbsp;||&nbsp;&nbsp;
							<a href="consultarHonorarios?nr_processo=${processo.nr_processo}">Honorarios</a>
						</td>
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
