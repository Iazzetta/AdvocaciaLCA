<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="br.com.fiap.pokemon.helpers.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="cabecalho.jsp" %>

    <form action="atualizarDespesa" class="conteudo"  method="post" >
		<input type="hidden" name="cd_lancamento" value="${despesatt.cd_lancamento}" />
		<div class="filtros coluna">
			<div>
				<label for="processo">
					Processo: 
				</label>
				<select id="processo" name="selectProcesso">
					<option value="${despesatt.processo.nr_processo}">${despesatt.processo.nr_processo} - ${despesatt.processo.ds_processo}</option>
					<c:forEach var="processo" items="${processos}">
						<option value="${processo.nr_processo}">${processo.nr_processo} - ${processo.ds_processo}</option>
					</c:forEach>
				</select>
			</div>

			<div>
				<label for="despesa">
					Despesa: 
				</label>
				<select id="despesa" name="selectDespesa">
					<option value="${despesatt.tipo_despesa.cd_tipo_despesa}">${despesatt.tipo_despesa.ds_tipo_despesa}</option>
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
				<input type="text" value="${ despesatt.dataFormatada }" id="data" name="inputData">
		
			</div>
			<div>
				<label for="valor">
					Valor: R$
				</label>
				<input name="inputValor" id="valor" type="text" data-a-sign="R$ " data-a-dec="," data-a-sep="." data-v-max="999999.99" value="${despesatt.vl_despesa }"/>
			</div>
			<div>
				<label for="observacao">
					Observações:
				</label>
				<textarea name="inputObservacao" id="observacao">${despesatt.ds_observacao}</textarea>
			</div>
		</div>
        <div class="textcenter">
            <input type="submit" id="botao" value="Atualizar" />
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
