<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="cabecalho.jsp"%>
<form class="conteudo">

<h1 class="textcenter"><a href="consultarProcessos">Bem vindo!</a></h1>

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
			carregarSelectFromDB("cliente","clientes");
			//carregarProcessos();
        })
    </script>
<div id="a"></div>
</body>
</html>
