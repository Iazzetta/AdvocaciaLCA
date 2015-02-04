<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="cabecalho.jsp"%>
<form class="conteudo">


	<div>
		<table id="tabelaProcessos">
			<thead>
				<tr>
					<th>Cód. Lançamento</th>
					<th>Tipo Despesa</th>
					<th>Núm. Processo</th>
					<th>Valor Despesa</th>
					<th>Observação</th>
					<th>Ação</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="despesa" items="${despesas}">
					<tr>
						<td>${despesa.cd_lancamento}</td>
						<td>${despesa.tipo_despesa.cd_tipo_despesa} - ${despesa.tipo_despesa.ds_tipo_despesa}</td>
						<td>${despesa.processo.nr_processo} - ${despesa.processo.ds_processo}</td>
						<td>${despesa.vl_despesa}</td>
						<td>${despesa.ds_observacao}</td>
						<td>
							<a href="atualizarDespesa?cd_lancamento=${despesa.cd_lancamento}">Modificar</a>
							&nbsp;&nbsp;&nbsp;||&nbsp;&nbsp;&nbsp;
						 	<a href="excluirDespesa?cd_lancamento=${despesa.cd_lancamento}">Excluir</a>
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
			$("#numero_Processo").mask("9999999-99.9999.9.99.9999");
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
