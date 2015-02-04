(function($){
    function qstring(name) {
        name = name.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
        var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
            results = regex.exec(location.search);
        return results == null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
    }
    $.qstring = qstring;
})(jQuery);

function buscarProcesso(){
	var numero_Processo = $("#numero_Processo").val();
	var cliente = $("#cliente").val();
	var dataDe = $("#dataDe").val();
	var dataAte = $("#dataAte").val();
	
	carregarProcessos( numero_Processo, cliente, dataDe, dataAte );
}
function NovaDespesa(id){
	location.href = "cadastrarDespesa.html?proc=" + id;
}
function NovoHonorario(id){
	location.href = "cadastrarHonorario.html?proc=" + id;
}
function MostrarLancamentos(id){
	carregarDespesas(id);
	carregarHonorarios(id);
	var $d = $("#dialogDetalhes");
	$d.dialog({ 
		modal: true,
		width: "90%",
		title: "Despesas e Honorários"
	});
}
function EditarProcesso(id){
	location.href = "cadastrarProcesso.html?id=" + id;
}
function EditarDespesa(id){
	location.href = "cadastrarDespesa.html?id=" + id;
}
function EditarHonorario(id){
	location.href = "cadastrarHonorario.html?id=" + id;
}
function ExcluirDespesa(id){
	if(confirm("Deseja realmente excluir esta despesa?")){
		excluirDespesaDB(id);
	}
}
function ExcluirHonorario(id){
	if(confirm("Deseja realmente excluir esta custa de honorário?")){
		excluirHonorarioDB(id);
	}
}
function carregarProcesso(id){

	if(localStorage["processos." + id + ".codigo"] && localStorage["processos." + id + ".codigo"] == id){
		$("#processo_id").val( id );
		$("#cliente").val(localStorage["processos." + id + ".codigo_cliente"]); 
		$("#advogado").val(localStorage["processos." + id + ".codigo_advogado"]);
		$("#numero").val(localStorage["processos." + id + ".numero"]);
		$("#descricao").val(localStorage["processos." + id + ".descricao"]);
		$("#dataAbertura").val(localStorage["processos." + id + ".dataAbertura"]);
		$("#dataFechamento").val(localStorage["processos." + id + ".dataFechamento"]);
		$("#diaVencimento").val(localStorage["processos." + id + ".diaVencimento"]);
		$("#resultado").val(localStorage["processos." + id + ".resultadoCausa"]);
		$("#situacao").val(localStorage["processos." + id + ".situacao"]);
		$("#observacao").val(localStorage["processos." + id + ".observacao"]);
		$("#botao").val("Gravar Alteracoes");
	}
}
function carregarDespesa(id){
	if(localStorage["despesas." + id + ".codigo"] && localStorage["despesas." + id + ".codigo"] == id){
		$("#despesa_id").val( id );
		$("#processo").val(localStorage["despesas." + id + ".codigo_processo"]); 
		$("#advogado").val(localStorage["despesas." + id + ".codigo_advogado"]);
		$("#despesa").val(localStorage["despesas." + id + ".tipo_despesa"]);
		$("#data").val(localStorage["despesas." + id + ".data"]);
		$("#valor").val(localStorage["despesas." + id + ".valor"].replace(".",","));
		$("#observacao").val(localStorage["despesas." + id + ".observacao"]);
		$("#botao").val("Gravar Alteracoes");
	}
}
function carregarHonorario(id){
	if(localStorage["honorarios." + id + ".codigo"] && localStorage["honorarios." + id + ".codigo"] == id){
		$("#honorario_id").val( id );
		$("#processo").val(localStorage["honorarios." + id + ".codigo_processo"]); 
		$("#advogado").val(localStorage["honorarios." + id + ".codigo_advogado"]);
		$("#tarefa").val(localStorage["honorarios." + id + ".tipo_tarefa"]);
		$("#data").val(localStorage["honorarios." + id + ".data"]);
		$("#horas").val(localStorage["honorarios." + id + ".horas"]);
		$("#observacao").val(localStorage["honorarios." + id + ".observacao"]);
		$("#botao").val("Gravar Alteracoes");
	}
}

