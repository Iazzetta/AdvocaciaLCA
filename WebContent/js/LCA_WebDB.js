function supportsLocalStorage() {
	return ('localStorage' in window) && window['localStorage'] !== null;
}

function AddGeneric( tabela, nome , id){
	if (!supportsLocalStorage()) { return false; }
	var newID = 0;
	if(!id){
		newID = parseInt( localStorage[tabela + ".count"] ) + 1;
		localStorage[tabela + ".count"] = newID;
	}else{
		newID = id;
	}
	localStorage[tabela + "." + newID + ".codigo"] = newID;
	localStorage[tabela + "." + newID + ".nome"] = nome;
}
function AddProcesso(cliente, advogado, numero, descricao, dataAbertura, dataFechamento, diaVencimento, resultadoCausa, situacao, observacao, id){
	if (!supportsLocalStorage()) { return false; }
	var newID = 0;
	if(!id){
		newID = parseInt( localStorage["processos.count"] ) + 1;
		localStorage["processos.count"] = newID;
	}else{
		newID = id;
	}
	localStorage["processos." + newID + ".codigo"] = newID;
	localStorage["processos." + newID + ".codigo_cliente"] = cliente;
	localStorage["processos." + newID + ".codigo_advogado"] = advogado;
	localStorage["processos." + newID + ".numero"] = numero;
	localStorage["processos." + newID + ".descricao"] = descricao;
	localStorage["processos." + newID + ".nome"] = numero + " :: " + localStorage["processos." + newID + ".descricao"];
	localStorage["processos." + newID + ".dataAbertura"] = dataAbertura;
	localStorage["processos." + newID + ".dataFechamento"] = dataFechamento;
	localStorage["processos." + newID + ".diaVencimento"] = diaVencimento;
	localStorage["processos." + newID + ".resultadoCausa"] = resultadoCausa;
	localStorage["processos." + newID + ".situacao"] = situacao;
	localStorage["processos." + newID + ".observacao"] = observacao;
}
function AddDespesa(processo, advogado, despesa, data, valor, observacao, id){
	if (!supportsLocalStorage()) { return false; }
	var newID = 0;
	if(!id){
		newID = parseInt( localStorage["despesas.count"] ) + 1;
		localStorage["despesas.count"] = newID;
	}else{
		newID = id;
	}
	localStorage["despesas." + newID + ".codigo"] = newID;
	localStorage["despesas." + newID + ".codigo_processo"] = processo;
	localStorage["despesas." + newID + ".codigo_advogado"] = advogado;
	localStorage["despesas." + newID + ".tipo_despesa"] = despesa;
	localStorage["despesas." + newID + ".data"] = data;
	localStorage["despesas." + newID + ".valor"] = valor;
	localStorage["despesas." + newID + ".observacao"] = observacao;
}
function AddHonorario(processo, advogado, tarefa, data, horas, observacao, id){
	if (!supportsLocalStorage()) { return false; }
	var newID = 0;
	if(!id){
		newID = parseInt( localStorage["honorarios.count"] ) + 1;
		localStorage["honorarios.count"] = newID;
	}else{
		newID = id;
	}
	localStorage["honorarios." + newID + ".codigo"] = newID;
	localStorage["honorarios." + newID + ".codigo_processo"] = processo;
	localStorage["honorarios." + newID + ".codigo_advogado"] = advogado;
	localStorage["honorarios." + newID + ".tipo_tarefa"] = tarefa;
	localStorage["honorarios." + newID + ".data"] = data;
	localStorage["honorarios." + newID + ".horas"] = horas;
	localStorage["honorarios." + newID + ".observacao"] = observacao;
}

function carregarSelectFromDB( selectID, tabela ){
	if (!supportsLocalStorage()) { return false; }
	var total = parseInt( localStorage[tabela + ".count"] );
	for(var x = 1; x <= total; x++){
		if(!!localStorage[tabela + "." + x + ".codigo"]){
			var value = parseInt(localStorage[tabela + "." + x + ".codigo"] );
			var text = localStorage[tabela + "." + x + ".nome"];
			$("#" + selectID ).append("<option value=" + value + ">" + text + "</option>");
		}
	}
}

