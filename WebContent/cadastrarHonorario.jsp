<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="cabecalho.jsp" %>
    <form class="conteudo" method="post">
		<input type="hidden" id="cd_lancamento" value="${honorariott.cd_lancamento}" />
		<div class="filtros coluna">
			<div>
				<label for="processo">
					Processo:
				</label>
				<select name="processo" id="processo">
					<option value="${honorariott.processo.nr_processo}">${honorariott.processo.ds_processo}</option>
					<c:forEach var="processo" items="${processos}">
						<option value="${processo.nr_processo}">${processo.nr_processo} - ${processo.ds_processo}</option>
					</c:forEach>
				</select>
			</div>
			<div>
				<label for="advogado">
					Advogado:
				</label>
				<select name="advogado" id="advogado">
					<option value="${honorariott.advogado.cd_advogado}">${honorariott.advogado.nm_pessoa} - ${honorariott.advogado.nr_oab}</option>
					<c:forEach var="advogado" items="${advogados}">
						<option value="${advogado.cd_advogado}">${advogado.nm_pessoa} - ${advogado.nr_oab}</option>
					</c:forEach>
				</select>
			</div>
			<div>
				<label for="tarefa">
					Tarefa: 
				</label>
				<select name="tipo_tarefa" id="tipo_tarefa">
					<option value="${honorariott.tipo_tarefa.cd_tipo_tarefa}">${honorariott.tipo_tarefa.ds_tipo_tarefa}</option>
					<c:forEach var="tipo_tarefa" items="${tipos_tarefas}">
						<option value="${tipo_tarefa.cd_tipo_tarefa}">${tipo_tarefa.ds_tipo_tarefa}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="filtros coluna">
			<div>
				<label for="data">
					Data:
				</label>
				<input id="data" type="text" name="data" value="${honorariott.dataFormatada}" />
			</div>
			<div>
				<label for="horas">
					Qnt. Horas: 
				</label>
				<input id="horas" name="horas" type="text" value="${honorariott.qt_hora}"/>
			</div>
			<div>
				<label for="observacao">
					Observações:
				</label>
				<textarea id="observacao" name="observacao">${honorariott.ds_observacao}</textarea>
			</div>
		</div>
        <div class="textcenter">
            <input type="submit" id="botao" value="Cadastrar"/>
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
		})
    </script>
</body>
</html>