function CadastrarProcesso(){

	var padraoData = /^((0?[1-9]|[12]\d)\/(0?[1-9]|1[0-2])|30\/(0?[13-9]|1[0-2])|31\/(0?[13578]|1[02]))\/(19|20)?\d{2}$/;
	
	if (padraoData.test(document.getElementById("dataAbertura").value)==false){
		alert("Data inválida");
		return false;
	}
	if (padraoData.test(document.getElementById("dataFechamento").value)==false){
		alert("Data inválida");
		return false;
	}
	if (document.getElementById("diaVencimento") == ""){
		alert("Data inválida");
		return false;
	}
	if (document.getElementById("resultado").value == ""){
		alert("Resultado é obrigatório");
		return false;
	}
	if (document.getElementById("situacao").value == ""){
		alert("Situação é obrigatório");
		return false;
	}
	if (document.getElementById("numero").value == ""){
		alert("Numero é obrigatório");
		return false;
	}
	var sel = document.getElementById("cliente");
	if(sel[sel.selectedIndex].value == ""){
		alert("Cliente é obrigatório");
		return false;
	}
	var sel = document.getElementById("advogado");
	if(sel[sel.selectedIndex].value == ""){
		alert("Advogado é obrigatório");
		return false;
	}
	var sel = document.getElementById("resultado");
	if(sel[sel.selectedIndex].value == ""){
		alert("Resultado é obrigatório");
		return false;
	}
	var sel = document.getElementById("situacao");
	if(sel[sel.selectedIndex].value == ""){
		alert("Situação é obrigatório");
		return false;
	
	}
	
	AddProcesso(
		$("#cliente").val(), 
		$("#advogado").val(), 
		$("#numero").val(), 
		$("#descricao").val(), 
		$("#dataAbertura").val(), 
		$("#dataFechamento").val(), 
		$("#diaVencimento").val(), 
		$("#resultado").val(), 
		$("#situacao").val(), 
		$("#observacao").val(),
		$("#processo_id").val()
	);
	
	location.href = "index.html";
}
function CadastrarDespesa(){

	var padraoData = /^((0?[1-9]|[12]\d)\/(0?[1-9]|1[0-2])|30\/(0?[13-9]|1[0-2])|31\/(0?[13578]|1[02]))\/(19|20)?\d{2}$/;
	
	if (padraoData.test(document.getElementById("data").value)==false){
		alert("Data inválida");
		return false;
	}
	if (document.getElementById("data").value == ""){
		alert("Data é obrigatório");
		return false;
	}
	if (document.getElementById("valor").value == ""){
		alert("Valor é obrigatório");
		return false;
	}
	var sel = document.getElementById("processo");
	if(sel[sel.selectedIndex].value == ""){
		alert("Processo é obrigatório");
		return false;
	}

	var sel = document.getElementById("advogado");
	if(sel[sel.selectedIndex].value == ""){
		alert("Advogado é obrigatório");
		return false;
	}

	var sel = document.getElementById("despesa");
	if(sel[sel.selectedIndex].value == ""){
		alert("Tarefa é obrigatório");
		return false;
	}

	AddDespesa(
		$("#processo").val(), 
		$("#advogado").val(), 
		$("#despesa").val(), 
		$("#data").val(), 
		$("#valor").val().replace("R$ ","").replace(".","").replace(",","."), 
		$("#observacao").val(),
		$("#despesa_id").val()
	);
	location.href = "index.html";
}
function CadastrarHonorario(){

	var padraoData = /^((0?[1-9]|[12]\d)\/(0?[1-9]|1[0-2])|30\/(0?[13-9]|1[0-2])|31\/(0?[13578]|1[02]))\/(19|20)?\d{2}$/;
	
	if (padraoData.test(document.getElementById("data").value)==false){
		alert("Data inválida");
		return false;
	}
	if (document.getElementById("data").value == ""){
		alert("Data é obrigatório");
		return false;
	}
	if (document.getElementById("horas").value == ""){
		alert("Hora é obrigatório");
		return false;
	}
	var sel = document.getElementById("processo");
	if(sel[sel.selectedIndex].value == ""){
		alert("Processo é obrigatório");
		return false;
	}

	var sel = document.getElementById("advogado");
	if(sel[sel.selectedIndex].value == ""){
		alert("Advogado é obrigatório");
		return false;
	}

	var sel = document.getElementById("tarefa");
	if(sel[sel.selectedIndex].value == ""){
		alert("Tarefa é obrigatório");
		return false;
	}

	AddHonorario(
		$("#processo").val(), 
		$("#advogado").val(), 
		$("#tarefa").val(), 
		$("#data").val(), 
		$("#horas").val(), 
		$("#observacao").val(),
		$("#honorario_id").val()
	);
	location.href = "index.html";
}