function carregarProcessos( numero_Processo, cliente, dataDe, dataAte ){
	var acoes = '';
	acoes += '<button type="button" onclick="NovaDespesa(_ID_);"><img src="img/file_add.png" alt="Nova Despesa" class="icone" /></button>';
	acoes += '<button type="button" onclick="NovoHonorario(_ID_);"><img src="img/document_add.png" alt="Novo Honorario" class="icone" /></button>';
    acoes += '<button type="button" onclick="MostrarLancamentos(_ID_);"><img src="img/folder_search.png" alt="Consultar Lancamentos" class="icone" /></button>';
    acoes += '<button type="button" onclick="EditarProcesso(_ID_);"><img src="img/mail_write.png" alt="Consultar Lancamentos" class="icone" /></button>';

	var t = $('#tabelaProcessos').DataTable();
	t.rows().remove();
	
	var total = parseInt( localStorage["processos" + ".count"] );
	for(var x = 1; x <= total; x++){
		if( !(!localStorage["processos" + "." + x + ".codigo"]) && (
			( numero_Processo && localStorage["processos" + "." + x + ".numero"] == numero_Processo ) || 
			( cliente && localStorage["processos" + "." + x + ".codigo_cliente"] == cliente ) ||
			( dataDe && dataAte ) ||
			( !numero_Processo && !cliente && !dataDe && !dataAte ) 
		)){
			t.row.add( [
				localStorage["processos" + "." + x + ".numero"],
				localStorage["processos" + "." + x + ".descricao"],
				localStorage["clientes." + localStorage["processos" + "." + x + ".codigo_cliente"] + ".nome"],
				localStorage["advogados." + localStorage["processos" + "." + x + ".codigo_advogado"] + ".nome"],
				acoes.replace(/_ID_/gi, x)
			] );
		}
	}
	t.draw();
	
}

function carregarDespesas(id){

	var acoes = '';
	acoes += '<button type="button" onclick="EditarDespesa(_ID_);"><img src="img/file_edit.png" alt="Nova Despesa" class="icone" /></button>';
	acoes += '<button type="button" onclick="ExcluirDespesa(_ID_);"><img src="img/file_delete.png" alt="Novo Honorario" class="icone" /></button>';

	var td = $("#tabelaDespesas").DataTable();
	td.rows().remove();

	var total = parseInt( localStorage["despesas" + ".count"] );
	for(var x = 1; x <= total; x++){
		if(!!localStorage["despesas." + x + ".codigo"] && localStorage["despesas." + x + ".codigo_processo"] == id ){
			td.row.add( [
                localStorage["tipos_despesa." + localStorage["despesas." + x + ".tipo_despesa"] + ".nome"],
                localStorage["advogados." + localStorage["despesas." + x + ".codigo_advogado"] + ".nome"],
                localStorage["despesas." + x + ".data"],
                localStorage["despesas." + x + ".valor"],
                localStorage["despesas." + x + ".observacao"],
				acoes.replace(/_ID_/gi, x)
			] );
		}
	}
	td.draw();
}
function carregarHonorarios(id){
	var acoes = '';
	acoes += '<button type="button" onclick="EditarHonorario(_ID_);"><img src="img/document_edit.png" alt="Nova Despesa" class="icone" /></button>';
	acoes += '<button type="button" onclick="ExcluirHonorario(_ID_);"><img src="img/document_delete.png" alt="Novo Honorario" class="icone" /></button>';

	var th = $("#tabelaHonorarios").DataTable();
	th.rows().remove();

	var total = parseInt( localStorage["honorarios" + ".count"] );
	for(var x = 1; x <= total; x++){
		if(!!localStorage["honorarios." + x + ".codigo"] && localStorage["honorarios." + x + ".codigo_processo"] == id ){
			th.row.add( [
                localStorage["tipos_tarefa." + localStorage["honorarios." + x + ".tipo_tarefa"] + ".nome"],
                localStorage["advogados." + localStorage["honorarios." + x + ".codigo_advogado"] + ".nome"],
                localStorage["honorarios." + x + ".data"],
                localStorage["honorarios." + x + ".horas"],
                localStorage["honorarios." + x + ".observacao"],
				acoes.replace(/_ID_/gi, x)
			] );
		}
	}
	th.draw();
}

function excluirDespesaDB(id){
	var processo_codigo = 0;
	if(!!localStorage["despesas." + id + ".codigo"]){
		processo_codigo = localStorage["despesas." + id + ".codigo_processo"];
		localStorage.removeItem("despesas." + id + ".codigo");
		localStorage.removeItem("despesas." + id + ".codigo_advogado");
		localStorage.removeItem("despesas." + id + ".codigo_processo");
		localStorage.removeItem("despesas." + id + ".data");
		localStorage.removeItem("despesas." + id + ".observacao");
		localStorage.removeItem("despesas." + id + ".tipo_despesa");
		localStorage.removeItem("despesas." + id + ".valor");
	}
	carregarDespesas(processo_codigo);
}
function excluirHonorarioDB(id){
	var processo_codigo = 0;
	if(!!localStorage["honorarios." + id + ".codigo"]){
		processo_codigo = localStorage["honorarios." + id + ".codigo_processo"];
		localStorage.removeItem("honorarios." + id + ".codigo");
		localStorage.removeItem("honorarios." + id + ".codigo_advogado");
		localStorage.removeItem("honorarios." + id + ".codigo_processo");
		localStorage.removeItem("honorarios." + id + ".data");
		localStorage.removeItem("honorarios." + id + ".observacao");
		localStorage.removeItem("honorarios." + id + ".tipo_tarefa");
		localStorage.removeItem("honorarios." + id + ".horas");
	}
	carregarHonorarios(processo_codigo);
}