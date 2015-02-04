<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="cabecalho.jsp" %>

    <form class="conteudo">
		<input type="hidden" id="despesa_id" value="" />
		<div class="filtros coluna">
			<div>
				<label for="processo">
					Processo: 
				</label>
				<select id="processo">
					<option value="">Selecione o processo...</option>
					<c:forEach var="processo" items="${processos}">
						<option value="${processo.nr_processo}">${processo.nr_processo} - ${processo.ds_processo}</option>
					</c:forEach>
				</select>
			</div>

			<div>
				<label for="despesa">
					Despesa: 
				</label>
				<select id="despesa">
					<option value="">Selecione a despesa...</option>
					<c:forEach var="tipo" items="${tipos_despesas}">
						<option value="${tipo.cd_tipo_despesa}">${tipo.ds_tipo_despesa}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="filtros coluna">
			<div>
				<label for="data">
					Data:
				</label>
				<input id="data" type="text" />
			</div>
			<div>
				<label for="valor">
					Valor: R$
				</label>
				<input id="valor" type="text" data-a-sign="R$ " data-a-dec="," data-a-sep="." data-v-max="999999.99" />
			</div>
			<div>
				<label for="observacao">
					Observações:
				</label>
				<textarea id="observacao"></textarea>
			</div>
		</div>
        <div class="textcenter">
            <input type="button" id="botao" value="Cadastrar" onclick="CadastrarDespesa();" />
        </div>
    </form>
    <div id="rodape" class="">
        Advocacia LCA @ Todos os direitos reservados
    </div>
    <script type="text/javascript">
        $(function () {
            $("#menu").menu();
            $("input[type=submit],button,input[type=button]").button();
            $("#data").datepicker({ dateFormat: "dd/mm/yy" });
            $("#valor").autoNumeric('init');
        })
    </script>
</body>
</html>
