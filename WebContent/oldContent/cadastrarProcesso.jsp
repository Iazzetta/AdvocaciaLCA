<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Advocacia LCA</title>
	<meta http-equiv="cache-control" content="no-cache">
	
    <script type="text/javascript" src="plugins/jquery-ui-1.10.4/js/jquery-1.10.2.js"></script>
    <link rel="stylesheet" href="plugins/jquery-ui-1.10.4/css/dark-hive/jquery-ui.min.css" />
	<script type="text/javascript" src="plugins/jquery-ui-1.10.4/js/jquery-ui-1.10.4.min.js"></script>
    <link rel="stylesheet" href="plugins/jquery-ui-1.10.4/css/dark-hive/jquery.ui.theme.css" />

    <script type="text/javascript" src="plugins/datatables/js/jquery.dataTables.min.js"></script>
    <link rel="stylesheet" href="plugins/datatables/css/jquery.dataTables.min.css" />
    <script type="text/javascript" src="plugins/datatables/js/dataTables.jqueryui.js"></script>
    <link rel="stylesheet" href="plugins/datatables/css/jquery.dataTables_themeroller.min.css" />
    <link rel="stylesheet" href="plugins/datatables/css/dataTables.jqueryui.css" />
	
    <script type="text/javascript" src="plugins/jquery.maskedinput.min.js"></script>

    <link rel="stylesheet" href="css/LCA_adv.css" />
    <script type="text/javascript" src="js/LCA_Adv.js"></script>
    <script type="text/javascript" src="js/LCA_WebDB.js"></script>
	<script type="text/javascript" src="js/LCA_WebDBInit.js"></script>
</head>
<body>
    <div id="cabecalho">
        <span class="logo"><img src="img/logo_lca.gif" alt="Logo LCA"/></span>
        <span class="titulo"><span>Cadastrar Processo</span></span>
        <span class="anotacao"><span>Risadas - 1.o TDSS</span></span>
        <div>
            <ul id="menu">
                <li><a href="index.jsp">Home</a></li>
                <li><a href="index.jsp"><img src="img/search.png" alt="Consultar Lancamentos" class="icone" /> Consultar Processos</a></li>
                <li><a href="cadastrarProcesso.jsp"><img src="img/notification_add.png" alt="Consultar Lancamentos" class="icone" /> Cadastrar Processo</a></li>
                <li><a href="cadastrarDespesa.jsp"><img src="img/file_add.png" alt="Nova Despesa" class="icone" /> Lançar Despesa</a></li>
                <li><a href="cadastrarHonorario.jsp"><img src="img/document_add.png" alt="Novo Honorario" class="icone" /> Lançar Honorário</a></li>
            </ul>
        </div>
    </div>
    <form class="conteudo">
		<input type="hidden" id="processo_id" value="" />
		<div class="filtros coluna">
			<div>
				<label for="numero">
					Número: 
				</label>
				<input id="numero" type="text" />
			</div>
			<div>
				<label for="cliente">
					Cliente: 
				</label>
				<select id="cliente">
					<option value="">Selecione o processo...</option>
				</select>
			</div>
			<div>
				<label for="advogado">
					Advogado Responsável: 
				</label>
				<select id="advogado">
					<option value="">Selecione o processo...</option>
				</select>
			</div>
			<div>
				<label for="descricao">
					Descrição: 
				</label>
				<input id="descricao" type="text" />
			</div>
			<div>
				<label for="dataAbertura">
					Data de Abertura:
				</label>
				<input id="dataAbertura" type="text" />
			</div>
			<div>
				<label for="dataFechamento">
					Data de Fechamento: 
				</label>
				<input id="dataFechamento" type="text" />
			</div>
		</div>
		<div class="filtros coluna">
			<div>
				<label for="diaVencimento">
					Dia de Vencimento:
				</label>
				<input id="diaVencimento" type="text" />
			</div>
			<div>
				<label for="resultado">
					Resultado da Causa:
				</label>
				<select id="resultado">
					<option value="">Selecione o resultado...</option>
				</select>
			</div>
			<div>
				<label for="situacao">
					Situacao:
				</label>
				<select id="situacao">
					<option value="">Situacao atual...</option>
				</select>
			</div>
			<div>
				<label for="observacao">
					Observações:
				</label>
				<textarea id="observacao"></textarea>
			</div>
		</div>
		<div class="textcenter">
			<input type="button" id="botao" value="Cadastrar" onclick="CadastrarProcesso();">
		</div>
    </form>
    <div id="rodape" class="">
        Advocacia LCA @ Todos os direitos reservados
    </div>
    <script type="text/javascript">
        $(function () {
            $("#menu").menu();
			$("#numero").mask("9999999-99.9999.9.99.9999");
            $("#dataAbertura").datepicker({ dateFormat: "dd/mm/yy" });
            $("#dataFechamento").datepicker({ dateFormat: "dd/mm/yy" });
			$("#diaVencimento").spinner({ max: 31, min: 1, width: "100%"});
			$("#diaVencimento").spinner( "value", 10 );
            $("input[type=submit],button,input[type=button]").button();
			
			
			carregarSelectFromDB("cliente","clientes");
			carregarSelectFromDB("advogado","advogados");
			carregarSelectFromDB("resultado","resultados");
			carregarSelectFromDB("situacao","situacoes");
			
			if( $.qstring("id") != "" ){
				carregarProcesso($.qstring("id"));
			}
			
        })
    </script>
</body>
</html>
